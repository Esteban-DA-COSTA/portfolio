package edu.estebandc.project.layout.projects

import edu.estebandc.project.Skills
import edu.estebandc.project.layout.shared.card
import edu.estebandc.project.layout.shared.projectSummary
import edu.estebandc.project.layout.shared.section
import io.kvision.core.Container
import io.kvision.html.div
import io.kvision.html.li
import io.kvision.html.p
import io.kvision.html.ul
import io.kvision.routing.Routing

fun Container.klasifileProjectPage(routing: Routing): Container {
    return div {
        projectSummary(
            "Klassifile",
            listOf(
                "Klassifile est un serveur permettant à l'outil Moovapps de se connecter à des serveurs CMIS",
                "Ce projet a été réalisé en tant que projet de formation lors de mon cursus d'ingénieur"
            ),
            mapOf(
                Skills.C_SHARP to 20,
                Skills.GESTION_PROJET to 50,
                Skills.AUTO_FORMATION to 30
            ), routing
        )
        section("Le contexte") {
            card("Kadys") {
                p("Kadys est une entreprise d'intégrateur solution de GED (Gestionnaire Electronique de Document).")
                p("Elle propose des solutions et des procédures pour mettre en place des systèmes informatique de gestion de document.")
                p("Kadys se repose sur un logiciel de GED appellé MoovApps pour ses propositions de solutions pour ces clients. Ce logiciel est un Gestionnaire électronique de documents propriétaire de l'entreprise Visiativ.")

            }
            card("La norme CMIS") {
                p("La norme CMIS (Content Managment Interoperability Services) est une norme définissant le format des dossiers et fichiers pour pouvoir communiquer entre différent outils GED notamment.")
                p("Cette norme est utilisée chez de nombreux outils de gestion de documents comme SharePoint ou Alfresco.")
                p("Le fait de pouvoir se connecter à ce types d'outils étaient un enjeu de taille pour Kadys, le fait de ne pouvoir intégrer Moovapps à ces outils était un frein pour de nombreux clients habitué à utiliser des outils comme Word ou Excel (ces derniers se base sur Sharepoint pour stocker les documents).")
            }
            card("Le besoin") {
                p("Kadys n'étant pas propriétaire de la solution Moovapps, elle ne peut pas développer de mise à jour ou amélioration sur ce dernier.")
                p("Kadys souhaitait ajouter la communication sur la norme CMIS pour lui permettre de se connecter à des outils comme Sharepoint, des solutions de gestion de documents cloud très connus utilisant la norme CMIS.")
                p("Il nous a donc été demandé de développer un serveur qui servirait de traduction entre les outils CMIS et le logiciel MoovApps.")
                p("Le principal risque de ce projet, s'il nous n'arrivons pas à le réaliser serait l'incapacité de ce connecter à des outils essentiels pour les clients de Kadys, qui risquent donc de se tourner vers d'autres solutions.")
            }
        }
        section("L'implémentation du serveur CMIS") {
            card("L'apprentissage de la norme") {
                p("Pour mener à bien le projet, il a fallu comprendre la norme CMIS. Pour cela, je me suis auto formé à l'aide de différents sites internet pour comprendre la norme.")
                p("La norme CMIS se repose principalement sur le format de données que peuvent prendre les différents documents principalement utilisé lors de la gestion de documents comme les fichiers, les dossiers ou les autorisations à ces derniers.")
            }
            card("Le développement du serveur") {
                p("Une fois la théorie sur la norme acquise, nous avons commencé le développement du serveur. Nous avons développé un serveur C#, ce langage étant demandé lors du semestre 3 du cursus d'ingénieur chez Intech (actuellement Groupe ESIEA).")
                p(
                    "J'avais en plus la charge de chef de projet sur cette réalisation. L'un de mes devoirs fut donc la communication avec notre client. Notre contact dans l'entreprise Kadys était Dominique, le responsable informatique de la société." +
                            "Ce dernier étant un développeur, j'ai pu établir un rapport \"intime\" avec lui, en le mettant dans la boucle des validations de codes notamment." +
                            "Ce rapport m'a permis de discuter avec lui des problèmes rencontré par l'équipe directement à leurs apparitions",
                    rich = true
                )
                p("Notre serveur devait fonctionner comme un traducteur c'est à dire:")
                ul {
                    li("Transformer un document du format Moovapps au format CMIS")
                    li("Transformer un document général de la norme CMIS à un équivalent Moovapps")
                }
                p("N'aillant aucune connaissance de ce type de serveur à l'époque, notre client nous avait fourni un exemple de serveur CMIS fait en VisualBasic. Ce dernier était un serveur fonctionnel qui définissait les différents modèle objet de la norme CMIS.")
                p("En prenant comme base ce serveur, nous avons commencé à développer la conversion vers et depuis des documents Moovapps")
                p("Cette première étape fut complexe, car il a fallut comprendre les différents champs des deux formats de données pour pouvoir les associer.")
                p("Une fois les champs associés, nous avons dû associer les méthodes d'API de Moovapps à un équivalent dans la norme CMIS. Pour être plus explicite, Moovapps dispose d'une API REST permettant à des applications de manipuler les données contenu dans l'outil. Cependant, étant donné que Moovapps dispose de son propre format de données différent de la norme CMIS, les actions associés aux documents Moovapps ne correspondaient pas forcément à des actions disponibles sur des documents CMIS.")
                p("Lors de l'implémentation des modèles objet et des requêtes nécessaires, je n'ai pas rencontré de problèmes à proprement parlé cependant la compréhension de tous ces systèmes mis plus de temps que je l'avais estimé.")
                p(
                    "A la fin du projet d'école, nous avons pu développer un serveur pouvant transformer un objet CMIS en son équivalent Moovapps et vice versa et pouvant modifier un serveur Moovapps.<br/>" +
                            "J'entends par là que les requêtes devant créer ou modifier des fichiers et dossiers Moovapps étaient fonctionnelles. A cela il manquaient les requêtes permettant de modifier les outils se basant sur la norme CMIS.<br/>" +
                            "Cela signifait qu'il était possible du CMIS vers Moovapps mais que l'inverse n'était pas fonctionnel.",
                    rich = true
                )
                p("Pour mettre en place ce système manquant, Kadys m'a proposé un stage de d'un mois pour finir le projet.")
                p("Lors de ce stage, j'ai dû me concentrer sur la partie AtomPub ou Atom, un protocole utilisant du XML. AtomPub est l'un des système d'envoi d'information de la norme CMIS et celui mit en place dans le serveur de base que nous avait fourni le client.")
                p(
                    "Bien que le protocole Atom ne m'est pas posé de problème, j'ai pu en rencontrer dû à la librairie utilisé par le serveur.<br/>" +
                            "Dans la norme cmis, les champs d'un objet dans le format Atom doivent commencer par <code>cmis:[nom-du-champs]</code>. Cependant, la librairie utilisé par le serveur pour créer les XML ajoutait systématiquement <code>xatom:</code> devant les champs XML.<br/>",
                    rich = true
                )
                p(
                    "A la fin de mon stage, j'ai pu montrer la génération des XML à partir de documents Moovapps malgré les noms de champs différents." +
                            "Il avait été décidé que Dominique, mon responsable s'occuperait de trouver une solution pour le format Atom.",
                    rich = true
                )
                p("Malheureusement, le projet a été abandonné suite à la démission de Dominique. N'ayant plus personne pour continué le développement, le projet a dû être abandonné.")
            }
        }
        section("Mon expérience du projet") {
            card("Mon ressenti") {
                p(
                    "Ce projet fut chaotique lors de son démarrage. En effet, le semestre 3 du cursus Intech se porte sur le développement de logiciels de bureau or ce projet est un serveur, ce qui implique qu'il ne dispose pas d'interface utilisateur, et que les cours que nous avons reçu ce semestre ne nous ont pas permit de se lancer sereinement dans ce projet.<br/>" +
                            "Cependant, il fut très enrichissant, du point de vue technique comme humain. J'ai pu découvrir la norme CMIS, ce qui m'a poussé à me documenter, à m'autoformer et de voir que chaque projet apporte son lot de surprise.<br/>" +
                            "Du coté humain, ce projet est le seul dans lequel le client avait des compétences techniques, ce qui a engendré un rapport différent dans la communication et la gestion du projet. Avoir un client compétent dans le domaine technique est un luxe qui permet d'améliorer la productivité de toute l'équipe.",
                    rich = true
                )
                p(
                    "Avec le recul dont je dispose aujourd'hui, je pense que je ne réutiliserai pas le serveur de base que nous a fourni le client. Bien ce que serveur nous ai été utile pour la compréhension de la norme CMIS et nous a évité d'avoir à implémenter le modèle objet de cette dernière, ce serveur nous a empêché de développer un système sur mesure pour Moovapps et à fini par bloquer au niveau du protocole Atom.<br/>" +
                            "Si j'ai le choix du langage, j'opterai sur Java, car j'ai une plus grande connaissance de ce dernier ainsi que du module Spring, permettant de faciliter le développement de serveur.",
                    rich = true
                )
            }
            card("Les apports du projet") {
                p("Malheureusement, les problèmes au niveau du protocole ont empêché l'utilisation du projet à la suite de mon travail. Le projet devait être continué par un développeur pour permettre son utilisation. Ce développeur ayant quitté la société, le projet à dû être abandonné entièrement.")
            }
        }
    }
}