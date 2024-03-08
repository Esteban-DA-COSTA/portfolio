package edu.estebandc.project.layout.skills

import edu.estebandc.project.Category
import edu.estebandc.project.Project
import edu.estebandc.project.SkillLevel
import edu.estebandc.project.SkillType
import edu.estebandc.project.layout.shared.card
import edu.estebandc.project.layout.shared.section
import edu.estebandc.project.layout.shared.skillSummary
import io.kvision.core.Container
import io.kvision.html.*

fun Container.javaSkillPage(): Container {
    return div {
        skillSummary(
            "Java",
            listOf(
                "Java est un langage de programmation orienté objet portable.",
                "Ce langage est l'un des plus populaires et influents, a profondément marqué le paysage de la technologie depuis sa création. Conçu pour être portable, sûr et robuste, Java est largement utilisé dans une multitude d'applications, des applications mobiles aux systèmes embarqués en passant par les applications d'entreprise.",
                ),
            SkillType.TECHNIQUE,
            SkillLevel.EXPERT
        )
        section("L'actualité") {
            card("Historique") {
                p("Java est un langage existant depuis 1995 et qui continue d'évoluer avec sa version 21 sortie le 20 septembre 2023.")
                p("Cette version ajoute notamment l'utilisation de Threads virtuels et la finalisation des objets de type <i>Record</i>. Ces évolutions permettent à Java d'améliorer sa syntaxe et son fonctionnement, pour lui permettre de rester", rich = true)
            }
            card("Les points forts de Java") {
                p("L'un des plus grands avantages de Java est ça portabilité. En effet, Java est un langage et une technologie qui utilise une machine virtuel pour exécuter ses programmes, cela permet d'être indépendant du système d'exploitation hôte et ainsi pouvoir être utilisé sur toutes les plateformes.")
                p("De plus, dans le monde professionnel, java est l'un des langages les plus plurisituationnel. Il permet de faire à la fois des logiciels de bureau, des solutions web ou des applications mobiles.")
                p("C'est deux points forts font de Java l'un des langages les plus utilisés dans le monde car ils lui permettent d'être polyvalents peut importe le domaine.")
            }
            card("Mon utilisation de Java") {
                p("Pour ma part, j'ai pu mettre en pratique cette compétence dans de nombreux projets comme :")
                ul {
                    link("Une application mobile d'emploi du temps", "/${Category.PROJECTS.url}/${Project.FLOP_EDT_MOBILE.url}")
                    link("Une application de réseau social pour un quartier", "/${Category.PROJECTS.url}/${Project.LINKED.url}")
                    link("Des applications de test de vol d'avions", "/${Category.PROJECTS.url}/${Project.TSAS.url}")
                }
            }
        }
        section("Des preuves d'applications") {
            card("TSAS") {
                p("Pour les applications de test vol d'avions par exemple, j'ai pu mettre en place cette compétence pour l'implémentation d'API REST. L'API étant développée via la technologie Spring Boot, l'ensemble de l'application est en Java. Lorsque j'ai du modifier cette API pour résoudre des incidents utilisateurs, j'ai donc dû comprendre et modifier du code Java.")
            }

            card("FlOpEDT") {
                p("Le projet FlOp EDT quant à lui, est une application mobile Android développée entièrement avec Java, et qui fut donc le centre de ce projet.")
                p("Plus précisément, j'ai pu mettre en pratique mes connaissances du Java lors de l'implémentation des différents types d'utilisateur avec l'héritage.<br/>" +
                        "L'héritage en Java m'a permit de mettre en place différents types d'utilisateur ayant un certain nombre d'information en commun mais disposant d'accès différents à l'application.<br/>" +
                        "Grâce à cela, un professeur pouvait modifier l'emploi du temps, un élève ne pouvait que l'afficher.", rich = true)
            }
        }
        section("Le niveau que j'ai atteint") {
            card("Mon expertise du java") {
                p("Le Java fut le premier langage de programmation que j'ai appris et celui dont je suis le plus compétent. A ce titre, je place mon niveau d'expertise à celui d'<i>expert</i>.", rich = true)
                p("Il me reste encore beaucoup à apprendre sur ce langage, mais je suis assez compétent pour me sortir de la plupart des problèmes que je peux rencontrer dessus. De plus, je mets un point d'honneur à connaitre et respecter les idiomes du langage. <br/>" +
                        "Java étant pluri-situationnel, il y a des facettes du langage que je maitrise moins. Le Java permet de développer des programmes multitâches, avec plusieurs parties de code s'exécutant en même temps. Il s'agit d'un domaine dans lequel je suis néophyte.", rich = true)
            }
            card("Sa place dans mon profil") {
                p("Comme j'ai plus l'expliquer, Java est le premier langage que j'ai appris, celui dans lequel je suis le plus compétent et qui m'a servis de base. <br/>" +
                        "Aujourd'hui, j'ai atteint un niveau suffisant selon moi et je ne pense pas me former dessus. Je préfère me former sur le langage Kotlin, qui est un langage utilisant la JVM pour être interopérable avec Java mais avec une syntaxe plus moderne.<br/>", rich = true)
            }
            card("Mes conseils pour apprendre Java") {
                p("Je pense que Java est un langage à connaitre car il est relativement simple à apprendre pour commencer l'informatique mais surtout que la connaissance de ce langage ouvre de nombreuses portes car Java permet d'implémenter un grand nombre de solutions différentes.")
                p("En connaissant le Java, il est possible de devenir développeur mobile, développeur back-end, développeur d'application de bureau et même développeur web (même si c'est un domaine où il vaut mieux utiliser d'autres technologies.).")
                p("Enfin, Java est un langage respectant les normes de la programmation orienté objet, ce qui en fait un atout majeure pour tout développeur.", rich = true)
            }
        }

    }
}