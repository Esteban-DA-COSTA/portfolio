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
                "Ce langage permet de développer de nombreuses solutions tels que des serveurs web, des applications mobiles ou de bureau.",
                ),
            SkillType.TECHNIQUE,
            SkillLevel.EXPERT
        )
        section("L'actualité") {
            card("Historique") {
                p("Java est un langage existant depuis 1995 et qui continue d'évoluer avec sa version 21 sortie le 20 septembre 2023.")
                p("Cette version ajoute notamment l'utilisation de Threads virtuels et la finalisation des objets de type <i>Record</i>.", rich = true)
            }
            card("Les points forts de Java") {
                p("L'un des plus grands avantages de Java est ça portabilité. En effet, Java est un langage et une technologie qui utilise une machine virtuel pour exécuter ses programmes, cela permet d'être indépendant du système d'exploitation hôte et ainsi pouvoir être utilisé sur toutes les plateformes.")
            }
            card("Mon utilisation de Java") {
                p("Pour ma part, j'ai pu mettre en pratique cette compétence dans de nombreux projets comme :")
                ul {
                    link("Une application mobile d'emploi du temps", "/${Category.PROJECTS.url}/${Project.FLOD_EDT_MOBILE.url}")
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
            }
        }
        section("Le niveau que j'ai atteint") {
            card("Mon expertise du java") {
                p("Le Java fut le premier langage de programmation que j'ai appris et celui dont je suis le plus compétent. A ce titre, je place mon niveau d'expertise à celui d'*expert*. Il me reste encore beaucoup à apprendre sur ce langage, mais je suis assez compétent pour me sortir de la plupart des problèmes que je peux rencontrer dessus. De plus, je mets un point d'honneur à connaitre et respecter les idiomes du langage.")
            }
            card("Ma marge de progression") {
                p("Java étant pluri-situationnel, il y a des domaines que je connais moins, comme l'utilisation de Java dans des projets dit \"critique\" où l'on manipule des données entre plusieurs threads ou même applications.")
            }
            card("Sa place dans mon profil") {
                p("Ce langage reste malgré tout la compétence centrale de mon profil d'ingénieur et la compétence que je mets en avant pour mes recherches d'emplois.")
            }
            card("Mon regard sur la technologie") {
                p("Je pense que Java est un langage à connaitre car il est relativement simple à apprendre pour commencer l'informatique mais surtout que la connaissance de ce langage ouvre de nombreuses portes car Java permet d'implémenter un grand nombre de solutions différentes")
                p("En connaissant le Java, il est possible de devenir développeur mobile, développeur back-end, développeur d'application de bureau et même développeur web (même si c'est un domaine où il vaut mieux utiliser d'autres technologies.).")
            }
        }

    }
}