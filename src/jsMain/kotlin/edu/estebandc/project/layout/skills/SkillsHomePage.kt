package edu.estebandc.project.layout.skills

import edu.estebandc.project.Skills
import io.kvision.core.Container
import io.kvision.html.div
import io.kvision.html.h1

fun Container.skillsPage(subCategory: Skills?) {
    console.log("subCategory = $subCategory")
    when (subCategory) {
        null -> {
            div {
                h1("Skills Home page")
            }
        }
        Skills.JAVA -> javaSkillPage()
        Skills.ANDROID -> androidSkillPage()
        Skills.GESTION_PROJET -> projectManagmentSkillPage()
        Skills.ANGULAR -> angularSkillPage()
        Skills.AUTO_FORMATION -> selfStudySkillPage()
        Skills.C_SHARP -> cSharpSkillPage()
        Skills.API_REST -> apiSkillPage()
        Skills.REDACTION -> redactionSkillPage()
        else -> TODO()
    }

}