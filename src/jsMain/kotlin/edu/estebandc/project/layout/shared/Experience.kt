package edu.estebandc.project.layout.shared

import io.kvision.core.*
import io.kvision.html.p
import io.kvision.panel.HPanel
import io.kvision.panel.vPanel
import io.kvision.utils.px

class Experience(
    name: String,
    start: String,
    end: String?,
    type: ExperienceType,
    certifOrCompany: String,
    onClick: (() -> Unit)?
) : HPanel(className = "experience") {
    init {
        margin = 10.px
        if (onClick != null) {
            cursor = Cursor.POINTER
            onClick {
                onClick()
            }
        }
        vPanel {
            justifyContent = JustifyContent.CENTER
            alignItems = AlignItems.CENTER
            p(start)
            p(end ?: "today")
        }

        vPanel {
            padding = 10.px
            marginLeft = 10.px
            borderRadius = 10.px
            border = Border(1.px, BorderStyle.SOLID, Color.name(Col.LIGHTGRAY))
            p("<b>$name - ${type.name}</b>", rich = true)
            p(certifOrCompany)
        }
    }
}

fun Container.experience(
    name: String,
    start: String,
    end: String?,
    type: ExperienceType,
    certifOrCompany: String,
    onClick: (() -> Unit)? = null
) = Experience(name, start, end, type, certifOrCompany, onClick).also { add(it) }

enum class ExperienceType {
    DIPLOME,
    STAGE,
    CURSUS
}