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

fun Container.englishCommunicationSkillPage() = div {
    skillSummary(
        "English communication",
        listOf(
            "English is the most used language for international communication.",
            "Being able to speak english let you work you international client and project."
        ),
        SkillType.HUMAIN,
        SkillLevel.AUTONOME
    )
    section("A global language") {
        card("English in IT") {
            p("IT is an international domain. Every country, every company in the world use IT to enhances their productivity. This situation lead to programmation language using english as base for keywords and documentation.")
            p("Speaking english is a must-know for every developer for multiple reasons. It help us understand language, framework and libraries documentation but also enable us to communicate with world developers to get help and learn.")
        }
        card("English to open doors") {
            p("This is also useful outside ouf direct development because we can work with compagnies or clients that do not speak our language.")
            p("With english communication skill, it is possible to apply for jobs around the globe, and work for any company.")
            p("Even if you're working in a company in your born country, you may need to work with a foreigner client. In that case you will need to speak english to communicate.")
        }
    }
    section("English in my realisations") {
        card("Linked, English for educational purpose") {
            p(
                "When I was working for <a href='${Category.PROJECTS.url}/${Project.LINKED.url}'>Linked</a> project, the school wanted us to present our project in english.",
                rich = true
            )
            p("To do so, I had to create a presentation support (Powerpoint) to present it but also prepare a speech. The most part of my english c communication skill was based on my speech because the support did not have much text but only images and icons.")
            p("To create my speech, I searched for english words and expressions to enhance my communication and fluidity. It's helped me not only present our project but also answer several questions I had after it.")

        }
        card("TSAS, English everywhere") {
            p(
                "<a href='${Category.PROJECTS.url}/${Project.TSAS.url}'>TSAS</a> is an Airbus project. As it, all information, code and presentations must be made in english because thess tools are not exclusively used by French people.",
                rich = true
            )
            p(
                "On this project, I used my english skill for several purposes. The first was for writing documentation. After implementing a feature or fix in TSAS. I wrote documentation for both user and developer. Of course, all documentation are in english.<br/>" +
                        "For developer documentation, I had to use IT words to explain use and why the feature/fix has been made like that.<br/>" +
                        "For user documentation, I had to search for more simple sentences to explain how to use the new feature or usages to avoid.",
                rich = true
            )
            p(
                "The second purpose for my english skill in TSAS was to present new versions of the application. Indeed, after implementing a pool of features, I had to present them to all customers during a video meeting.</br>" +
                        "To do so, I had to prepare a speech and demonstration to show these new features. I also had to be prepare for questions they may have regarding them",
                rich = true
            )
        }
        card("Working with foreign developers") {
            p("For a personal project, I had to use my english communication skill to communicate with other developpers.")
            p("I'm playing role-playing games with friends split around the country. To play it, I have to use software to group up and share the games information and sheet. This software is Foundry Virtual Tabletop. It let developers implement modules to enhance its capabilities.")
            p("When playing, I wanted to help developers for a module I used. This modules is developed by spanish people. To communicate with them, I spoke english to present myself, to read the module documentation and to spoke with them during meetings.")
        }
    }
    section("My expertise of english communication") {
        card("My level") {
            p("Through films, technical documentation reading and project use of the english communication skill, I think I'm not at a <b>Confirmed</b> level.", rich = true)
            p("Of course, I do have a lot left to learn and train about english communication. I do make errors mostly when speaking english because I think I do not practice it enough on real situation.")
            p("Even if I'm confident with my english skill in a professional environment, I did not use it very much in a personal environment.")
        }
        card("Its place in my profile") {
            p("For a project manager, being able to speak english can be a valuable argument. Indeed, It could open doors for projects with foreigner clients or event foreign compagnies.")
            p("For a developer, english is the language you work with, because programming languages and software's documentation are mostly written from english.")
            p("So english communication is an high priority skill for me that I would like to upgrade.")
            p("To enhance my english skill, I would like to work in another country, especially Ireland, where I would speak english for both working and living.")
        }
        card("My tips to learn english") {
            p("When I was younger, I did not like english because It is too different from French. I started liking it when linking it to something I like. For example, It is easier to learn english if you watch english video games videos if you like video games.")
            p("Another tip I can give is to not be afraid to speak english. You can only become better by training so you have to write, speak, read and listen english contents.")
            p("Lastly, this is not a tip to learn english but more an advise why you should learn it. English is the international language. Even if you do not work in IT, speaking it let you travel around the world and meet people. In your life, there is a high chance that you will need this skill.")
        }
    }
}