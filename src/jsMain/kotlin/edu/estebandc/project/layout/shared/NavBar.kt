package edu.estebandc.project.layout.shared

import edu.estebandc.project.Category
import edu.estebandc.project.Project
import edu.estebandc.project.RoutingManager
import edu.estebandc.project.SubCategory
import io.kvision.core.*
import io.kvision.dropdown.dropDown
import io.kvision.html.image
import io.kvision.i18n.tr
import io.kvision.navbar.*

fun Container.headerNav(): Navbar {
    return navbar(className = "navbar", type = NavbarType.FIXEDTOP, dataNavigo = true) {
        removeCssClass("bg-body-tertiary")
        nav { // Logo and home links
            image("/images/logo.jpg") {
                cursor = Cursor.POINTER
                width = 53 to UNIT.px
                height = 53 to UNIT.px
                onClick {
                    RoutingManager.goToHomePage()
                }
            }
            navLink("Esteban DA COSTA", "/home") {
                paddingTop = 1 to UNIT.rem
            }
        }

        nav { // Centered nav with site navigation
            dropDown(
                "Parcours", forNavbar = true, elements = listOf(
                    "Mon Parcours" to "/mon_parcours"
                )
            )
            val skillsList = mutableListOf("ALL" to "/${Category.SKILLS.url}")
            SubCategory.entries.map {
                skillsList.add(it.capitalize() to "/${Category.SKILLS.url}/${it.url}")
            }
            dropDown(
                tr("Skills"), forNavbar = true, elements = skillsList
            )
            val projectList = mutableListOf("ALL" to "/${Category.PROJECTS.url}")
            Project.entries.map {
                projectList.add(it.capitalize() to "/${Category.PROJECTS.url}/${it.url}")
            }
            dropDown(
                tr("Projects"), forNavbar = true, elements = projectList
            )
        }

        nav { // Right nav with contact and language settings
            navLink("Contact")
            navLink("Langue")
        }

    }
}