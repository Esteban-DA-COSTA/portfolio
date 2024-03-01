package edu.estebandc.project.layout.shared

import edu.estebandc.project.SkillLevel
import edu.estebandc.project.SkillType
import edu.estebandc.project.Skills
import io.kvision.chart.*
import io.kvision.chart.Position
import io.kvision.core.*
import io.kvision.html.div
import io.kvision.html.h1
import io.kvision.html.h4
import io.kvision.html.p
import io.kvision.panel.hPanel
import io.kvision.panel.vPanel
import io.kvision.routing.Routing

fun Container.projectSummary(
    title: String,
    description: List<String>,
    skills: Map<Skills, Int>,
    routing: Routing,
): Container {
    return vPanel {
        background = Background(Color.hex(0xD6F0FF))
        hPanel(justify = JustifyContent.SPACEAROUND) {
            height = 20 to UNIT.vh
            margin = 30 to UNIT.px

            div {
                maxWidth = 1035 to UNIT.px
                h1(title)
                description.forEach {
                    p(it)
                }
            }
            vPanel(justify = JustifyContent.CENTER) {
                chart(
                    configuration = Configuration(
                        ChartType.DOUGHNUT,
                        listOf(
                            DataSets(
                                data = skills.values.toList()
                            )
                        ),
                        skills.keys.map {
                            it.capitalize()
                        },
                        ChartOptions(
                            responsive = false,
                            onClick = { _, elements, _ ->
                                val skill = skills.toList()[elements[0].index.toInt()]
                                routing.navigate("/skills/${skill.first.url}")
                            },
                            plugins = PluginsOptions(
                                LegendOptions(
                                    position = Position.RIGHT,
                                    title = LegendTitleOptions(display = true, text = "Organisation (en %)", color = Color.name(Col.BLACK)),
                                    labels = LegendLabelOptions(color = Color.name(Col.BLACK))
                                ),
                            )
                        )
                    )
                )
            }
        }
    }
}

fun Container.skillSummary(
    title: String,
    description: List<String>,
    type: SkillType,
    niveau: SkillLevel
): Container {
    return vPanel(justify = JustifyContent.CENTER) {
        val bgColor = if (type == SkillType.TECHNIQUE) Color.hex(0xFFD7C6) else Color.hex(0xD6F9EC)
        background = Background(bgColor)
        hPanel(justify = JustifyContent.SPACEAROUND) {
            height = 20 to UNIT.vh
            margin = 30 to UNIT.px

            div {
                maxWidth = 1035 to UNIT.px
                h1(title)
                description.forEach {
                    p(it)
                }
            }

            vPanel(justify = JustifyContent.CENTER) {
                h4("Informations")
                p("<b>Type:</b> ${type.name}", rich = true)
                p("<b>Niveau:</b> ${niveau.name}", rich = true)
            }
        }
    }
}