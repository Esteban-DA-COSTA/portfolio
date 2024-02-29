package edu.estebandc.project.layout.skills

import edu.estebandc.project.SubCategory
import io.kvision.core.Container
import io.kvision.html.div
import io.kvision.html.h1

fun Container.skillsPage(subCategory: SubCategory?) {
    console.log("subCategory = $subCategory")
    when (subCategory) {
        null -> {
            div {
                h1("Skills Home page")
            }
        }

        SubCategory.JAVA -> {
            div {
                h1("Current subCategory is ${subCategory.name}")
            }
        }
        else -> TODO()
    }

}