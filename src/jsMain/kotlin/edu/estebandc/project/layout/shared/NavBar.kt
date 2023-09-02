package edu.estebandc.project.layout.shared

import io.kvision.core.Container
import io.kvision.dropdown.dropDown
import io.kvision.i18n.tr
import io.kvision.navbar.NavbarType
import io.kvision.navbar.nav
import io.kvision.navbar.navLink
import io.kvision.navbar.navbar

fun Container.headerNav() {
    navbar(label = "Navigation", type = NavbarType.FIXEDTOP) {
        nav {
            navLink(tr("Home"), icon = "fas fa-house", url = "/#/home")
            dropDown(tr("Skills"), icon = "fa fa-tags", forNavbar = true, elements = listOf("ALL" to "/#/skills/all", tr("Skill 1") to "/#/skills/1"))

        }
    }
}