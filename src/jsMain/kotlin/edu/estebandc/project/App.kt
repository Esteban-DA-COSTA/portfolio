package edu.estebandc.project

import edu.estebandc.project.layout.homePage
import edu.estebandc.project.layout.shared.headerNav
import edu.estebandc.project.layout.skills.skillsHomePage
import io.kvision.*
import io.kvision.html.div
import io.kvision.i18n.DefaultI18nManager
import io.kvision.i18n.I18n
import io.kvision.panel.root
import io.kvision.routing.Routing

class App : Application() {
    override fun start() {
        val routing = Routing.init()

        I18n.manager =
            DefaultI18nManager(
                mapOf(
                    "en" to require("i18n/messages-en.json"),
                    "fr" to require("i18n/messages-fr.json")
                )
            )

        root("kvapp") {
            routing
                .on("/home", { homePage() })
                .on("/skills/all", { skillsHomePage() })
                .on("/skills/1", { div("toto") })
                .resolve()
            headerNav()
            routing.navigate("/home")
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
