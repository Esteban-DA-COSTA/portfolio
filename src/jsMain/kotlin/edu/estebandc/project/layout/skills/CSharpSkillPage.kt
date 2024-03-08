package edu.estebandc.project.layout.skills

import edu.estebandc.project.SkillLevel
import edu.estebandc.project.SkillType
import edu.estebandc.project.layout.shared.card
import edu.estebandc.project.layout.shared.section
import edu.estebandc.project.layout.shared.skillSummary
import io.kvision.core.Container
import io.kvision.html.p

fun Container.cSharpSkillPage() {
    skillSummary(
        "C Sharp",
        listOf(
            "Ce langage, développé par Microsoft, est largement utilisé pour créer des applications robustes et performantes.",
        ),
        SkillType.TECHNIQUE,
        SkillLevel.AUTONOME
    )
    section("Un langage Microsoft") {
        card("Un écosystème bien pensé") {
            p(
                "C sharp, ou C#, est un langage développé par Microsoft, l'entreprise derrière Windows. Ce langage est presque aussi volatile que Java dans son domaine d'utilisation. Avec C# il est possible de développer des applications de bureau, des serveurs et applications web ou même des jeux vidéos.<br/>" +
                        "Il troque la portabilité de Java pour un écosystème bien pensé afin de faciliter le développement.",
                rich = true
            )
            p(
                "L'une des utilisations classiques du langages est le développement d'application pour Windows. Etant tous les deux développé par la même enseigne, ils s'emboitent parfaitement.<br/>" +
                        "Il est aussi utilisé pour le développement de jeux vidéos avec le moteur de jeu Unity, un des moteurs de jeux les plus populaires permettant de développer des jeux de petites envergures aussi bien que des triples A.",
                rich = true
            )
        }
    }
    section("C Sharp dans ma carrière") {
        card("eRec et EntityFramework") {
            p(
                "Lors de mon stage chez Capgemini, j'ai travaillé sur une API REST développé avec C#. Cet API REST permettait d'envoyer de communiquer avec un site web Angular.<br/>" +
                        "L'API C# était couplé à EntityFramework pour permettre aux développeurs de manager la base de données directement dans l'API sans avoir à faire du SQL.",
                rich = true
            )
            p("Par exemple, j'ai personnellement utilisé C sharp et EntityFramework pour définir une nouvelle table de Besoin dans la base de données et créer les routes d'API correspondantes.")
        }
        card("Interopérabilité VisualBasic") {
            p("Sur le projet Klassifile, nous avions comme base un projet fourni par notre client. Ce projet avait été fait avec le langage VisualBasic, un autre langage Microsoft plus pensé pour le web.")
            p(
                "Grâce à l'écosystème Microsoft dont fait partie C#, j'ai pu développer notre application en utilisant le code VisualBasic directement en C#.<br/>" +
                        "Cela m'a permis de faire hériter mes modèles objets définis en C# des modèles déjà existants en VisualBasic.",
                rich = true
            )
        }
    }
    section("Mon expertise") {
        card("Mon niveau") {
            p(
                "Je pense être <b>autonome</b> en ce qui concerne C#. En effet, je suis assez compétent pour comprendre et effectuer des tâches classiques sur le langage cependant, à part EntityFramework, je ne connais aucune librairie ou framework pouvant m'aider.<br/>" +
                        "En plus de cela, j'ai du mal à m'adapter au fonctionnement de l'écosystème de Microsoft.",
                rich = true
            )
            p("Malgré tout, je pense que j'ai atteint ce niveau particulièrement vite. La syntaxe du C# ressemblant à celle de Java, langage dans lequel que suis particulièrement effectif, j'ai pu comprendre facilement comment développer en C#. Ce qu'il me reste à apprendre sont les librairies et framework spécifiques du langage.")
            p("Mon niveau est de toute façon loin d'être figé, il me reste de nombreux domaine à explorer avec C#, notamment Unity pour apprendre à développer des jeux vidéos.")
            p("Je pense d'ailleurs suivre les formations proposés par Unity Learn afin de commencer à me former dans ce domaine.")
        }
        card("Sa place dans mon profil") {
            p("Ressemblant au Java, C# figure en tête de liste de mes langages les plus appréciés. Il permet en plus de développer des applications de bureau très facilement avec son lien avec Windows. Or, ce type d'application est le type dans lequel j'espère me spécialiser, que ce soit en tant que développeur ou chef de projet. J'espère donc avoir l'occasion de plus développer en C# à l'avenir.")
            p("Le développement de jeux vidéo, bien que ce ne soit pas mon domaine de prédilection, est un domaine intéressant, demandant des compétences que je n'ai jamais eu l'occasion de mettre en pratique, cela me semble donc judicieux d'en apprendre plus pour m'ouvrir le plus de porte possible.")
        }
        card("Mes conseils") {
            p(" Il s'agit, comme Java, d'un langage permettant de développer une variété de solutions différentes.")
            p("Je recommande à tout ceux qui veulent l'apprendre de connaitre les bases de la programmation orienté objet pour bien comprendre les systèmes mis en place par le langage.")
        }
    }
}