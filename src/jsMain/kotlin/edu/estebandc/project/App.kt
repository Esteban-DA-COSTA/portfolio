package edu.estebandc.project

import edu.estebandc.project.layout.homePage
import edu.estebandc.project.layout.projects.projectPage
import edu.estebandc.project.layout.shared.headerNav
import edu.estebandc.project.layout.skills.skillsPage
import io.kvision.*
import io.kvision.html.header
import io.kvision.html.main
import io.kvision.i18n.DefaultI18nManager
import io.kvision.i18n.I18n
import io.kvision.panel.root
import io.kvision.routing.Routing
import io.kvision.state.bind
import kotlin.js.RegExp

class App : Application() {
    init {
        require("css/navbar.css")
    }

    override fun start() {
        val routing = Routing.init()
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
                .on({ routing.navigate("home") })
                .on(Category.HOME.url, { RoutingManager.goToHomePage() })
                .on("${Category.SKILLS.url}/all", { RoutingManager.goToSkillPage() })
                .on("${Category.PROJECTS.url}/all", { RoutingManager.goToProjectPage() })
                .on(RegExp("${Category.SKILLS.url}/(.*)"), { match ->
                    console.log(match.data[0])
                    val subCategory = SubCategory.urlOf(match.data[0])
                    console.log(subCategory)
                    RoutingManager.goToSkillPage(subCategory)
                })
                .on(RegExp("${Category.PROJECTS.url}/([0-9]*)"), { match -> RoutingManager.goToProjectPage(match.data[0])
                })
                .resolve()

            header { headerNav() }

            // Bind the redux state on main container
            main().bind(RoutingManager.stateStore) { state ->
                when(state.currentCategory) {
                    Category.HOME -> {
                        homePage()
                    }
                    Category.SKILLS -> {
                        console.log("state = ${state.currentPage}")
                        skillsPage(state.currentSubCategory)
                    }

                    Category.PROJECTS -> {
                        console.log("state = ${state.currentPage}")
                        projectPage(state.currentPage)
                    }
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
        CoreModule
    )
}
