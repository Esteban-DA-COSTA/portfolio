package edu.estebandc.project.layout.skills

import edu.estebandc.project.Category
import edu.estebandc.project.Project
import edu.estebandc.project.SkillLevel
import edu.estebandc.project.SkillType
import edu.estebandc.project.layout.shared.card
import edu.estebandc.project.layout.shared.section
import edu.estebandc.project.layout.shared.skillSummary
import io.kvision.core.Container
import io.kvision.html.div
import io.kvision.html.p

fun Container.androidSkillPage(): Container {
    return div {
        skillSummary(
            "Android",
            listOf(
                "Android est le système d'exploitation de nombreux smartphones comme Samsung, OnePlus ou encore Google. Ce système a été développé par l'entreprise Google. Ce système permet de développer des applications installables pour répondre aux besoins des utilisateurs."
            ),
            SkillType.TECHNIQUE,
            SkillLevel.AUTONOME
        )
        section("Les smartphone dans notre monde technologique") {
            card("L'importance des smartphones") {
                p("Dans notre société technologique, quasiment chaque personne, enfant comme adulte, dispose de son smartphone. Ce dernier nous permet de téléphoner, préparer des réunions, jouer, se détendre ou écouter la musique. Il s'agit du compagnon presque indispensable aujourd'hui.")
                p("Comme les ordinateurs, les smartphones se base sur des systèmes d'exploitation, des systèmes définissant leur fonctionnement primaire.")
                p("Il existe deux principaux systèmes d'exploitation pour les smartphone, <i>Android</i> et <i>IOS</i>.", rich = true)
            }
            card("Les évolutions d'Android") {
                p("Le système d'exploitation d'Android se veut polyfonctionnel depuis sa création, en permettant à n'importe qui de développer des applications pour développer les fonctionnalités des smartphones.")
                p("Pour proposer un système fiable et diversifié, Google met à jour Android de façon régulière, comme le montre la version 14 d'Android sortie en octobre 2023, ajoutant des nouvelles fonctionnalités comme la localisation du smartphone même si ce dernier est éteint ou l'ajout de l'application SantéConnect pour partager les données de santé des utilisateurs entre les appareils.")
            }
        }
        section("La mise en pratique d'Android dans mon cursus") {
            card("Mon premier projet") {
                p("J'ai découvert le développement Android lors de mon DUT. Suite à un cours dessus, nous avions dû développer une application en partenariat avec un client. Pour ma part, j'ai travaillé sur une <a href='/${Category.PROJECTS.url}/${Project.FLOP_EDT_MOBILE.url}'>application mobile de l'emploi du temps de 'IUT</a>.", rich = true)
                p("Lors de ce projet, j'ai dû mettre en application mes connaissances dans le domaine du développement Android, notamment lors de l'implémentation de l'<i>AppWidget</i>, un composant Android permettant d'afficher une partie d'une application directement sur la page d'accueil du smartphone.", rich = true)
                p("Mes compétences dans ce domaine m'a permit de mener à bien l'implémentation de l'AppWidget, ce qui a permis de livrer cette fonctionnalité à la fin du projet avec le reste des attendus. Cette appWidget permet d'afficher les projets cours des utilisateurs sans avoir à ouvrir l'application.")
            }
            card("Les notifications") {
                p("Un concept clé d'Android sont les notifications push. Ce sont des messages qu'une application peut envoyer au système que ce dernier affiche à l'utilisateur directement sur la page d'accueil ou la page de verrouillage.")
                p("Lors de mon projet <a href='/${Category.PROJECTS.url}/${Project.LINKED.url}'>Linked</a>, j'ai développer ce système pour permettre aux utilisateurs de recevoir des notifications sur leurs commerces préférés.", rich = true)
                p("Tout comme pour l'AppWidget, il a fallu pour mettre en place ces dernières, comprendre le fonctionnement d'Android pour les implémenter. Grâce à ces notifications, les utilisateurs n'ont pas besoin de lancer l'application pour ce tenir à jour des nouveautés et informations de leur quartier")
            }
        }
        section("Mon niveau") {
            card("Ma maitrise") {
                p("Bien qu'aillant effectuer plusieurs projets Android dans ma carrière, je ne considère mon niveau dans le domaine que d'<b>Autonome</b>. En effet, Android est un système complexe, et même si j'ai pu mener deux projets à bien, je ne suis pas aller en profondeur dans son fonctionnement.", rich = true)
                p("De plus, les deux projets ont été effectués avec le langage Java plutôt que Kotlin. Il faut savoir que Google recommande l'utilisation de Kotlin pour le développement Android. L'utilisation de Java dans mon cas montre une connaissance succinct du système.")
                p("Dans l'avenir, j'espère améliorer mes connaissance en Android grâce à des projets Kotlin. J'ai en effet appris ce langage de façon autodidacte, et son application en Android serait un bon moyen de m'améliorer dans les deux domaines.<br/>" +
                        "Il existe un framework Kotlin appellé Jetpack, reconnu et soutenu par Google, permettant de développer des applications Android plus fiables et plus maintenables. J'aimerais effectuer des formations sur ce framework afin de m'améliorer.", rich = true)
            }
            card("Sa place dans mon profil") {
                p("Android est un domaine qui m'intéresse, dans lequel j'aimerais améliorer mes compétences dans un milieu professionnel. Plus précisément, j'aimerais développer mes compétences dans le langage Kotlin, le langage recommander pour le développement Android.")
                p("Pour développer mes compétences dans ces deux domaines, je pense réaliser une application en utilisant le framework Jetpack Compose. J'ai déjà commencé à apprendre son fonctionnement grâce à mon projet en cours en entreprise.")
            }
            card("Mes conseils") {
                p("Pour ceux qui souhaitent se lancer dans le développement Android, je conseillerai d'apprendre le langage Kotlin. Ce langage est tout d'abord celui recommandé par l'entreprise développant Android, de plus, ce langage est plus \"moderne\" que Java, dispose d'une syntaxe plus lisible.")
                p("Pour ce qui ai d'Android pur, je conseille de regarder des tutoriels disponible sur la documentation officiele, cela permet de développer des applications simples montrant les spécificités du système d'exploitation.")
            }
        }
    }
}