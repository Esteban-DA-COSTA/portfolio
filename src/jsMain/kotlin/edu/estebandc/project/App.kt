package edu.estebandc.project

import edu.estebandc.project.layout.projects.projectPage
import edu.estebandc.project.layout.renderHomePage
import edu.estebandc.project.layout.renderParcoursPage
import edu.estebandc.project.layout.shared.headerNav
import edu.estebandc.project.layout.skills.skillsPage
import io.kvision.*
import io.kvision.html.main
import io.kvision.i18n.DefaultI18nManager
import io.kvision.i18n.I18n
import io.kvision.panel.root
import io.kvision.routing.Routing
import io.kvision.routing.Strategy
import io.kvision.state.bind
import kotlin.js.RegExp

class App : Application() {
    init {
        require("css/navbar.css")
        require("css/card.css")
    }

    override fun start() {
        val routing = Routing.init("/", useHash = false, Strategy.ALL)
        RoutingManager.initManager()

        // Internationalization
        I18n.manager =
            DefaultI18nManager(
                mapOf(
                    "en" to require("i18n/messages-en.json"),
                    "fr" to require("i18n/messages-fr.json")
                )
            )


        root("kvapp") {
            routing
                .on({ routing.navigate("/home") })
                .on("/${Category.PARCOURS.url}", { RoutingManager.goToParcours() })
                .on("/${Category.HOME.url}", { RoutingManager.goToHomePage() })
                .on("/${Category.SKILLS.url}", { RoutingManager.goToSkillPage() })
                .on(RegExp("^${Category.SKILLS.url}/(.*)"), { match ->
                    val subCategory = Skills.urlOf(match.data[0] as String)
                    RoutingManager.goToSkillPage(subCategory)
                })
                .on("/${Category.PROJECTS.url}", { RoutingManager.goToProjectPage() })
                .on(RegExp("${Category.PROJECTS.url}/(.*)"), { match ->
                    val project = Project.urlOf(match.data[0] as String)
                    RoutingManager.goToProjectPage(project)
                })
                .resolve()

            headerNav()
            // Bind the redux state on main container
            main().bind(RoutingManager.stateStore) { state ->
                when (state.currentCategory) {
                    Category.HOME -> {
                        renderHomePage()
                    }

                    Category.SKILLS -> {
                        skillsPage(state.currentSubCategory)
                    }

                    Category.PROJECTS -> {
                        projectPage(state.currentProject, routing)
                    }
                    Category.PARCOURS -> renderParcoursPage()
                }
            }
        }
    }
}

fun main() {
    startApplication(
        ::App,
        module.hot,
        BootstrapModule,
        BootstrapCssModule,
        RichTextModule,
        ToastifyModule,
        BootstrapIconsModule,
        FontAwesomeModule,
        TabulatorModule,
        TabulatorCssBootstrapModule,
        CoreModule,
    )
}
