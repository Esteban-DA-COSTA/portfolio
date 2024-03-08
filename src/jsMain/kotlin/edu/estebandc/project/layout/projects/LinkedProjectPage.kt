package edu.estebandc.project.layout.projects

import edu.estebandc.project.Skills
import edu.estebandc.project.layout.shared.projectSummary
import io.kvision.core.Container
import io.kvision.html.div
import io.kvision.routing.Routing

fun Container.linkedProjectPage(routing: Routing) = div {
    projectSummary(
        "Linked",
        listOf(
            "Linked est un ensemble d'applications permettant aux commerces du quartier de Ville-Bourbon à Montauban de communiquer avec leurs clientèles.",
            "Il s'agit d'un \"réseau social de quartier\""
        ),
        mapOf(
            Skills.JAVA to 25,
            Skills.API_REST to 25,
            Skills.ANGULAR to 5,
            Skills.BASE_DE_DONNEES to 10,
            Skills.ANDROID to 10,
            Skills.GESTION_PROJET to 20,
            Skills.COMMUNICATION_EN_ANGLAIS to 5
        ),
        routing
    )
}