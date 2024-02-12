package edu.estebandc.project.layout.shared

import io.kvision.core.*
import io.kvision.html.Align
import io.kvision.html.h1
import io.kvision.html.h3
import io.kvision.panel.VPanel
import io.kvision.panel.vPanel

fun Container.section(header: String, subHeader: String? = null, cssId: String? = null, init: VPanel.() -> Unit): Container {
    return vPanel(
        className = "section",
    ) {
        cssId?.let {
            id = cssId
        }
        h1(header, align = Align.CENTER) {
            background = Background(Color.name(Col.WHITE))
            marginBottom = 0 to UNIT.px
        }
        subHeader?.let {
            h3(it, align = Align.CENTER) {
                background = Background(Color.name(Col.WHITE))
            }
        }
        vPanel {
            paddingLeft = 10 to UNIT.vw
            paddingRight = 10 to UNIT.vw
            init()
        }
    }
}