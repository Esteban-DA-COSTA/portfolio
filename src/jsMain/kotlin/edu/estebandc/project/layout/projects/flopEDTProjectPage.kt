package edu.estebandc.project.layout.projects

import edu.estebandc.project.Skills
import edu.estebandc.project.layout.shared.card
import edu.estebandc.project.layout.shared.projectSummary
import edu.estebandc.project.layout.shared.section
import io.kvision.core.Container
import io.kvision.html.*
import io.kvision.routing.Routing

fun Container.flopEDTProjectPage(routing: Routing) {
    div {
        projectSummary(
            "Application mobile FlOp EDT",
            listOf(
                "Cette réalisation a été faite lors de mon cursus de DUT informatique à Blagnac. Il s'agissait pour tous les élèves de réaliser un projet réel sur 6 mois.",
                "Ce projet avait pour ambition de d'implémenter une version Android de l'outil de gestion de projet utilisé par l'école."
            ),
            mapOf(
                Skills.ANDROID to 35,
                Skills.JAVA to 35,
                Skills.BASE_DE_DONNEES to 20,
                Skills.API_REST to 10
            ), routing
        )
        section("Le projet") {
            card("Le contexte") {
                p(
                    "L'IUT Informatique de Blagnac utilise un logiciel développé par ses enseignants pour gérer l'emploi du temps des élèves et du corps pédagogique. Cet outil appelé <i>FlOp!EDT</i> permet de générer les emplois du temps par semaine des élèves et professeurs en analysant les cours à avoir, les créneaux déjà planifiés ainsi que les disponibilités et préférences des utilisateurs.",
                    rich = true
                )
                p("Aujourd'hui cet outil n'est plus exclusif au DUT de Blagnac.")
                p("L'objectif de notre projet fut de développer une version mobile de cet outil en utilisant l'API REST mis en place par l'existant pour permettre aux utilisateurs de consulter rapidement les cours.")
                p("Notre application se devait de suivre l'ergonomie générale existant du site internet mis à disposition des élèves mais aussi de mettre en place un ensemble de systèmes pour améliorer l'expérience utilisateur sur mobile.")
                p("Parmi ces systèmes on peut retrouver des AppWidget ou les notifications push.")
                p(
                    "<i>FlOp!EDT</i> étant développé et utilisé par l'IUT de Blagnac, notre client fut donc le corps enseignent de ce dernier. De plus, j'ai réalisé ce projet avec un camarade de promotion.",
                    rich = true
                )
            }
        }
        section("La réalisation") {
            card("L'analyse de l'existant") {
                p("La réalisation du projet se fit en plusieurs étapes dont la première vu l'analyse de l'existant. Par ce travail, nous avons appris que ce dernier se divisait en trois parties :")
                ul {
                    li("Une boite noire utilisant python")
                    li("Une API REST")
                    li("Un site web qui aujourd'hui utilise React")
                }
                h6("La boite noire python")
                p("La boite noire python est le coeur de FlOp!EDT, il s'agit du composant s'occupant de générer l'emploi du temps. C'est une partie de l'outil dont nous n'avions pas à nous occuper.")
                h6("L'API REST")
                h6("La boite noire python")
                p("L'API REST qui serait notre moyen de communication entre l'outil et notre application mobile")
                h6("Le site web")
                p(
                    "Le site web qui correspond à l'emploi du temps du DUT disponible <a href='https://flopedt.iut-blagnac.fr/fr/edt/INFO/'>ici</a>",
                    rich = true
                )
            }

            card("Les besoins clients") {
                p("Une fois l'existant analysé et une compréhension primaire de l'outil acquise, nous nous sommes lancé dans le développement.")
                p("Pour des raisons budgétaire, nous avons décidé de ne développer que pour Android en utilisant le langage de programmation Java.")
                p("De plus, en discutant avec les \"clients\", il nous a été demandé de permettre l'utilisation de l'application non seulement pour les étudiants et professeurs du cursus informatiques mais aussi des autres cursus comme \"réseaux & télécommunications\" par exemple vu que l'implémentation de ce système était en cours sur l'outil principal.")
            }

            card("L'implémentation") {
                p("Lors du développement, nous avons pu implémenter l'affichage ainsi que la gestion de l'emploi du temps pour le cursus informatique. Malheureusement, nous n'avions pu connecter tous les cursus à notre application.")
                p("Pour l'affichage de l'emploi du temps, nous avions développé un système d'affichage en portrait qui affichait la journée en cours ou celle du lendemain et un affichage en paysage permettant de voir toute la semaine.")
                p("De plus, pour simplifier l'utilisation, il était possible d'avoir une AppWidget sur son écran d'accueil pour avoir un agenda des prochains cours.")
                p("Pour la partie gestion de l'emploi du temps, nous avions mis en place un système de messagerie permettant aux étudiants d'indiquer rapidement un retard ou une absence au corps enseignant.")
                p("A la fin du projet, nous avons pu livrer à l'établissement une application fonctionnelle permettant un suivi simple de son emploi du temps.")
            }
            card("La livraison") {
                p("L'application a été publiée sur le Google store pour permettre aux étudiants de la télécharger et de l'utiliser.")
                p("A la suite de notre travail, l'application a été reprise par d'autres étudiants pour la compléter. Ces derniers ont retouché l'inferface pour \"être à jour\" vis-à-vis des normes de design et d'ergonomie actuelles.")
                p("Aujourd'hui, l'application est encore disponible et maintenue par l'équipe FlOp EDT.")
            }
        }

        section("Mon expérience du projet") {
            card("Mon ressenti") {
                p("Ce projet fut le premier projet que j'ai pu mener à titre de \"développeur\" et fut pour moi la confirmation de mon choix de carrière. J'ai pu développer une application mobile fonctionnelle, apportant une véritable plus-value aux utilisateurs.")
                p("Ce premier projet m'a aussi fait découvrir le développement Android, un domaine qui m'as tout particulièrement plu, par son fonctionnement et le langage Java")

            }
            card("Les apports du projet") {
                p("Pour l'équipe FlOp EDT, ce projet leur a permis de faciliter l'accès à leur solution et de montrer une certaine maturité de cette dernière.")
                p("Pour les utilisateurs, cette application devient la première option pour accéder à FlOp EDT en devenant un accès rapide pour vérifier son emploi du temps.")
            }
        }
    }
}