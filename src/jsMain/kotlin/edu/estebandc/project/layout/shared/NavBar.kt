package edu.estebandc.project.layout.shared

import io.kvision.core.Container
import io.kvision.dropdown.dropDown
import io.kvision.i18n.tr
import io.kvision.navbar.*

fun Container.headerNav(): Navbar {
    return navbar {
        nav {
            navLink(label = tr("Home"), icon = "fas fa-house", url = "home", dataNavigo = true)
            dropDown(tr("Skills"), icon = "fa fa-tags", forNavbar = true, elements = listOf(
                "ALL" to "#/skills/all",
                tr("Skill 1") to "#/skills/1")
            )
        }
    }
}