package edu.estebandc.project.layout

import edu.estebandc.project.layout.shared.card
import edu.estebandc.project.layout.shared.section
import io.kvision.core.*
import io.kvision.html.*
import io.kvision.html.image
import io.kvision.panel.vPanel
import io.kvision.utils.auto
import kotlinx.browser.window

fun Container.renderHomePage(): Div {

    return div {
        //region Welcome
        div {
            background = Background(image = "/images/custom-software-development.jpg", color = Color("#00000054"))
            width = maxWidth
            height = 100 to UNIT.vh

            div {
                id = "home-page-title"
                // Div specific css
                position = Position.ABSOLUTE
                left = 350 to UNIT.px
                top = 300 to UNIT.px

                background = Background(Color("black"))

                h1("Développeur Logiciel") {
                    fontFamily = "Inter"
                    color = Color("white")

                    marginBottom = 5 to UNIT.px
                }
                div {
                    width = 250 to UNIT.px
                    height = 4 to UNIT.px

                    background = Background(Color("#477EEB"))
                }
            }
        }
        vPanel {
            margin = auto
            position = Position.ABSOLUTE
            top = 90 to UNIT.vh
            width = 100 to UNIT.vw

            justifyItems = JustifyItems.CENTER
            p("Voir plus") {
                align = Align.CENTER
                color = Color("white")
                marginBottom = 5 to UNIT.px
            }
            image("/images/down_arrow.svg") {
                height = 30 to UNIT.px
            }

            onClick {
                window.location.hash = "#presentation"
            }
        }
        //#endregion Welcome
        //#region Content
        section("Présentation", "Tout savoir sur moi", cssId = "presentation") {
            card(
                header = "Mes valeurs",
            ) {
                p("La méritocratie est pour moi une valeur très importante. Il me parait normal de féliciter une personne travaillant activement et au contraire punir en cas de relâchement.", rich = true)
                p("La prise d'initiative est la seconde de mes valeurs. En tant que développeur, plus encore en tant qu'ingénieur, notre travail est de répondre aux besoins de nos utilisateurs. Pour cela, il faut savoir se former, réfléchir, prendre des décisions pour palier aux problèmes que nous rencontrons tout le long d'un projet.", rich = true)
            }

            card(
                header = "Mon projet professionnel",
            ) {
                p("J'ai débuté ma \"carrière\" en informatique en suivant un cursus en IUT à Blagnac. Ce premier pas dans le domaine m'a permis d'affiner mon projet professionnel. J'y ai constaté que bien qu'aimant le développement, c'est la conception et la gestion d'un projet qui m'intéressait le plus, donc que c'est le métier de <b>chef de projet</b> que j'ai décidé de poursuivre.", rich = true)
                p("Pour développer les compétences nécessaires à ce métier, je me suis inscrit à <i>Intech</i>, qui est devenu par la suite le groupe <i>AEN</i> avant de rejoindre le groupe <i>ESIEA</i>. Cette école avait pour philosophie de développer à la fois des compétences techniques mais aussi humaines, ce qui correspondait parfaitement à mon besoin.", rich = true)
                p("J'y ai obtenu mon bachelor et ai continué pour obtenir un titre d'ingénieur RNCP dont je finalise la dernière année actuellement.", rich = true)
                p("Pendant ces années d'études et de travail, j'ai découvert une entreprise appelée *Jetbrains*, une société connu pour le développement d'IDE tel que <i>IntelliJ IDEA</i>, <i>PyCharm</i> ou encore <i>Android Studio</i>. Cette entreprise est pour moi l'une des plus innovantes de son secteur, n'hésitant pas à s'écarter de sa zone de confort pour améliorer le confort des développeurs en développant de nouveaux outils de gestion de projets , de CI/CD ou encore un langage de développement. Mon admiration pour cette entreprise m'a donné envie d'être embauché par cette dernière, ce qui constitue une partie de mon projet professionnel.", rich = true)
                p("En parallèle de ce projet professionnel, j'aimerais devenir vacataire dans un établissement d'apprentissage d'informatique pour transmettre ma passion et faire découvrir toutes sortes de technologies à de futurs informaticiens.", rich = true)
            }

            card(
                header = "Mes qualités",
            ) {
                p(" La première et la plus importante de mes qualités est ma curiosité. Grâce à elle, je deviens autonome, je développe mes compétences et mon esprit critique. Elle me pousse à toujours chercher et me tenir aux courants des nouveautés dans mon domaine mais aussi à m'intéresser aux parties métiers de mon travail.", rich = true)
                p("De cette qualité en découle une seconde, mon esprit analytique. Ma curiosité pour de nombreux sujets m'a permis de développer un esprit critique me permettant de rapidement analyser un projet ou du code pour en trouver la logique et le fonctionnement. Cela me permet aussi de me remettre en question, d'apprendre de mes erreurs et de ne jamais m'appuyer sur mes connaissances.", rich = true)
            }

            card(
                header = "Mes centres d'intérêt",
            ) {
                p("Mon centre d'intérêt principal est la découverte de \"nouvelles technologies\" au sens large.", rich = true)
                    p("J'aime découvrir de nouvelles techniques, de nouveaux outils, de nouveaux langages.", rich = true)
                    p("Je mets un point d'honneur à rester à jour sur les téléphones, tablettes, consoles ou objets connectés. Je prends plaisir à voir ce qui a changé, comment les entreprises font évoluer leurs produits. Cela ne s'arrête pas à des outils physiques mais aussi à des logiciels comme ceux de <i>Jebrains</i>, des jeux, des applications mobiles ou même des langages de développement.", rich = true)
                    p("Récemment, je m'intéresse tout particulièrement à un outils tout-en-un de *Jetbrains* appelé <i>Space</i>. Il s'agit d'un service regroupant l'ensemble des besoins d'une organisation de développement comme une gestion de messagerie, d'absences mais aussi de packaging, de versioning, d'intégration continue et de gestion de projet.", rich = true)
            }
        }
        section("Expériences", "Découvrez mes travaux et compétences") {
            card(
                header = "Mon cursus",
            ) {
                p("Découvrez mon cursus de mon BAC à aujourd'hui !")
            }

            card(
                header = "Mes projets",

            ) {
                p("Tous mes projets les plus fous !")
            }
            card(
                header = "Mes compétences",

            ) {
                p("Si vous voulez savoir ce que j'ai dans le ventre !")
            }
        }
        //#endregion Content
    }
}