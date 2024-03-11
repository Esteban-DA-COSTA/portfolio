package edu.estebandc.project.layout.projects

import edu.estebandc.project.Skills
import edu.estebandc.project.layout.shared.card
import edu.estebandc.project.layout.shared.projectSummary
import edu.estebandc.project.layout.shared.section
import io.kvision.core.Container
import io.kvision.html.div
import io.kvision.html.p
import io.kvision.routing.Routing

fun Container.linkedProjectPage(routing: Routing) = div {
    projectSummary(
        "Linked",
        listOf(
            "Linked est un ensemble d'applications permettant aux commerces du quartier de Ville-Bourbon à Montauban de communiquer avec leurs clientèles.",
            "Il s'agit d'un \"réseau social de quartier\"."
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
    section("Le projet") {
        card("le contexte") {
            p(
                "Ce projet d'école a été implémenté sur deux semestres, soit près d'un an. L'objectif de cette réalisation était de permettre aux commerces du quartier de Ville-Bourbon de Montauban de disposer d'un canal préférentiel pour communiquer avec leurs clientèles.<br/>" +
                        "Pour ce faire, il avait été convenu de développer un site web et une application mobile pour mettre en place un \"réseau social du quartier\". C'est deux interfaces seraient connecter par une API REST pour faire transporter les informations.<br/>" +
                        "Notre client était une association du nom de <i>Ca monte en bas</i> qui s'occupe d'améliorer la vie au sein du quartier.",
                rich = true
            )
            p("Avant ce projet, les commerces faisaient passer leurs informations par leurs sites internet personnels ou par Facebook. Ces deux systèmes leur posaient problème. Le premier dû à la nécessité de le maintenir, ce qui peut devenir compliqué pour un non développeur. Le second est dû à la quantité d'informations circulant sur Facebook. Dans ce flux, leur informations se perdaient et leurs clientèles avaient donc du mal à se tenir à jour.")
            p("Ce projet ayant de multiple composant, le risque dont nous avions peur serait de ne pas arriver à le terminer.")
        }
    }
    section("Un projet en deux phases") {
        card("Mon rôle") {
            p(
                "Le projet s'est déroulé en deux phases distinctes réparties sur les deux semestres que nous avions. Lors de ces deux phases, j'avais la charge de SCRUM Master ainsi que de lien avec le client.<br/>" +
                        "Mon travail en tant que SCRUM Master était de m'assurer que la méthodologie de gestion de projet SCRUM était bien comprises et mis en place par toutes les parties du projet aussi bien par les développeurs l'équipe que par le client." +
                        "En tant que lien avec le client, il était de ma responsabilité de le tenir au courant des avancés de l'équipe, ainsi que de mettre en place des réunions pour pouvoir en discuter.",
                rich = true
            )
        }
        card("Première phase") {
            p(
                "La première phase du projet s'est déroulé pendant le premier semestre d'implémentation. Lors de cette phase, les objectifs étaient de mettre en place le site web ainsi que l'API REST.<br/>" +
                        "L'idée derrière ce choix était de fournir une application utilisable depuis n'importe quel support (ordinateur et smartphone) rapidement. Le fait de développer un site permettrait aux utilisateurs d'avoir une solution qu'ils puissent utiliser pour nous donner des retours ensuite.<br/>" +
                        "La mise en place de l'API quant à elle nous permettrait de faire des mises à jour plus facilement, et nous permettait de \"préparer le terrain\" pour la partie mobile qui arriverait plus tard.",
                rich = true
            )
            p(
                "Pour commencer la première phase d'implémentation, je me suis concentré sur la conception technique des différents composants de la solution.<br/>" +
                        "N'étant pas un spécialiste du design, j'ai laissé à la charge des autres membres de l'équipe de créer des maquettes graphiques du site web.<br/>" +
                        "Pour ma part, j'ai défini l'architecture de la base de données qui stockerai toutes les informations de l'application.",
                rich = true
            )
            p(
                "Pour concevoir la base, il m'a d'abord fallu discuter avec le client pour comprendre son besoin. Par exemple, comme l'application devait ressembler à un réseau social, il nous fallait définir les informations qui serviraient aux utilisateurs pour créer leurs comptes et leurs profils.<br/>" +
                        "En plus des utilisateurs, j'ai aussi défini avec l'aide du client ce qui pourrait être publié par ces derniers en tant que publication.",
                rich = true
            )
            p(
                "Une fois la base de données conceptualisée, j'ai commencé son implémentation. J'ai utilisé mes connaissances en SGBD (<b>S</b>ystème de <b>G</b>estion de <b>B</b>ase de <b>D</b>onnées) pour créer les tables qui contiendraient les informations définies plus haut.<br/>" +
                        "Grâce à la conception que j'avais effectué en amont, j'ai pu mettre en place la base de donnée sans problème.",
                rich = true
            )
            p(
                "La dernière étape de mon travail sur la première phase fut l'implémentation de l'API REST. J'ai travaillé avec les autres membres de l'équipe sur cette implémentation. Pour mettre en place l'API, nous avons tout d'abord utilisé une technologie appelée persistence.<br/>" +
                        "La persistence permet de définir un modèle objet conforme aux tables d'une base de données afin d'en récupérer les informations sans avoir à utiliser des requêtes SQL. Les principaux avantages de ce système sont que nous n'avions pas besoin d'avoir des connaissances SQL pour pouvoir développer l'API. Cependant, pour nous, il s'agissait surtout d'implémenter un modèle objet qui pourrait être retransmis au site web que nous développions.<br/>" +
                        "En effet, le modèle objet de persistence que nous avons créé pouvait très facilement être transmis par les requêtes de l'API. Pour cela, nous avons implémenté des \"routes\", des URL que l'application pouvait appeler pour avoir les informations de la base de données.",
                rich = true
            )
            p(
                "A la fin de la première phase, nous avions un site et une API fonctionnelle dans un environnement de développement. Malheureusement, lorsque nous avons essayé d'héberger l'API, elle ne fonctionnait pas. Notre investigation nous a permis de comprendre que la configuration de l'API, qui avait été généré grâce à notre IDE Eclipse, n'était pas fonctionnel.<br/>" +
                        "Heureusement, nous avons pu remédier à ce problème lors de la phase deux.", rich = true
            )
        }
        card("Seconde phase") {
            p(
                "La première chose sur laquelle je me suis penché pendant la seconde phase fut de redévelopper une API fonctionnelle. Etant donné que le problème venait de la configuration d'Eclipse, j'ai décidé de redévelopper la nouvelle API avec un IDE que je maitrisais plus, à savoir IntelliJ.<br/>" +
                        "J'ai aussi profité de cette ré-implémentation pour développer l'API avec un framework Kotlin nommé Ktor. Ce framework dispose d'un ensemble de système permettant de définir des routes d'API plus facilement que ce que nous avions fait pendant la première phase.",
                rich = true
            )
            p(
                "Pendant que j'effectuais le re-développement de l'API, j'ai divisé le reste du travail de l'équipe en deux.<br/>" +
                        "La première tâche était de continuer à travailler sur le site web pour y ajouter les retours du client suite à son utilisation pendant l'entre deux phases.<br/>" +
                        "La seconde tâche fut de développer l'application Android.", rich = true
            )
            p(
                "Lors de la conception de l'application mobile, nous avons réfléchis à son utilisation. Pourquoi avons-nous besoin de cette application si nous disposions déjà du site.<br/>" +
                        "Après des discussions sur le sujet avec le client, nous nous sommes arrêté sur le fait que l'application Android devait permettre notamment aux clients des commerces du quartier d'accéder facilement aux dernières informations desdits commerces.<br/>" +
                        "Nous avons décidé de profiter des avantages d'Android pour mettre en place des notifications push qui seraient envoyés aux utilisateurs dès qu'un de leurs commerces favoris mettrait des publications en ligne.",
                rich = true
            )
        }
    }
    section("Mes retours") {
        card("Ce projet aujourd'hui") {
            p("A la fin du développement des deux phases, nous avions fourni à notre client l'ensemble des composants de la solution. N'étant pas responsable de la mise en production de cette dernière, nous leur avons fourni le code sources ainsi que les documentations pour utiliser et maintenir notre solution.")
            p("Malheureusement, à ce jour, l'association ne sait pas occupé de mettre la solution en production.")
        }
        card("Mon ressenti") {
            p(
                "J'ai apprécié mon rôle de SCRUM Master dans le projet, tout particulièrement le fait d'être l'interlocuteur du client. Tout au long du projet, j'ai communiqué avec notre client pour discuter de la marche à prendre pour l'implémentation de la solution.<br/>" +
                        "Mon rôle n'a pas été seulement d'écouter le besoin du client, en tant que spécialiste technique, j'ai pu proposer des idées sur la façon de le mettre en oeuvre, pour essayer d'obtenir une solution optimale, qui répond aux besoins énoncés en y ajoutant mon expertise de l'informatique.",
                rich = true
            )
            p("A refaire le projet aujourd'hui, je pense que j'utiliserai directement Ktor en tant qu'API, c'est selon moi une technologie plus flexible que ce que l'on avait utilisé au départ. De plus, je me concentrerai plus sur la mise en production de notre application. Aujourd'hui, Linked n'est pas utilisé par l'association à cause d'un manque de connaissance sur la mise en place d'une solution informatique. Même si cette mise en production n'était pas de la responsabilité de notre équipe.")
        }
    }
}