package edu.estebandc.project.layout.projects

import edu.estebandc.project.Skills
import edu.estebandc.project.layout.shared.card
import edu.estebandc.project.layout.shared.projectSummary
import edu.estebandc.project.layout.shared.section
import io.kvision.core.Container
import io.kvision.html.div
import io.kvision.html.p
import io.kvision.routing.Routing

fun Container.tsasProjectPage(routing: Routing) = div {
    projectSummary(
        "TSAS",
        listOf(
            "TSAS est un projet effectué dans le cadre de mon alternance chez Capgmini",
            "Il s'agit d'un outil permettant d'analyser des données d'avions de test."
        ),
        mapOf(
            Skills.JAVA to 5,
            Skills.API_REST to 5,
            Skills.AUTO_FORMATION to 25,
            Skills.ECOUTE_CLIENTELE to 35,
            Skills.COMMUNICATION_EN_ANGLAIS to 30
        ),
        routing
    )
    section("Le projet") {
        card("Le contexte") {
            p("Ce projet est développé par Capgemini pour Airbus.")
            p("Airbus construit des avions qui sont ensuite vendus à des société comme AirFrance. Ces avions doivent respecter de nombreuses normes afin d'être mis en circulation. Ces normes servent à s'assurer de la fiabilité des avions.")
            p(
                "Pour faire valider ces réglementations, les avions passent par une batterie de tests. Certains de ces tests se font au sol tandis que d'autre lors de vol d'essais effectué par Airbus.<br/>" +
                        "Lors de ces tests, de nombreuses données sont enregistrés afin d'être analysées plus tard par les ingénieur de la société.",
                rich = true
            )
            p(
                "Les outils TSAS sont des outils permettant aux ingénieurs d'Airbus de voir et d'analyser ces données à travers deux sites web.<br/>" +
                        "Le premier, TSAS.Plot permet d'afficher les données sous forme de graphiques afin de les comparer.<br/>" +
                        "Le second, TSAS.Processing est un outil big data qui permet de configurer des suites de comparaison sur les données appelé \"Jobs\" pour les analyser automatiquement.",
                rich = true
            )
            p("Lorsque je suis rentré dans l'équipe TSAS, les outils étaient déjà fonctionnels et mis en place. Mon travail dans l'équipe était donc de maintenir les applications ainsi que de développer des nouvelles fonctionnalités.")
            p("Ces applications sont des outils nécessaires aux ingénieurs Airbus, il fallait donc s'assurer de leurs fonctionnements pour être sûr que les ingénieurs puissent travailler sereinement.")
        }
    }
    section("Mon travail") {
        card {
            p(
                "Les outils TSAS sont composés de multiples applications fonctionnant ensemble.<br/>" +
                        "Le point d'entrée des utilisateurs sur ces outils sont les sites web Angular de TSAS.Plot et TSAS.Processing. Derrière ces sites ce trouvent des API REST fait avec Java Spring se connectant aux différentes bases de données d'Airbus pour les renvoyer aux sites.<br/>" +
                        "En plus de cela, l'équipe TSAS s'occupe de l'implémentation d'autres modules comme des API python cependant je n'ai pas travaillé dessus.<br/>" +
                        "Mon travail s'est principalement concentré sur les sites Angular ainsi que les API REST.",
                rich = true
            )
        }
        card("Les delta markers") {
            p("L'une de mes premières tâches sur TSAS fut l'implémentation d'une nouvelle fonctionnalité pour le site TSAS.Plot.")
            p("Comme expliqué plus haut, TSAS.Plot permet d'afficher des graphiques correspondant aux données de tests d'avions. De plus, il permet d'effectuer certaines actions sur ces graphes afin de faciliter le travail des ingénieurs.")
            p(
                "L'une de ces fonctionnalités permet aux utilisateurs de placer des marqueurs sur le graphique pour afficher la valeur des données de ce dernier à un instant <i>t</i>.",
                rich = true
            )
            p(
                "Il m'a été demandé par le client d'améliorer ce système pour pouvoir ajouter une paire de marqueurs dont le but serait d'afficher le delta des données entre deux points.<br/>" +
                        "Pour l'implémentation de cette tâche, j'ai tout d'abord pris connaissance du code déjà existant. En effet, les <i>delta markers</i> sont un variant des marqueurs classiques, donc au lieu d'implémenter la fonctionnalité depuis le début, je me suis penché sur la version originale pour ne développer que l'amélioration nécessaire.<br/>" +
                        "L'analyse de l'existant m'a permis de comprendre que TSAS.Plot utilise la librairie de code Plotly.js pour la gestion des graphiques. Il m'a donc suffit de me documenter sur cette librairie pour pouvoir implémenter les <i>delta markers</i>.",
                rich = true
            )
            p("Une fois l'implémentation effectué, j'ai préparé une démonstration en anglais pour présenter la nouvelle fonctionnalité aux utilisateurs. Airbus étant une boite internationale, de nombreux utilisateurs de TSAS ne sont pas français, ce qui induit l'implication d'une communication en anglais pour toutes les documentations et réunions avec les utilisateurs.")
        }
        card("Les backups parameters") {
            p(
                "Une autre de mes tâches sur TSAS fut l'ajout de <i>backups parameter</i>. Cette fois ci, j'ai travaillé sur l'autre outil TSAS, TSAS.Processing.",
                rich = true
            )
            p(
                "TSAS.Processing permet aux utilisateurs de configurer des \"Jobs\", une série de comparaisons effectuée sur des données pour analyser automatiquement des tests d'avions.<br/>" +
                        "Cet outil permet d'effectuer des analyses sur plusieurs avions de tests simultanément. Par exemple, on peut tester l'altitude des avions lors des tests 1, 2, 3 et 4. Grâce à cela, les ingénieurs peuvent factoriser leur travail en travaillant sur plusieurs tests et/ou avions." +
                        "Cependant, lorsqu'un job travaille sur plusieurs tests/avions, il est possible que les données enregistrées lors d'un test ne correspondent pas pour les autres.",
                rich = true
            )
            p("Pour résoudre ce problème, il a été décidé d'implémenter un système de \"backups\". Lors de la configuration, l'utilisateur pourra définir une liste ordonnée de paramètres. Lors de l'exécution du job, le programme va essayer de récupérer les données liées au premier paramètre. S'il n'en trouve pas, il passera au deuxième paramètre ect...")
            p("L'implémentation de cette fonctionnalité m'a fait toucher à l'ensemble de la chaine de fonctionnement de TSAS, à savoir le site Angular et l'API REST Java.")
            p(
                "La première étape de l'implémentation fut l'ajout d'une liste plutôt q'un simple champs de texte sur l'interface web.<br/>" +
                        "Ensuite, j'ai dû modifier l'API REST Java. En effet, le fait d'ajouter de nouvelles informations à transmettre à cette dernière m'a forcé à modifier les requêtes associées pour permettre au site de transmettre l'ensemble des informations." +
                        "Une fois la requête modifiée, je me suis concentré à l'envoi de ces information vers les serveurs kafka s'occupant de exécution des jobs.<br/>" +
                        "Pour expliciter mon propos, lorsqu'un utilisateur définit un job sur le site, sa configuration ainsi que son historique d'exécution sont stockées sur la base de données de l'API. Lors de l'exécution du job, l'API transforme les données de la configuration pour les transmettre à une application Kafka qui s'occupe de réaliser les conditions demandées par l'utilisateur puis renvoi les retours à ce dernier." +
                        "L'ajout des informations sur le site m'a donc obligé de modifier toute la chaine pour les transmettre à Kafka.",
                rich = true
            )
            p("Une fois de plus, à la fin de l'implémentation, j'ai préparé une démonstration en anglais pour les utilisateurs.")
        }
        card("La maintenance") {
            p("En plus des innovations ci-dessus, le plus gros de mon travail sur TSAS fut la maintenance des sites.")
            p(
                "Cette maintenance passé principalement par la gestion des incidents remontés par les utilisateurs de ces applications.<br/>" +
                        "Lorsqu'un utilisateur rencontre un problème sur les applications, il me fallait investiguer afin de déterminer la cause de ce problème.<br/>" +
                        "Si la cause était dû à une mauvaise utilisation des outils par l'utilisateur, je communiquait avec lui afin de le former pour résoudre son problème.<br/>" +
                        "Si la cause était dû à un bug sur l'application, j'avais pour tâches de la résoudre.",
                rich = true
            )
        }
    }
    section("Mon expérience du projet") {
        card("Mon ressenti") {
            p("Ce projet est la réalisation la plus enrichissante de toute ma carrière.")
            p("Grâce à lui, j'ai pu voir le cycle de vie d'un projet après sa réalisation première. Jusqu'à présent, j'ai développé des projets que j'ai fourni à mes clients sans maintenance. Sur TSAS, j'ai travaillé activement au maintien de ce dernier.")
            p("De plus, j'ai pu découvrir un projet plus complexe que les autres, avec plusieurs modules travaillant ensemble, certains développé par notre équipe, d'autre par d'autre équipes de développement de Capgemini ou d'Airbus.")
            p("Cependant, si je pouvais retravailler sur le projet aujourd'hui, j'aimerais proposer de refactoriser les sites Angular. Entre leur développement en 2020 et ce qu'ils sont aujourd'hui, on peut voir que de nombreuses fonctionnalité existantes n'avait pas été pensé à leur conception. Cela a entrainé des surcouches de code difficilement maintenable et des limites techniques sur les futures implémentation de fonctionnalités.")
        }
        card("Les apports du projet") {
            p(
                "Ce projet est l'outil principal de travail des ingénieurs Airbus affiliés aux essais en vol de leurs avions. Mes contributions ont permis de résoudre des incidents ainsi que d'améliorer les capacités des différents outils TSAS.<br/>" +
                        "C'est un projet vouait à continuer d'évoluer, car les besoins des utilisateurs vont eux aussi évoluer." +
                        "Airbus souhaiterai pouvoir utilisé les outils TSAS dans d'autres de leur branche. Avant de changer de projet, nous avions discuté de l'utilisabilité de TSAS dans la branche <i>Defense ans Space</i> par exemple.",
                rich = true
            )
        }
    }
}