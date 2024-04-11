package edu.estebandc.project.layout

import edu.estebandc.project.Category
import edu.estebandc.project.Project
import edu.estebandc.project.Skills
import edu.estebandc.project.layout.shared.ExperienceType
import edu.estebandc.project.layout.shared.experience
import edu.estebandc.project.layout.shared.focusedExperience
import edu.estebandc.project.layout.shared.seeAlso
import io.kvision.core.*
import io.kvision.html.p
import io.kvision.panel.*
import io.kvision.utils.px

fun Container.renderParcoursPage(): HPanel {
    var panel = StackPanel()
    return hPanel(justify = JustifyContent.SPACEAROUND) {
        background = Background(color = Color.hex(0xF2F2F2))
        vPanel(alignItems = AlignItems.CENTER) {
            width = 40 to UNIT.perc
            experience(
                "Alternance Développeur",
                "09-2022",
                null,
                ExperienceType.STAGE,
                "Capgemini"
            ) { panel.activeIndex = 0 }
            experience(
                "Stage Développeur",
                "03-2022",
                "09-2022",
                ExperienceType.STAGE,
                "Capgemini"
            ) { panel.activeIndex = 1 }
            experience(
                "Cursus Ingénieur informatique",
                "09-2019",
                null,
                ExperienceType.CURSUS,
                "ESIEA"
            ) { panel.activeIndex = 2 }
            experience(
                "Diplôme DUT",
                "07-2019",
                "07-2019",
                ExperienceType.DIPLOME,
                "IUT Blagnac"
            ) { panel.activeIndex = 3 }
            experience(
                "Cursus DUT informatique",
                "09-2017",
                "07-2019",
                ExperienceType.CURSUS,
                "IUT Blagnac"
            ) { panel.activeIndex = 4 }
            experience(
                "BAC Scientifique",
                "07-2017",
                "07-2017",
                ExperienceType.DIPLOME,
                "Lycée Castelsarrasin"
            ) { panel.activeIndex = 5 }

        }
        panel = stackPanel(activateLast = false) {
            margin = 20.px
            padding = 5.px
            borderRadius = 10.px
            background = Background(color = Color.name(Col.WHITE))
            width = 60 to UNIT.perc
            height = 100 to UNIT.perc
            focusedExperience(
                "Alternance Développeur",
                "09-2022",
                null,
                ExperienceType.STAGE,
                "Capgemini",
            ) {
                p(
                    "Pour la fin de mon cursus d'ingénieur, j'ai fait deux ans d'<b>alternance</b> dans l'entreprise Capgemini sur Toulouse en tant que <b>développeur full stack</b>.",
                    rich = true
                )
                p("Tout au long de ces deux ans, j'ai pu travaillé sur plusieurs projets notamment pour Airbus.")
                p(
                    "Le premier projet sur lequel j'ai travaillé fut le projet <a href='${Category.PROJECTS.url}/${Project.TSAS.url}'>TSAS</a>, un ensemble d'outil pour aider les techniciens airbus sur les tests de leurs avions.<br/>" +
                            "Le second projet fut le projet PATS, toujours dans le milieu des essais en vol pour Airbus. Mon travail chez PATS fut l'implémentation d'un outil pour aider à l'investigation des incidents de l'équipe.",
                    rich = true
                )
                p("Mon expérience pendant cette alternance fut très positif, c'est pourquoi je suis actuellement en négociation avec Capgémini pour continuer avec eux après l'obtention de mon diplôme d'ingénieur.")
                seeAlso(
                    listOf(Project.TSAS),
                    listOf(
                        Skills.JAVA,
                        Skills.ANGULAR,
                        Skills.API_REST,
                        Skills.REDACTION,
                        Skills.COMMUNICATION_EN_ANGLAIS,
                        Skills.AUTO_FORMATION
                    )
                )
            }
            focusedExperience(
                "Stage Développeur",
                "03-2022",
                "09-2022",
                ExperienceType.STAGE,
                "Capgemini",
            ) {
                p(
                    "J'ai effectué un <b>stage</b> de 6 mois dans l'entreprise Capgemini sur Toulouse pour mon cursus d'ingénieur.",
                    rich = true
                )
                p(
                    "Le stage s'est déroulé dans le département de développement de Capgemini. J'ai travaillé le projet <a href='${Category.PROJECTS.url}/${Project.EREC.url}'>eRec</a>, qui est un outil pour le recrutement de nouveaux collaborateurs.<br/>" +
                            "Mes principales missions dessus fut l'implémentation de nouvelles fonctionnalités comme l'ajout de spécifications de besoins(Voir page dédiée).",
                    rich = true
                )
                p("Le stage fut mon premier contact avec Capgemini, et l'ayant apprécié, j'ai décidé de continué l'alternance de deux ans qui devait suivre le stage chez eux.")
                seeAlso(
                    listOf(Project.EREC),
                    listOf(
                        Skills.C_SHARP,
                        Skills.ANGULAR,
                        Skills.API_REST,
                        Skills.BASE_DE_DONNEES,
                        Skills.AUTO_FORMATION
                    )
                )
            }
            focusedExperience(
                "Cursus Ingénieur informatique",
                "09-2019",
                null,
                ExperienceType.CURSUS,
                "ESIEA",
            ) {
                p("Après avoir obtenu mon DUT informatique, je me suis lancé dans un cursus d'ingénieur chez Intech. L'école a ensuit fusionnée avec l'entité ESIEA.")
                p(
                    "J'ai choisi ce cursus pour son originalité d'enseignement. Son objectif, contrairement à d'autres cursus d'informatique, est de mettre dès le début du cursus les élèves en relation avec les entreprises.<br/>" +
                            "A ce titre, chaque semestre, j'ai pu développer un projet pour une entreprise ou une association pour me former à la fois techniquement et humainement.",
                    rich = true
                )
                p("Cette pédagogie me fut très profitable lors de mes futurs travaux chez Capgemini, surtout sur le plan humain. J'ai pu être à l'aise aussi bien lors de mes échanges avec ma hiérarchie qu'avec les clients avec qui j'ai travaillés.")
                seeAlso(
                    listOf(
                        Project.LINKED,
                        Project.KLASSIFILE
                    ),
                    listOf(
                        Skills.C_SHARP,
                        Skills.ANDROID,
                        Skills.ANGULAR,
                        Skills.API_REST,
                        Skills.BASE_DE_DONNEES,
                        Skills.JAVA,
                        Skills.REDACTION,
                        Skills.COMMUNICATION_EN_ANGLAIS,
                        Skills.AUTO_FORMATION,
                        Skills.GESTION_PROJET
                    )
                )
            }
            focusedExperience(
                "Diplôme DUT",
                "07-2019",
                "07-2019",
                ExperienceType.DIPLOME,
                "IUT Blagnac",
            ) {

            }
            focusedExperience(
                "Cursus DUT informatique",
                "09-2017",
                "07-2019",
                ExperienceType.CURSUS,
                "IUT Blagnac",
            ) {
                p("Juste après mon BAC, j'ai commencé un cursus d'informatique à l'IUT de Blagnac.")
                p(
                    "Etant un IUT, la pédagogie de l'école fut similaire à de l'enseignement lycée.<br/>" +
                            "Malgré tout, j'ai énormément apprécié les deux ans que j'y ai passé grâce aux enseignants qui nous suivaient assidument, ce qui m'a permis de développer mes compétences au delà de ce que demandait le diplôme." +
                            "De plus, ces derniers nous accordaient beaucoup de place dans l'institut, en proposant chaque semestre des réunions avec les élèves pour discuter des problèmes rencontrés et des amélioration que l'école pouvait apporter",
                    rich = true
                )
                seeAlso(
                    listOf(Project.FLOP_EDT_MOBILE),
                    listOf(
                        Skills.JAVA,
                        Skills.ANDROID,
                        Skills.BASE_DE_DONNEES,
                        Skills.API_REST,
                        Skills.AUTO_FORMATION,
                    )
                )
            }
            focusedExperience(
                "BAC Scientifique",
                "07-2017",
                "07-2017",
                ExperienceType.DIPLOME,
                "Lycée Castelsarrasin",
            ) { }
        }
    }
}