package edu.estebandc.project.layout.shared

import edu.estebandc.project.Category
import edu.estebandc.project.Project
import edu.estebandc.project.Skills
import io.kvision.core.Container
import io.kvision.core.JustifyContent
import io.kvision.html.div
import io.kvision.html.h6
import io.kvision.html.li
import io.kvision.html.ul
import io.kvision.panel.hPanel

fun Container.seeAlso(realisations: List<Project>, skills: List<Skills>) {
    hPanel(justify = JustifyContent.SPACEAROUND) {
        div {
            h6("Réalisations:")
            ul {
                realisations.forEach {
                    li("<a href='${Category.PROJECTS.url}/${it.url}'>${it.capitalize()}</a>", rich = true)

                }
            }
        }
        div {
            h6("Compétences:")
            ul {
                skills.forEach {
                    li("<a href='${Category.SKILLS.url}/${it.url}'>${it.capitalize()}</a>", rich = true)

                }
            }
        }
    }
}