package edu.estebandc.project

import edu.estebandc.project.layout.homePage
import edu.estebandc.project.layout.shared.headerNav
import edu.estebandc.project.layout.skills.skillsHomePage
import io.kvision.*
import io.kvision.html.div
import io.kvision.html.header
import io.kvision.html.main
import io.kvision.i18n.DefaultI18nManager
import io.kvision.i18n.I18n
import io.kvision.panel.root
import io.kvision.routing.Routing
import io.kvision.state.bind

class App : Application() {
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
                .on(Pages.HOME.url, { RoutingManager.goToHomePage() })
                .on("${Pages.SKILLS.url}/all", { RoutingManager.goToSkillHomePage() })
                .on("${Pages.SKILLS.url}/1", { div("toto") })
                .resolve()

            header { headerNav() }

            main().bind(RoutingManager.stateStore) { state ->
                when(state.currentPage) {
                    Pages.HOME -> {
                        homePage()
                    }
                    Pages.SKILLS -> {
                        skillsHomePage()
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
