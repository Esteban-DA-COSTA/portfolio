package edu.estebandc.project.layout.shared

import edu.estebandc.project.SubCategory
import io.kvision.chart.*
import io.kvision.chart.Position
import io.kvision.core.*
import io.kvision.html.div
import io.kvision.html.h1
import io.kvision.html.p
import io.kvision.panel.hPanel
import io.kvision.panel.vPanel
import io.kvision.routing.Routing

fun Container.projectSummary(
    title: String,
    description: List<String>,
    skills: Map<SubCategory, Int>,
    routing: Routing,
): Container {
    return vPanel {
        background = Background(Color.hex(0xA9B6EC))
        div {
            height = 100 to UNIT.px
        }
        hPanel(justify = JustifyContent.SPACEAROUND) {
            height = 30 to UNIT.vh

            div {
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
                                    position = Position.RIGHT
                                ),
                                title = TitleOptions(
                                    display = true,
                                    text = listOf("Organisation des compétences (en %)"),
                                    position = Position.TOP
                                ),
                            )
                        )
                    )
                )
            }
        }
    }
}