package edu.estebandc.project

import io.kvision.redux.createReduxStore
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

enum class Category(val url: String) {
    HOME("home"),
    SKILLS("skills"),
    PROJECTS("projects")

}

enum class Skills(val url: String, val type: SkillType) {
    JAVA("java", SkillType.TECHNIQUE),
    BASE_DE_DONNEES("bdd", SkillType.TECHNIQUE),
    API_REST("api", SkillType.TECHNIQUE),
    ANDROID("android", SkillType.TECHNIQUE),
    TRAVAIL_EN_AUTONOMIE("autonomie", SkillType.HUMAIN),
    ECOUTE_CLIENTELE("ecoute", SkillType.HUMAIN),
    AUTO_FORMATION("auto_formation", SkillType.HUMAIN),
    COMMUNICATION_EN_ANGLAIS("englais", SkillType.HUMAIN),;

    fun capitalize() = name.lowercase().replaceFirstChar { it.uppercaseChar() }.replace("_", " ")

    companion object {
        fun urlOf(url: String): Skills? {
            return entries.find { subCategory -> subCategory.url == url }
        }
    }
}

enum class Project(val url: String) {
    FLOD_EDT_MOBILE("flop_edt"),
    KLASSIFILE("klassifile"),
    LINKED("linked"),
    EREC("erec"),
    TSAS("tsas");

    fun capitalize() = name.lowercase().replaceFirstChar { it.uppercaseChar() }.replace("_", " ")

    companion object {
        fun urlOf(url: String): Project? {
            return Project.entries.find { subCategory -> subCategory.url == url }
        }
    }
}

object RoutingManager : CoroutineScope by CoroutineScope(Dispatchers.Default + SupervisorJob()) {
    val stateStore = createReduxStore(::reducer, AppState(Category.HOME))

    /**
     * Init manager
     *
     */
    fun initManager() {}

    /**
     * Navigates to the home page.
     *
     * This method updates the state of the application to change the current page to the home page.
     *
     * @see [AppAction.ChangePage]
     * @see [Category.HOME]
     */
    fun goToHomePage() {
        stateStore.dispatch(AppAction.ChangePage(Category.HOME))
    }

    /**
     * Navigates to the skill home page.
     *
     * This method dispatches an AppAction to change the current page to the skills page.
     * The stateStore is responsible for handling the dispatched action and updating the application state accordingly.
     */
    fun goToSkillPage(subCategory: Skills? = null) {
        stateStore.dispatch(AppAction.ChangePage(Category.SKILLS, subCategory))
    }

    fun goToProjectPage(project: Project? = null) {
        console.log("subPage", project)
        stateStore.dispatch(AppAction.ChangePage(Category.PROJECTS, newProject = project))
    }
}