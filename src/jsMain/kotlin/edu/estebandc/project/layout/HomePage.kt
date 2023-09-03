package edu.estebandc.project.layout

import io.kvision.core.Container
import io.kvision.html.Div
import io.kvision.html.div
import io.kvision.html.h1

fun Container.homePage(): Div {
    return div {
        h1("Home page")
    }
}