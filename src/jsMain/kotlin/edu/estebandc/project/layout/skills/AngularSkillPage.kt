package edu.estebandc.project.layout.skills

import edu.estebandc.project.SkillLevel
import edu.estebandc.project.SkillType
import edu.estebandc.project.layout.shared.card
import edu.estebandc.project.layout.shared.section
import edu.estebandc.project.layout.shared.skillSummary
import io.kvision.core.Container
import io.kvision.html.div
import io.kvision.html.p

fun Container.angularSkillPage() = div {
    skillSummary(
        "Angular",
        listOf(
            "Angular est une framework permettant de développer des sites web",
            "Il fourni un environnement et des composants pour simplifier leur développement"
        ),
        SkillType.TECHNIQUE,
        SkillLevel.AUTONOME
    )
    section("L'évolution du web") {
        card("Une technologie diversifiée") {
            p(
                "Pour développer des applications web, il existe une multitude de langages, de librairies et de framework. Cette diversité a vu le jour avec les évolutions des technologies.<br/>" +
                        "Internet est passé d'un réseau pour afficher du contenu texte à un outil dans lequel on peut regarder des vidéos, stocker et télécharger des informations, mais aussi travailler et communiquer.<br/>" +
                        "Ces évolutions ont poussé les développeurs à trouver de nouveaux moyens pour implémenter ces systèmes.",
                rich = true
            )
            p(
                "C'est ainsi qu'est apparu Angular, un framework contenant tout le nécessaire pour développer des applications web, de sites statiques à des solutions complexes.<br/>" +
                        "Angular est l'une des technologies les plus influentes des dernières années dans le développement web, il s'agit d'un \"must know\" pour un développeur web car il tombera forcément sur un projet l'utilisant dans sa carrière.<br/>" +
                        "Le point fort de ce framework est sa simplicité de mise en place et d'utilisation. Là où d'autre framework comme React demande l'installation d'autres librairies graphiques ou fonctionnelles pour être le plus personnalisable possible, Angular propose un tout-en-un permettant de développer des applications web rapidement.",
                rich = true
            )
        }
    }
    section("Mon utilisation d'Angular") {
        card("Angular a l'école") {
            p("J'ai utilisé Angular la première fois sur un projet d'école, Linked. Pour ce projet, nous devions développer un site web pour servir de \"réseau social\" pour un quartier de la ville de Montauban.")
            p(
                "Sur ce projet, il nous a été demandé d'implémenter le site web avec Angular où il nous a permis de simplifier le développement notamment pour les requêtes assynchrones.  En effet, sans Angular, j'avais l'habitude d'utiliser AJAX, un système permettant de mettre à jour une page sans la recharger entièrement lors que de nouvelles données arrivent.<br/>" +
                        "Angular permet d'effectuer ces requêtes assynchrones facilement grâce à des <i>promesses</i>. Ces promesses permettent d'indiquer à l'application que des données vont arriver dans le futur, et donc de se mettre à jour." +
                        "Sur Linked, ces promesses ont servies dans les appels que le site web faisait à l'API REST, permettant ainsi de mettre à jour le fil d'actualité des commerces par exemple.",
                rich = true
            )
        }
        card("Angular en entreprise") {
            p(
                "Chez Capgemini, j'ai utilisé Angular pendant mon stage et pendant mon alternance, sur deux projets différents. Le plus représentatif est le projet TSAS j'ai travaillé dessus 1 an et demi et TSAS comprends deux sites Angular.<br/>" +
                        "Pour chacun des sites, mon principal travail fut la maintenance. A ce titre, il est difficile de parler d'une application en particulier d'Angular. J'ai par exemple utilisé mes connaissances d'Angular pour implémenter des modifications sur l'envoi de certaines requêtes d'API, modifier des modèles objets des applications pour ajouter ou supprimer des informations ou encore mis en place des tests unitaires pour valider les composants Angular.",
                rich = true
            )
        }
    }
    section("Mon expertise") {
        card("Mon niveau") {
            p(
                "J'ai utilisé Angular dans pas mal de situations, entre les projets d'écoles et ceux d'entreprises, je pense être <b>autonome</b> sur le sujet.<br/>" +
                        "Malgré mon utilisation d'Angular, le web est un domaine que je ne maitrise pas, et bien que je comprenne l'usage du framework, je pense que mes lacunes dans le domaine du web ne me permettent pas de me considérer comme plus expérimenté que cela.",
                rich = true
            )
            p("Comme j'en ai parlé dans cette article, le domaine du web est un domaine évoluant très vite, ce qui implique que ma marge de progression est encore grande, car avec les évolution du web, Angular propose des mises à jour pour rester efficace. Ils ont par exemple ajouté un système de \"signaux\" pour remplacer les promesses, les signaux étant plus optimisé que les promesses.")
        }
        card("Sa place dans mon profil") {
            p(
                "Le web n'est pas un domaine que je vise, mais en tant que chef de projet, il est important d'avoir des connaissances variées pour être compétent sur le plus grand nombre de projets. De plus, la popularité d'Angular en font une solution commune sur les applications web.<br/>" +
                        "Connaitre Angular me permet donc d'avoir une base dans le domaine du web.", rich = true
            )
            p("N'étant pas mon domaine cible, je ne pense pas me former plus sur le sujet dans le futur, à moins qu'un projet ne l'exige.")
        }
        card("Mes conseils") {
            p(
                "Angular fait partie des technologies à connaitre, que l'on veuille travailler dans le web ou non. Il s'agit d'un incontournable que tout développeur risque de croiser à un moment de sa carrière.<br/>" +
                        "De plus, contrairement à d'autre technologie similaire, est un paquet comprenant tout ce qu'il faut pour commencer à développer. Pas besoin de chercher en plus une librairie de code pour le design, les composants, la navigation ou le stockage des cookies.<br/>" +
                        "L'approche d'Angular en fait aussi l'ami des développeurs backend par son approche du développement très proche de ce que l'on peut retrouver sur des API ou des serveurs.",
                rich = true
            )
        }
    }
}