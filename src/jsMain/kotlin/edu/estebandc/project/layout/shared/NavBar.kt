package edu.estebandc.project.layout.shared

import io.kvision.core.Container
import io.kvision.dropdown.dropDown
import io.kvision.i18n.tr
import io.kvision.navbar.Navbar
import io.kvision.navbar.nav
import io.kvision.navbar.navLink
import io.kvision.navbar.navbar

fun Container.headerNav(): Navbar {
    return navbar(tr("Home"), link = "#/home") {
        nav(true) {
            dropDown(
                tr("Skills"), icon = "fa fa-tags", forNavbar = true, arrowVisible = false, elements = listOf(
                    "ALL" to "#/skills/all",
                    "Java" to "#/skills/java"
                )
            )
            dropDown(
                tr("Projects"), icon = "fa fa-briefcase", forNavbar = true, elements = listOf(
                    "ALL" to "#/projects/all",
                    "Project 1" to "#/projects/1"
                )
            )
        }

    }
}