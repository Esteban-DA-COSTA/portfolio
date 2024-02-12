package edu.estebandc.project.layout.projects

import io.kvision.chart.*
import io.kvision.core.Container
import io.kvision.core.UNIT
import io.kvision.html.div
import io.kvision.html.h1

fun Container.projectPage(page: Int? = null) {
    console.log("final page = $page")
    val strPage = page?.toString()
    when (strPage) {
        null -> {
            div {
                height = 500 to UNIT.px
                width = 500 to UNIT.px
                chart(
                    Configuration(
                        ChartType.DOUGHNUT,
                        listOf(
                            DataSets(
                                data = listOf(50, 30, 20),
                            )),
                        listOf("Java", "JS", "HTML"),
                        ChartOptions(
                            onClick = { event, elements, chart ->
                                console.log(chart)
                                println("elements = ${elements.size}")
                                println("event = ${event.type}")
                                elements.forEach {
                                    console.log(it.element.x)
                                    console.log(it.element.y)
                                    console.log(it.element.options)
                                }
                            },
                            plugins = PluginsOptions(
                                LegendOptions(
                                    position = Position.LEFT
                                )
                            )
                        ),
                    )
                )

            }
        }
        "1" -> {
            console.log("test")
            div {
                h1("current page is $page")
            }
        }
        else -> console.log("test2")
    }


}
