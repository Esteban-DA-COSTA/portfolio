package edu.estebandc.project.layout

import io.kvision.core.Background
import io.kvision.core.BgRepeat
import io.kvision.core.Container
import io.kvision.core.UNIT
import io.kvision.html.Div
import io.kvision.html.div
import io.kvision.html.h1
import io.kvision.html.image

fun Container.homePage(): Div {

    return div {
        div {
            background = Background(image = "images/custom-software-development.jpg", repeat = BgRepeat.NOREPEAT)
            width = 100 to UNIT.vw
            height = 100 to UNIT.vh

        }
        div {
            h1("Home page")
        }
    }
}