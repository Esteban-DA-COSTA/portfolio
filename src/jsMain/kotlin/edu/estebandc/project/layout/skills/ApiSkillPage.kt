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

fun Container.apiSkillPage() = div {
    skillSummary(
        "API REST",
        listOf(
            "API, pour Application Programming Interface, est une solution permettant de permettre à un programme d'utiliser tout ou une partie des fonctionnalité d'une autre.",
            "Parmi les systèmes d'API, on retrouve des API REST, des solutions utilisant les protocoles HTTP pour partager ses fonctionnalité"
        ),
        SkillType.TECHNIQUE,
        SkillLevel.CONFIRME
    )
    section("Diviser pour mieux développer") {
        card("Le partage de fonctionnalité") {
            p("L'informatique aujourd'hui se trouve à tous les niveaux, dans les banques, la météo, les loisirs, etc...")
            p("Lorsque de nouveaux projets émergent, les équipes de développement ont besoin d'interconnecter leurs outils avec d'autres déjà existant. Cela permet de ne pas redévelopper des systèmes déjà existant ou d'utiliser des fonctionnalités d'outils appartenant à d'autres sociétés ou personnes.")
            p("Les API ont pour vocation de mettre en place cet interconnection. Elles peuvent prendre différentes forme, comme des librairie de code à partager. L'une des formes les plus répandu est celle de l'API REST. Cette forme utilise le protocole HTTP pour fournir des URL fournissant les informations et fonctionnalités demandées.")
            p("Par exemple, Spotify dispose d'une API REST permettant aux développeurs de se connecter et de proposer les services Spotify dans leurs applications. C'est aussi le cas de la Poste ou Jira.")
        }
        card("Un type d'API à connaitre") {
            p("Les API REST sont un type d'API très répandu. Comme elles utilisent le protocole HTTP, c'est l'une des formes d'API les plus simples à partager. En effet, ces API sont disponibles sur internet, disposent de protocoles de sécurité simples et fiables et donnent une grande flexibilité à la fois aux développeurs de ces dernières et aux développeurs qui l'utilisent.")
            p("Savoir développer et utiliser ses API est donc grandement conseillé, voir obligatoire pour un ingénieur informatique.")
        }

    }
    section("Mes API REST") {
        card("Linked, deux API pour une solution") {
            p(
                "Lors de mon projet d'école <a href='${Category.PROJECTS.url}/${Project.LINKED.url}'>Linked</a>, j'ai développé deux API REST, la première en Java et la seconde en Kotlin.",
                rich = true
            )
            p(
                "La première API a été développée en même temps que le site web associé. Son objectif était d'interconnecter le site à la base de données dans laquelle était stockées les informations.<br/>" +
                        "Pour cette implémentation, je me suis occupé de définir les routes de l'API. Cela signifie que j'ai mis en place les URL qui servirait pour récupérer les informations de la base de données.<br/>" +
                        "Par exemple, la route <code>/users</code> permettait de récupérer l'ensemble des utilisateurs de la base de données. La route <code>/users/{id}</code> permettait quand à elle de récupérer les informations d'un utilisateur en particulier en mettant l'identifiant d'un utilisateur particulier dans l'URL.",
                rich = true
            )
            p(
                "Lors de la deuxième phase du projet, j'ai totalement recréé l'API en kotlin car nous n'arrivions pas à héberger celle faite en Java.<br/>" +
                        "Sur cette API, j'ai défini les routes mais aussi implémenté le système d'authentification pour limiter son accès aux personnes autorisées. Pour cela, j'ai utilisé un JWT pour <b>J</b>son <b>W</b>eb <b>T</b>oken. Il s'agit d'un token qui est généré par l'API lorsqu'un client envoie ses identifiants sur une route d'API particulière. Si les identifiants sont corrects, l'API renvoie le token qui sera ajouté par le client à toutes ses requêtes. Ce token étant unique et éphémère, il permet d'authentifier un client avant de renvoyer des informations.",
                rich = true
            )
        }
        card("Les API Spring") {
            p(
                "J'ai découvert Spring Boot en travaillant sur <a href='${Category.PROJECTS.url}/${Project.TSAS.url}'>TSAS</a>. Sur ce projet, les API étaient déjà mise en place à mon arrivée, mais j'ai pu travailler sur des évolutions de ces dernières.<br/>" +
                        "Spring boot est un framework permettant de créer des API REST très facilement. Le framework s'occupe d'une grande partie du fonctionnement de l'API, en proposant des fonctions pour définir simplement les routes de l'API ou la connexion à des bases de données.<br/>" +
                        "Il permet aux développeurs de se concentrer sur le nécessaire.",
                rich = true
            )
            p("L'une des évolutions que j'ai mise en place fut l'ajout et la gestion de nouvelles routes.")
            p(
                "La route que j'ai ajoutée sur l'API permettait de communiquer une liste de paramètre plutôt qu'un seul. Pour ajouter cette liste, j'ai utilisé des <i>repositories</i>, un sous-système des API Spring permettant de créer automatiquement les systèmes de sauvegardes, de suppression et de récupération des informations de la base de données en indiquant seulement les champs de la table à travers un modèle objet.<br/>" +
                        "Pour mon implementation, j'ai donc modifié le repository correspondant à mes paramètres à modifier en transformant le champ d'un simple champs texte à une liste de texte.<br/>" +
                        "Ce simple changement m'a permis de modifier la base de données ainsi que les routes permettant de renvoyer ces informations." +
                        "Pour parfaire l'évolution de l'API, j'ai utilisé le plugin Swagger intégré à Swing pour mettre automatiquement à jour la documentation. Swagger est un outil permettant de générer un site web de documentation d'une API. Couplé à Spring, cela permet de générer la documentation automatiquement en lisant les modèles objets de l'API.",
                rich = true
            )
        }
        card("L'upload de fichier") {
            p("Mon père travaille en tant que directeur informatique dans une coopérative agricole nommé Qualisol. Pour son travail, il m'a demandé d'implémenter une API REST pour pouvoir uploader des factures et de lancer un programme de facturation.")
            p("Lors de l'arrivée de céréales dans la coopérative, les factures doivent être insérées via un logiciel propriétaire dans le système par les différents agriculteurs de la société. Pour automatiser la gestion des factures, mon père m'a demandé s'il était possible de mettre en place une API permettant d'uploader les factures et de lancer automatiquement le logiciel qui les traite.")
            p("Ayant plus de connaissance dans le framework Ktor, j'ai développer une API qui permet aux utilisateurs d'envoyer leurs factures pdf via un formulaire web grâce au protocole multi-part s'occupant de transmettre des fichiers en binaire via HTTP.")
            p("Une fois le pdf récupéré sur l'API, cette dernière l'enregistre dans un dossier de l'ordinateur contenant le logiciel cible avant de le lancer. Le programme s'occupe alors de lire tous les pdf dans le dossier pour les traiter.")
        }
    }
    section("Mon expertise") {
        card("Mon niveau") {
            p(
                "Les différents projets dans lesquels j'ai travaillé utilisent tous des technologies et langages différents pour implémenter des API REST. En travaillant sur chacune d'elle, j'ai pu atteindre un niveau <b>confirmé</b> que ce soit dans leur développement ou leur utilisation.",
                rich = true
            )
            p("L'apprentissage des API REST m'a été particulièrement aisé grâce à mes connaissances du protocole HTTP. En effet, lors de mon cursus en IUT, j'ai reçu un enseignement poussé sur le réseau et le protocole HTTP.")
            p("Cependant, mon apprentissage de ces API n'est pas terminé, je n'ai notamment jamais utilisé d'architecture HATEOAS pour mes API. HATEOAS est une contrainte d'architecture des API REST pour leurs permettre, en plus de transmettre des informations, d'indiquer aux utilisateurs les URL existantes pour son utilisation. Sans HATEOAS, les développeurs d'API sont contraints de développer une documentation pour indiquer les routes de l'API ainsi que leur fonctionnement.")
        }
        card("Sa place dans mon profil") {
            p("Le développement d'API REST est une compétence que je maitrise particulièrement. Je sais comment les implémenter mais par dessus tout, je comprends leur utilité et leur objectif. Pour ma futur vocation de chef de projet, cela me permettra de proposer à mes clients des API adaptées à leurs besoins.")
            p(
                "Pour développer mes connaissances, je pense suivre la formation de deux jours <i>Formation API REST : Conception et Sécurité (Sparks)</i> pour apprendre à utiliser la philosophie HATEOAS.",
                rich = true
            )
        }
        card("Mes conseils sur les API REST") {
            p(
                "Les API REST sont un bon moyen pour étendre les fonctionnalités d'une application. Bien que ces API offre une grande flexibilité, je conseille avant de se lancer dedans de bien apprendre les <i>verbes HTTP</i>.<br/>" +
                        "Une erreur courante est d'utiliser des routes <b>POST</b> pour une grande partie de l'API, or, l'étude de la norme des verbes HTTP permet souvent de voir que d'autres verbes comme PUT ou PATCH peuvent être plus adaptée.",
                rich = true
            )
            p("Je recommande aussi l'utilisation de Swagger, il s'agit d'un outil améliorant grandement la vie des utilisateurs et des développeurs d'API. Pour les utilisateurs swagger leur permet d'avoir une documentation à disposition. Pour les développeurs, cela permet de mettre en place à site sans avoir à y passer beaucoup de temps.")
        }
    }
}