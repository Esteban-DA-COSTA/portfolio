package edu.estebandc.project.layout.shared

import edu.estebandc.project.RoutingManager
import io.kvision.core.*
import io.kvision.dropdown.dropDown
import io.kvision.html.image
import io.kvision.i18n.tr
import io.kvision.navbar.*

fun Container.headerNav(): Navbar {
    return navbar(className = "navbar", type = NavbarType.FIXEDTOP) {
        removeCssClass("bg-body-tertiary")
        nav {
            image("images/logo.jpg") {
                cursor = Cursor.POINTER
                width = 53 to UNIT.px
                height = 53 to UNIT.px
                onClick {
                    RoutingManager.goToHomePage()
                }
            }
            navLink("Esteban DA COSTA", "#/home") {
                paddingTop = 1 to UNIT.rem
            }
        }

        nav {
            dropDown(
                "Parcours", forNavbar = true, elements = listOf(
                    "Mon Parcours" to "#/mon_parcours"
                )
            )
            dropDown(
                tr("Skills"), icon = "fa fa-tags", forNavbar = true, elements = listOf(
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

        nav {
            navLink("Contact")
            navLink("Langue")
        }

    }
}