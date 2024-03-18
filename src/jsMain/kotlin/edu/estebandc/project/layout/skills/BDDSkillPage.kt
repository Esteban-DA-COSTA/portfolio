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
import io.kvision.html.li
import io.kvision.html.p
import io.kvision.html.ul

fun Container.bddSkillPage() = div {
    skillSummary(
        "Gestion de base de données",
        listOf(
            "La gestion de base de données permet de stocker des informations",
            "Elle repose principalement sur le langage SQL permettant de définir les actions à effectuer sur la base."
        ),
        SkillType.TECHNIQUE,
        SkillLevel.EXPERT
    )
    section("Le stockage d'information") {
        card("Les bases de données") {
            p("Dans le développement, peut importe le domaine, il est souvent nécessaire de stocker certaines informations comme les identifiants des utilisateurs, des images ou encore des données spécifiques au fonctionnement du projet.")
            p(
                "Pour stocker ces informations, il existe plusieurs possibilités.<br/>" +
                        "La plus simple consiste à les stocker dans des fichiers inclus dans le projet. Ce système a néanmoins ses limites car plus les informations sont importantes, plus la taille du programme va augmenter.<br/>" +
                        "La deuxième consiste à utiliser une base de données. Ces bases sont des serveurs permettant de stocker mais aussi d'organiser les données. Ce système est privilégié dans le développement dès lors que le nombre d'informations à stocker devient conséquent.",
                rich = true
            )
        }
        card("La gestion des BDD") {
            p("On entend par gestion de base de données la capacités à créer des requêtes SQL pour effectuer diverses actions sur ces dernières. Parmi ces actions, on peut noter par exemple la création de tables et de liens. L'ajout de données dans ces tables ainsi que leur récupération.")
            p("Savoir gérer une base de données permet aux développeurs de pouvoir définir une base de données sur mesure par rapport à son projet et surtout de stocker toutes les informations nécessaire.")
        }
    }
    section("Mes bases de données") {
        card("Une base de données adaptées aux besoins") {
            p(
                "Lors du développement de <a href=${Category.PROJECTS.url}/${Project.LINKED.url}>Linked</a>, il nous a fallu stocker plusieurs informations comme :",
                rich = true
            )
            ul {
                li("Les données de connexion des utilisateurs")
                li("Les profils utilisateurs")
                li("Les publications")
                li("Les commerces favoris des utilisateurs")
            }
            p(
                "Pour organiser ces différentes données et les stocker de façon permanente, j'ai conçu une base de données adaptée à nos besoins. En effet, en Europe, le stockage d'information est réglementé par le <b>RGPD</b>, le Règlement Général sur la Protection des Données. Elle définit des règles pour protéger les personnes vis-à-vis de leurs données personnelles.",
                rich = true
            )
            p("Dans le cas de Linked par exemple, nous devions stocker certaines informations pour identifier un utilisateur lors de la connexion comme son nom ou son email. Etant le responsable de la base de données, j'ai dû m'assurer que ces données soient sécurisées pour éviter leur diffusion. Pour cela j'ai défini un utilisateur sur la base de données ayant un accès restraint aux informations afin de limiter les possibles attaques.")
            p(
                "En plus de la sécurité des données, étant donné que j'ai conçu la base de données de zéro, j'ai aussi défini l'architecture de cette dernière par exemple les différentes tables qui la composent. Pour définir les tables de la base de données, j'ai tout d'abord réfléchi aux liens qui existaient entre mes différentes informations comme celle entre une publication et son auteur ou encore entre un favori et le commerce qu'il représente.<br/>" +
                        "Une fois cela fait, je me suis concentré à la composition de chacunes de mes données. Une publication est composé d'un titre, d'un message, d'une date de publication et bien entendu, d'un auteur.<br/>" +
                        "Grâce à ces recherches, j'ai pu définir des schémas MCD et MLD, qui sont des schémas permettant de visualiser l'architecture d'une base de données. Cela est nécessaire pour s'assurer de la bonne conception de la base.<br/>" +
                        "Ce n'est qu'une fois sûr de la conception que j'ai pu créer les tables et définir les liens dans la base de données.",
                rich = true
            )
            p("Mon travail de compréhension et de conception de la base de données nous ont évités de devoir la modifier durant le projet. En effet, si la base n'avait pas été conforme au RGPD, nous aurions été dans l'illégalité, ce qui nous aurait forçé à la redéfinir. Nous aurions dû faire la même chose s'il avait manqué des liens ou des tables en cas de mauvaise conception.")
        }
        card("Une base versionnée") {
            p(
                "Contrairement à Linked ci-dessus, sur <a href='${Category.PROJECTS.url}/${Project.EREC.url}'>eRec</a>, la base de données était déjà existante lors de mon arrivée sur le projet. On m'a tout de même demandé de la modifier afin de rajouter des informations en vue d'une nouvelle fonctionnalité. Cette fonctionnalité avait pour but d'ajouter des \"besoins\".",
                rich = true
            )
            p("Il m'a fallu pour cela tout d'abord comprendre l'architecture de la base de données, pour comprendre à quoi correspondaient les tables et les informations contenues dedans. J'ai ainsi pu constater qu'une partie des informations qui me serait nécessaire pour les besoins était déjà existante dans la table Candidat.")
            p("Cette recherche m'a permis de bien comprendre les informations à ajouter et m'a permis d'éviter d'en dupliquer.")
            p("J'ai créé une table nommé Besoin dans lequel j'ai ajouté les informations nécessaire et j'y ai créé un lien vers Candidat pour pouvoir récupérer les informations déjà existantes.")
            p("Une fois les modifications effectuées, j'ai dû faire une nouvelle version de la base de données. Cela signifie que j'ai créé une \"image\" de la base de données avant et après mes modifications, de sorte de pouvoir revenir à une version fonctionnelle en cas de problème suite à mes modifications.")
        }
    }
    section("Mon expertise") {
        card("Mon niveau") {
            p(
                "En plus des anecdotes ci-dessus, j'ai aussi beaucoup travaillé la gestion de projet lors de mon cursus en IUT. Ce dernier était d'ailleurs l'un de plus reconnu dans ce domaine grâce aux nombreux modules consacrés dessus. Grâce à toutes ces expériences, j'ai pu atteindre un niveau <b>expert</b>.",
                rich = true
            )
            p("Malgré tout, mon expertise s'arrête aux bases de données relationnelles. J'ai donc encore tout un domaine à apprendre avec les bases non relationnelle comme les bases de données noSQL.")
            p("Niveau formation, je n'ai pas pour objectif d'en faire actuellement.")
        }
        card("Sa place dans mon profil") {
            p(
                "Bien que j'apprécie la gestion de base de données, il s'agit d'une compétence très accès sur le développement pur, donc assez éloigné de mon objectif de chef de projet. Cependant, avant d'être chef de projet, il faut à mon sens être un développeur, pour comprendre au mieux les risques et le travail requis lors d'un projet. <br/>" +
                        "En plus de cela, la gestion de base de données permet de développer des compétences dans leur conception, ce qui peut être un réel plus pour un chef de projet.",
                rich = true
            )
        }
        card("Mes conseils") {
            p("Pour toute personne qui souhaitent se lancer dans la gestion de base de données, je recommande de toujours passer par les schémas MCD et MLD. Bien qu'il soit facile de se lancer directement dans la création de la base de données, c'est la conception qui différencie un gestionnaire lambda d'un bon dans ce domaine. Les bases de données sont l'un des serveurs les plus gourmands en ressources si elles ne sont pas bien faites.")
            p(
                "Je conseille aussi d'apprendre à mettre des bases de données en production, car j'ai personnellement eu beaucoup plus de problèmes lors de la connexion à la base plutôt qu'à sa création.<br/>" +
                        "Les bases de données sont des serveurs à part entière qui selon le type dispose de nombreuses configurations pour autoriser/refuser les connexions des différents clients.",
                rich = true
            )
        }
    }
}