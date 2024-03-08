package edu.estebandc.project.layout.projects

import edu.estebandc.project.Skills
import edu.estebandc.project.layout.shared.card
import edu.estebandc.project.layout.shared.projectSummary
import edu.estebandc.project.layout.shared.section
import io.kvision.core.Container
import io.kvision.html.div
import io.kvision.html.p
import io.kvision.routing.Routing

fun Container.erecProjectPage(routing: Routing) = div {
    projectSummary(
        "eRec",
        listOf(
            "eRec est un outil permettant à Capgemini de faciliter son processus de recrutement.",
            "Il permet de centraliser les CV, les réunions, les notes ou toutes autres information nécessaire au recrutement dans un endroit.",
        ),
        mapOf(
            Skills.C_SHARP to 15,
            Skills.API_REST to 10,
            Skills.ANGULAR to 10,
            Skills.BASE_DE_DONNEES to 20,
            Skills.TRAVAIL_EN_AUTONOMIE to 25,
            Skills.AUTO_FORMATION to 20
        ),
        routing
    )
    section("Le projet") {
        card("Mon stage chez Capgemini") {
            p("J'ai travaillé sur le projet eRec lors de mon stage de 6 mois chez Capgemini.")
            p(
                "Bien qu'étant une ESN (<b>E</b>ntreprise de <b>S</b>ervices du <b>N</b>umérique) travaillant pour d'autres entreprises, le projet eRec est un projet interne à l'entreprise visant à faciliter le processus de recrutement.<br/>" +
                        "Ce projet a été entièrement développé par des stagiaires et/ou alternant. Lors de mon arrivée, ce logiciel était déjà utilisé en production, c'est d'ailleurs lui qui a géré mon recrutement dans la société.",
                rich = true
            )
            p(
                "Le recrutement d'un nouveau salarié chez Capgemini passe par de nombreux points tel que l'analyse des CV et lettres de motivation ou des entretiens avec diverses personnes pour cerner au mieux les compétences et profils des recrutés. Toutes ces informations ont donc besoin d'être centralisées dans un outil pour permettre aux différentes parties de se les transmettre.<br/>>" +
                        "Par exemple, lors de mon entretien technique, j'ai été en contact avec un développeur qui s'est assuré de mes connaissances. Ces informations ont dû être transmises à une responsable des relations humaines pour qu'elle puisse valider ce point étape et organiser un entretien pour savoir si mon profil personnel concordait avec la vision de Capgemini.",
                rich = true
            )
            p("Le projet étant en production, le risque de mon travail en stage était de créer des bugs empêchant les services de recrutement de travailler.")
        }
    }
    section("L'implémentation") {
        card("Optimisation d'affichage") {
            p("Le visuel principal de l'outil eRec permet d'afficher les candidats sous forme de cartes dans un tableau Kanban où chaque colonne correspond à un état d'avancement dans le processus de recrutement.")
            p("Sur ce tableau, certaines colonnes servent d'archive comme la colonne \"KO\" qui permet de mettre les candidats refusés.")
            p(
                "Mon travail fut de d'implémentation une optimisation du chargement de ces colonnes en permettant de définir certaines colonnes comme prioritaire. Cette priorité devait servir à l'application de savoir quelles colonnes devait être chargées à l'ouverture de la page.<br/>" +
                        "Les colonnes moins prioritaires disposeraient d'un bouton pour lancer le chargement manuellement.",
                rich = true
            )
            p(
                "Pour mettre en place cette fonctionnalité, j'ai tout d'abord modifié la base de données dans laquelle les informations de colonnes sont enregistrées. Dans cette table, j'ai rajouté un booléen pour indiquer si la colonne est prioritaire ou non.<br/>" +
                        "J'ai ensuite manuellement défini la priorité de chaque colonne en base de données.<br/>" +
                        "J'ai effectué ces modifications de base de données directement depuis le code C sharp grâce au framework <i>EntityFramework</i>. Grâce à ce framework, j'ai pu modifier directement la classe correspondante à la table Colonne et les changements ont automatiquement été répercutés dans la base.<br/>" +
                        "Les changements du modèle objet se sont aussi répercuté sur les requêtes API, je n'ai donc pas eu à les retoucher.",
                rich = true
            )
            p("Une fois ces modifications faites, j'ai modifié le site eRec fait en Angular. Tout d'abord, lors de la récupération des colonnes, j'ai récupéré le nouveau booléen pour connaitre leurs priorités. Ensuite, j'ai modifié le chargement de ces dernières. Au lieu de charger le contenu de chaque colonne, seuls les contenus des colonnes marquées prioritaires sont chargés depuis l'API.")
            p("Pour permettre de récupérer le contenu des colonnes non prioritaire, j'ai ajouté un bouton charge la colonne concernée.")

            p("Lors des modifications de la base de données, je n'ai pas implémenté de système pour modifier la valeur de priorité après coup, j'ai donc ajouté une page d'administrateur sur le site dans laquelle j'ai affiché chaque colonne et sa priorité ainsi qu'un bouton pour modifier cette valeur.")
        }
        card("L'ajout de besoins spécifiques") {
            p("Avec l'utilisation d'eRec, de nouveaux besoins sont apparus chez les responsables de recrutement.")
            p("A la base, l'outil n'a été pensé que pour y centraliser les informations cependant, il est apparu qu'il pourrait aussi servir aux différents chefs de projet pour faire remonter leurs besoins spécifiques en termes de personnels pour leurs projets.")
            p("L'implémentation d'un système de gestion des besoins fut donc un autre travail que j'ai effectué sur eRec.")
            p(
                "Pour cette tâche, au lieu de simplement retoucher une table existante dans la base de données, j'en ai créé deux, une permettant de stocker les informations d'un besoin, et l'une autre pour stocker les états des ces derniers.<br/>" +
                        "La table Etat fonctionne de la même manière que les colonnes pour le recrutement, à savoir stocker les différentes étapes par lesquels un besoin passe au cours de sa durée de vie.<br/>" +
                        "La table Besoin quant à elle défini les informations d'un besoin, comme sa description, la date à laquelle on va avoir besoin d'un nouveau personnel ou la liste des personnes qui correspondent au besoin.",
                rich = true
            )
            p("Au niveau du site, j'ai créé une nouvelle page pour afficher les besoins. Nous avons décidé de dupliquer la page qui permet l'affichage du tableau Kanban pour le recrutement afin de garder le même fonctionnement.")
        }
    }
    section("Mon expérience du projet") {
        card("Mon ressenti") {
            p("eRec m'a permis de me \"mettre en selle\" pour mon alternance. J'ai pu m'adapter à la vie en entreprise, découvrir le travail dans une entreprise tout en montrant mes compétences à mes supérieurs.")
            p("Ce projet allie simplicité et diversité, il en fait le projet idéal montrer son savoir dans un environnement \"contrôlé\". Je ne pense pas avoir à changer mon travail si je devais le refaire aujourd'hui, malgré tout, je demanderai plus de responsabilité car je pense que je pourrai transmettre mon savoir du projet à d'autres stagiaires qui pourrait travailler dessus.")
        }
        card("Les apport du projet") {
            p("Mon travail sur eRec a permis de d'optimiser les ressources utilisées par l'application lors des chargement, le rendant plus rapide.")
            p("L'ajout des besoins a ajouter une toute nouvelle utilisation de l'outil, permettant de facilité la traçabilité des demandes de personnel au sein de l'entreprise.")
        }
    }
}