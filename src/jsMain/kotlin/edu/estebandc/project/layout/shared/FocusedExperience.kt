package edu.estebandc.project.layout.shared

import io.kvision.html.*
import io.kvision.panel.StackPanel
import io.kvision.panel.VPanel

class FocusedExperience(
    name: String,
    start: String,
    end: String?,
    type: ExperienceType,
    certifOrCompany: String,
    content: VPanel.() -> Unit
    ) : VPanel() {
    init {
        h2("$name - ${type.name}")
        h4("$start - ${end ?: "today"} | $certifOrCompany")
        content()
    }
}

fun StackPanel.focusedExperience(
    name: String,
    start: String,
    end: String? = null,
    type: ExperienceType,
    certifOrCompany: String,
    content: VPanel.() -> Unit,
) = FocusedExperience(name, start, end, type, certifOrCompany, content).also { add(it) }