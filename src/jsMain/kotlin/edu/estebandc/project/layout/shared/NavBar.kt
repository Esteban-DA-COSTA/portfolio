package edu.estebandc.project.layout.shared

import edu.estebandc.project.*
import io.kvision.core.Container
import io.kvision.core.Cursor
import io.kvision.core.UNIT
import io.kvision.core.onClick
import io.kvision.dropdown.DD
import io.kvision.dropdown.dropDown
import io.kvision.html.image
import io.kvision.navbar.*

fun Container.headerNav(): Navbar {
    return navbar(className = "navbar", type = NavbarType.STICKYTOP, dataNavigo = true) {
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
            navLink("Mon parcours", "/${Category.PARCOURS.url}")

            val skillsList = mutableListOf("ALL" to "/${Category.SKILLS.url}")
            skillsList.add("Separator" to DD.SEPARATOR.option)
            skillsList.add("Compétences techniques" to DD.HEADER.option)
            Skills.entries.map {
                if (it.type == SkillType.TECHNIQUE)
                    skillsList.add(it.capitalize() to "/${Category.SKILLS.url}/${it.url}")
            }
            skillsList.add("Separator" to DD.SEPARATOR.option)
            skillsList.add("Compétences humaines" to DD.HEADER.option)
            Skills.entries.map {
                if (it.type == SkillType.HUMAIN)
                    skillsList.add(it.capitalize() to "/${Category.SKILLS.url}/${it.url}")
            }
            dropDown(
                "Compétences", forNavbar = true, elements = skillsList
            )
            val projectList = mutableListOf("ALL" to "/${Category.PROJECTS.url}")
            projectList.add("Separator" to DD.SEPARATOR.option)
            Project.entries.map {
                projectList.add(it.capitalize() to "/${Category.PROJECTS.url}/${it.url}")
            }
            dropDown(
                "Réalisations", forNavbar = true, elements = projectList
            )
        }

        nav { // Right nav with contact and language settings
            navLink("Contact")
        }
    }
}