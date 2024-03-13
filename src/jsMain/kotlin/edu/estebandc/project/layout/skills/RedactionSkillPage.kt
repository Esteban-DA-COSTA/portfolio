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

fun Container.redactionSkillPage() = div {
    skillSummary(
        "Rédaction de documentation",
        listOf(
            "La rédaction de documentation est la capacité à rédiger des documents explicatifs.",
            "Ces documents peuvent servir aux développeurs, aux administrateurs, aux clients ou toute autre personne qui pourrait être en contact avec le projet développé."
        ),
        SkillType.HUMAIN,
        SkillLevel.AUTONOME
    )
    section("La documentation, une priorité") {
        card("La nécessité de la documentation") {
            p("La documentation est avant tout un moyen de mettre au clair ses pensées et schémas de réflexion. Elle permet de mieux communiquer et faire comprendre ses propos.")

        }
        card("La documentation en amont") {
            p("L'avènement des nouvelles technologies ont fait ressortir de nombreux besoins dans tous les domaines. Que l'ont soit maçon, pilote d'avion ou agent immobilier, il y a toujours des situations ou l'on souhaite informatiser un processus.")
            p("Cependant, pour un développeur, il est souvent difficile de comprendre les processus spécifiques à chaque métier. La documentation devient alors nécessaire pour comprendre les besoins d'un client et l'objectif d'un projet.")
            p("La première documentation qui doit être rédigé dans un projet est celle permettant de définir les besoins, les avantages et les risques d'un projet.")
            p("On peut aussi documenter la conception, pour avoir un fil directeur lors de l'implémentation.")
        }
        card("La documentation en aval") {
            p("Avec l'évolution des technologies, les projets informatiques sont devenus de plus en plus complexe, que ce soit pour leur développement, leur installation ou leur utilisation.")
            p("Pour palier à cette complexité, documenter son travail et former les utilisateurs est devenu de plus en plus critique. La documentation d'un projet peut servir à de nombreuses personnes.")
            p("Cela peut servir à un autre développeur qui pourrait reprendre le projet pour comprendre le fonctionnement technique derrière une solution.")
            p("Les administrateurs réseaux ont aussi besoin de documentation sur comment installer des projets dans leurs environnements.")
            p("Des tutoriels et des explications peuvent aussi s'avérer utiles aux utilisateurs pour comprendre comment utiliser une solution informatique.")
        }
        card("Le nec plus ultra des développeurs") {
            p("Par le passé, la documentation est passé au second plan dans les formations des développeurs. Aujourd'hui, un développeur sachant écrire une documentation claire sera parmi les profils les plus recherchés.")
            p("Etre capable de rédiger des documentations c'est s'assurer d'être capable de transmettre son travail. Il s'agit d'un savoir important dans le monde informatique d'aujourd'hui.")
        }
    }
    section("Mes documentations") {
        card("De la documentation pour comprendre un projet") {
            p(
                "Sur le projet <a href='${Category.PROJECTS.url}/${Project.LINKED.url}'>Linked</a> j'ai réalisé des documentations pour conceptualiser tous les composants de la solution. Cela comprenait une documentation pour conceptualiser les interfaces graphiques et une pour la conception de l'API.",
                rich = true
            )
            p(
                "Pour la documentation sur les interfaces graphiques, j'ai rédigé une documentation pour comprendre les objectifs de ces dernières, notamment leurs rôles et les avantages du site web par rapport à l'application mobile et vis-versa.<br/>" +
                        "Il était aussi inclus des maquettes pour avoir une idée du design de chaque interface.",
                rich = true
            )
            p(
                "La documentation sur l'API quant à elle a été réalisé lors de sa ré-implémentation avec Ktor. Etant le seul connaisseur de cette technologie dans l'équipe, j'ai écris la documentation pour faire comprendre le fonctionnement de l'API aux autres membres de l'équipe.<br/>" +
                        "Pour cela, j'ai explicité l'architecture de dossiers de l'API, pour comprendre où trouver chaque classes et fonctions utilisées. J'y ai aussi intégré l'explication des modèles objets et les schémas de la base de données.",
                rich = true
            )
            p(
                "Ces deux documentations nous ont été utiles tout au long du projet.<br/>" +
                        "Tout d'abord, la documentation des interfaces nous ont permis pendant la phase de conception de projet de montrer ce que nous avions l'intention de développer à notre client. Celui-ci a pu faire des retours pour que nous comprenions au mieux ce qu'il voulait.<br/>" +
                        "Pour l'API la documentation a permis de relever des zones d'ombres, avec notamment l'absence de photos de profil dans la table régissant les utilisateurs dans la base de données.",
                rich = true
            )
            p(
                "Dans ce projet, les documentations faite en amont nous ont permis d'éviter des erreurs qui nous auraient forcé de redévelopper tout ou une partie de l'application.<br/>" +
                        "Cela nous a aussi permis d'être sûr de la conformité de la solution développée avec la vision du client.",
                rich = true
            )
        }
        card("La documentation d'API") {
            p("Le principe des API et de fournir un moyen pour d'autres développeurs d'utiliser une partie d'un programme dans le leur. A ce titre, la documentation des API est nécessaire pour comprendre comment les utiliser.")
            p(
                "Sur le projet <a href='${Category.PROJECTS.url}/${Project.TSAS.url}'>TSAS</a>, j'ai dû mettre à jour de la documentation sur l'API.",
                rich = true
            )
            p(
                "Les API chez TSAS ont été faites grâce à Spring boot avec un plugin swagger. Ce plugin permet de générer la documentation de l'API directement en analysant le code. Cependant, cela permet de définir uniquement la documentation explicitant le formats d'entrée et de sorties des routes d'API.<br/>" +
                        "Après avoir généré un template de ma nouvelle route grâce à swagger, j'ai modifié le fichier de spécification open API (le fichier de documentation) pour ajouter une description détaillée de la route ainsi que des différents code HTTP qu'il était possible d'avoir en l'utilisant.",
                rich = true
            )
            p("Ces documentations ont ensuite servies pour les membres de l'équipe Front-end développant les interfaces graphiques de TSAS pour savoir comment utiliser la nouvelle routes.")
        }
    }
    section("Mon expertise") {
        card("Mon niveau") {
            p("Sur tous les projets sur lesquels j'ai travaillé, j'ai réalisé des documentations, que ce soit en amont ou en aval du développement, ce qui me permet d'avoir un niveau <b>autonome</b>.")
            p("Mon expertise de la rédaction de documentation reste à ses débuts malgré tout. En effet, un point important de la rédaction de documentation est la forme. Même si j'ai pris l'habitude de documenter mon travail, je dois encore m'améliorer sur la forme des documents pour améliorer leurs compréhension.")
            p("Pour améliorer la forme de mes documents, je pense utiliser à l'avenir le logiciel WriterSide de Jetbrains conçu spécialement pour la documentation.")
        }
        card("Sa place dans mon profil") {
            p("Bien qu'étant une compétence séparée, bon nombre de documentation relève du travail de chef de projet. On peut prendre par exemple des documentation financière ou marketing pour faire vendre une solution. Le chef de proje étant garant de la réussite du projet, il est responsable de la qualité des livrables fournis, dont la documentation.")
            p(
                "A ce titre, il s'agit d'une des compétences les plus importantes de mon profil. Vu mon niveau, améliorer mes compétences dans ce domaine est ma priorité.<br/>" +
                        "Pour cela, j'ai demandé dans mon projet actuel d'être rédacteur de l'ensemble des documentations et d'être formé là-dessus par mon référent.",
                rich = true
            )
        }
        card("Mes conseils") {
            p("Si vous n'êtes pas un rédacteur né, je vous conseille de vous inspirez de documentation que vous appréciez. Regardez l'architecture de la documentation, comment sont présentés les informations, le style graphique. Toutes ces informations vont vous permettre de rédiger une documentation lisible.")
            p("Pour le fond, demandez à d'autres personnes de lire votre documentation et assurez vous qu'avec elle ils arrivent à la comprendre.")
            p("Enfin, il existe de nombreux outils pour aider à la rédaction, par exemple si vous rédigez des documentations sur notion, un outil de prise de note, il existe des modèles de page pour les préremplir.")
            p("Je conseille notamment le logiciel WriterSide pour la rédaction de documentation technique. Il permet de disposer d'un système pour rédiger la documentation facilement, et vous trouverez des indications sur l'utilisation des composants. Il permet aussi de mettre en ligne facilement la documentation en donnant des tutoriels pour les installer sur github ou gitlab.")
        }
    }
}