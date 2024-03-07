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

fun Container.projectManagmentSkillPage(): Container {
    return div {
        skillSummary(
            "Gestion de projet",
            listOf(
                "Les capacités de gestion sont les compétences qui permettent de comprendre les enjeux d'un projet, d'organiser le travail et de gérer les imprévus qui peuvent survenir.",
                "Ces compétences sont tout aussi importance que le développement en lui même, car une bonne gestion de projet permet de limiter les problèmes et améliorer la qualité du travail fourni."
            ),
            SkillType.HUMAIN,
            SkillLevel.CONFIRME
        )
        section("Un projet, bien plus que du code") {
            card("La gestion de projet, un garant de réussite") {
                p(
                    "Un projet informatique ne se définit pas seulement par le code fourni à un client. Il s'agit d'un ensemble d'enjeux à la fois techniques et humains dont la finalité se traduit par une solution permettant de répondre aux besoins d'un client.<br/>" +
                            "Parmi ces enjeux, nous pouvons trouver la définition des objectifs, la coordination des tâches, la gestion des ressources, ainsi que la planification des risques. A cela se rajoute les relations entre les différentes parties, les compétences des membres de l'équipe et sa communication interne.",
                    rich = true
                )
                p("L'analyse et la prise en compte de ces enjeux sont le garant de réussite du projet. La gestion de projet est donc un fondamental qu'il est nécessaire de maitriser pour tout ingénieur qui sera amené à proposer et répondre aux besoins de différents clients.")
                p(
                    "Aujourd'hui, de nombreuses techniques permettent d'appréhender la gestion de projet de différentes façon. Nous pouvons noter parmi ces techniques la gestion de projet dit \"classique\", comme la <i>gestion de projet en V</i> qui définit une hiérarchie dans l'équipe, avec à sa tête le <i>chef de projet</i>, garant de la gestion du projet.<br/>" +
                            "Cependant, lors des dernières années, d'autres techniques ont fait leurs apparitions, sous l'appellation de gestion de projet agile, dont le but est d'améliorer la réactivité des équipes pour répondre le mieux possible aux besoins des clients. Ces méthodes ne définissent habituellement pas de chef de projet et c'est donc toute l'équipe, développeur comme client qui ont à charge de gérer le projet.",
                    rich = true
                )
            }
        }
        section("Mes expériences dans la gestion de projet") {
            card("Klassifile, un projet plein de rebondissements") {
                p(
                    "<a href='${Category.PROJECTS.url}/${Project.KLASSIFILE.url}'>Klassifile</a> est une réalisation que j'ai mené en tant que <b>SCRUM Master</b>, un rôle défini dans une méthodologie agile appelé <i>SCRUM</i>. Cette méthodologie favorise les retours réguliers de l'équipe de développement envers un représentant du client pour qu'il puisse faire des retours sur le développement.",
                    rich = true
                )
                p("Le rôle de Scrum master est un rôle important, car c'est sur lui que repose la mise en place de toute la méthodologie de gestion de projet. Plus spécifiquement, c'est moi qui avait la résponsabilité que chacun joue son rôle, mettre en place les réunions étapes défini par la méthodologie SCRUM ainsi que de régler les problèmes qu'elle pouvait apporter.")
                p("Sur Klassifile notamment, j'ai mis en place de multiples réunions avec notre client pour discuter de son besoin qui s'éloignait parfois trop du travail que nous devions effectuer pour l'école.")
            }
            card("Linked, l'importance de la répartition des tâches") {
                p("Linked fut le deuxième projet où l'on m'a donné la charge de chef de projet.")
                p("Sur ce projet, on nous a demandé de réaliser une application permettant aux commerces d'un quartier de Montauban de communiquer avec leurs clientèles. L'application Linked se compose de multiples sous applications. Un site web, une API REST et une application mobile.")
                p(
                    "Ces différents composants pour ce projet ont significativement allongé la charge de travail de l'équipe, j'ai donc répartis les tâches en fonction des points forts de chacun.<br/>" +
                            "Lors de la conception, j'ai laissé les membres de l'équipe ayant la plus grande sensibilité artisique s'occuper des maquettes graphiques tandis que les autres travaillé sur la conception de la base de données et des requêtes de l'API.<br/>" +
                            "Lors de l'implémentation, j'ai fait en sorte que tout le monde puisse travailler sur chaque composants, mais ai défini des responsables pour chacun, permettant ainsi d'avoir un suivi du développement tout en permettant aux membres de se former sur leurs points faibles.",
                    rich = true
                )
            }
        }
        section("Mon niveau") {
            card("Mon expertise en gestion de projet") {
                p(
                    "Grâce à mes projets d'école notamment, j'ai pu développer des compétences dans la gestion de projet, que ce soit en tant que chef de projet pur, SCRUM Master ou simple développeur. Ces multiples expériences m'amène à dire que je suis <b>confirmé</b> dans ce domaine.",
                    rich = true
                )
                p(
                    "Il faut tout fois noter que mes compétences viennent principalement de projet effectué dans le cadre de mon cursus universitaire. Ces projets ont été réaliser pour de vrais clients, mais disposaient d'un environnement protégé, dans lequel il m'était possible de faire des erreurs.<br/>" +
                            "Dans le milieu strictement professionnel, il m'ait arrivé d'avoir des responsabilités sur une partie d'un projet mais pas d'être le gérant de l'ensemble de ces derniers.",
                    rich = true
                )
                p(
                    "La gestion de projet est un sujet vaste, il existe de nombreuses méthodologies différentes que ce soit en gestion de projet classiques ou agile.<br/>" +
                            "Pour ma part, je n'ai eu l'occasion que d'essayer les méthodes de gestion de projet en V (gestion de projet classique) ou la méthode SCRUM (gestion de projet agile).<br/>" +
                            "Il me reste donc beaucoup à apprendre, comme la gestion de projet en W ou la méthode Kanban.",
                    rich = true
                )
            }

            card("Sa place dans mon profil") {
                p(
                    "Le travail que je souhaite faire dans le futur est celui de chef de projet, la gestion de ces derniers est donc la compétence la plus essentiel de mon profil. Malheureusement, il s'agit d'une compétence difficile à faire vendre en tant que junior.<br/>" +
                            "Pour ce faire, je vais tout d'abord travailler en tant que développeur et être pro-actif sur les questions portant sur la gestion de projet pour montrer mes compétences.<br/>" +
                            "Je pense aussi passer des certifications comme <i>Professional Scrum Master and Product Owner (PSMPO) (Réf. SM1)</i> pour ajouter du poids à mes candidatures.",
                    rich = true
                )
            }
            card("Mes conseils sur la gestion de projet") {
                p("La gestion de projet est un travail réfléchi, de nombreux chercheurs ont travaillé sur les méthodologies que j'ai pu citer dans cette article. Ces méthodologie repose sur des règles, des conventions et des recommandations. il est important d'apprendre la théorie qui repose derrière elles pour mener à bien un projet.")
                p("Cependant, comme souvent, la mise en pratique de la théorie peut poser problème. Chaque projet est différent par sa taille, ses objectifs, sa durée. Pour avoir une bonne gestion de projet, il faut être capable de repérer les limites de ces théories et de s'avoir sans écarter pour résoudre des problèmes spécifiques à son projet.")
                p("Un bon chef de projet est une personne qui connait les méthodologies, est capable de les mettre en pratique et de les modifier pour les façonner sur mesure au projet sur lequel il travaille.")
            }
        }
    }
}