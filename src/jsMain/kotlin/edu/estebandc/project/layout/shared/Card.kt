package edu.estebandc.project.layout.shared

import io.kvision.core.*
import io.kvision.html.h2
import io.kvision.html.h3
import io.kvision.html.image
import io.kvision.panel.VPanel
import io.kvision.panel.hPanel
import io.kvision.panel.vPanel

class Card(
    header: String,
    subHeader: String?,
    img: ResString? = null,
    alignement: CardAlignement = CardAlignement.LEFT,
    init: (VPanel.() -> Unit)? = null,
) : VPanel(className = "card") {
    private val container = hPanel(
        justify = JustifyContent.SPACEBETWEEN
    ) {
        flexDirection = FlexDirection.ROW
    }


    init {
        when (alignement) {
            CardAlignement.LEFT -> {
                container.add(contentPanel(header, subHeader, content = init))
                imgPanel(img)?.let { container.add(it) }
            }

            CardAlignement.RIGHT -> {
                imgPanel(img)?.let { container.add(it) }
                container.add(contentPanel(header, subHeader, init))
            }
        }
    }

    private fun imgPanel(img: ResString?): VPanel? {
        return img?.let {
            vPanel {
                image(it)
            }
        }
    }

    private fun contentPanel(
        header: String,
        subHeader: String?,
        content: (VPanel.() -> Unit)?,
    ): VPanel {
        return vPanel {
            h2(header)
            subHeader?.let {
                h3(it)
            }
            content?.invoke(this)
        }
    }
}

fun Container.card(
    header: String,
    subHeader: String? = null,
    img: ResString? = null,
    alignement: CardAlignement = CardAlignement.LEFT,
    init: (VPanel.() -> Unit)? = null,
): Card {
    return Card(header, subHeader, img, alignement, init).also { add(it) }
}


enum class CardAlignement {
    LEFT,
    RIGHT
}