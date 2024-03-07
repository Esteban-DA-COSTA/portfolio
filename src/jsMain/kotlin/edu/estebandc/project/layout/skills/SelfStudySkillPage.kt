package edu.estebandc.project.layout.skills

import edu.estebandc.project.SkillLevel
import edu.estebandc.project.SkillType
import edu.estebandc.project.layout.shared.card
import edu.estebandc.project.layout.shared.section
import edu.estebandc.project.layout.shared.skillSummary
import io.kvision.core.Container
import io.kvision.html.div
import io.kvision.html.p

fun Container.selfStudySkillPage() = div {
    skillSummary(
        "Auto Formation",
        listOf(
            "L'auto formation est la capacité d'une personne à apprendre par lui même afin d'étoffer ses compétences.",
        ),
        SkillType.HUMAIN,
        SkillLevel.AUTONOME
    )
    section("L'auto formation, une nécessité") {
        card {
            p("L’autoformation dans le développement est un processus essentiel pour les professionnels de l’informatique. Elle se définit comme la capacité d’apprendre de manière autonome, en se formant par ses propres moyens, en dehors des cadres traditionnels.")
            p(
                "Avec l’évolution rapide du secteur informatique, où de nouvelles langages de programmation, frameworks et outils émergent constamment, l’autoformation devient un atout majeur.<br/>" +
                        "Cela va au-delà du simple apprentissage du code ; cela implique également la compréhension des meilleures pratiques et la maîtrise des concepts fondamentaux.",
                rich = true
            )
            p("La maitrise de l'auto formation signifie être mieux préparé à relever les défis. C'est un pilier essentiel pour rester compétitif et performant dans le domaine de l’informatique.")
        }
    }
    section("L'auto formation dans mes projets") {
        card("L'apprentissage du CMIS") {
            p(
                "Lors du projet Klassifile, j'ai dû développer un serveur permettant la \"traduction\" d'un modèle objet spécifique à un outil client dans la norme CMIS.<br/>" +
                        "CMIS pour <b>C</b>ontent <b>M</b>anagment <b>I</b>nteroperability <b>S</b>ervices, est une norme définissant un modèle objet permettant à plusieurs outils de gestion de documents de communiquer entre eux.<br/>" +
                        "Ne connaissant pas du tout cette norme avant ce projet, j'ai dû me former pour comprendre et savoir utiliser cette norme.<br/>" +
                        "Cela est passé par la lecture de la documentation officielle de la norme.",
                rich = true
            )
            p("A la fin de cette auto formation, j'ai pu développer le serveur demandé par le client.")
        }
        card("Mon stage chez Capgemini") {
            p("Lors de mon arrivé en stage chez Capgemini, on ma mis sur les évolutions d'un projet déjà existant. Ce projet nommé eRec était un outil permettant de faciliter le processus de recrutement des nouveaux salariés.")
            p("eRec a été développé en C Sharp, et utilise un framework appelé <i>EntityFramework</i>. Ce framework permet de gérer les bases de données directement depuis le C Sharp, il permet notamment de: définir les tables de la base de données, ajouter ou supprimer des tuples dans la base, avoir un versionning de la base.")
            p("En arrivant sur le projet, je n'avais jamais manipulé ce framework et n'ai eu de cours dessus que l'année qui a suivie. Pour pouvoir mener à bien ma mission, je me suis donc auto formé en analysant le code existant pour apprendre à utiliser EntityFramework.")
            p("L'analyse du code m'a permis de comprendre le fonctionnement du framework, j'ai donc pu ensuite ajouter une nouvelle table dans la base de données pour gérer les demandes des recruteurs en terme de personnel.")
        }
    }
    section("Auto critique") {
        card("Mon niveau") {
            p(
                "J'ai a de nombreuses reprises dû m'auto former pour répondre aux exigences des projets dans lesquels j'ai travaillé. Cependant, j'éprouve encore aujourd'hui des difficultés dans ce domaines. J'ai du mal à comprendre certaines documentations comme les documentations faites par Microsoft. Mes capacités couplés à ces defficultés me font penser que je suis <b>autonome</b> dans ce domaine.",
                rich = true
            )
            p("Malheureusement, le principe même de l'autoformation implique qu'il n'existe pas de moyen de se former dessus. Pour améliorer mes compétences, je pense donc apprendre à titre personnel des nouveaux langages et technologies. Les apprendre par moi-même devrait me permettre de mieux m'autoformer en même temps que de me donner d'autres cordes à mon arc.")
        }
        card("Sa place dans mon profil") {
            p(
                "L'auto formation est un point clé de mon profil. Voulant à terme être chef de projet, savoir se former en fonction des besoins du projet me permet de faire face à tout type de problème.<br/>" +
                        "Cela me permet aussi de mieux estimer les besoins d'un projet, que ce soit en terme de compétences de temps ou de chiffrage.",
                rich = true
            )
        }
        card("Mes conseils") {
            p(
                "Pour bien s'auto former, il faut tout d'abord trouver la bonne façon de faire. Cette méthode dépend de chacun. Pour ma part, je comprends mieux en mettant en pratique ce que je lis sur des documentations, pour d'autre ce seront des vidéos tutoriels.<br/>" +
                        "Il ne faut surtout pas hésiter à se faire des projets \"bac à sable\" pour mettre en place ce que vous apprenez, cela permet d'avoir une validation de votre compréhension sans la complexité structurelle que peut avoir un véritable projet."
                , rich = true
            )
        }
    }
}