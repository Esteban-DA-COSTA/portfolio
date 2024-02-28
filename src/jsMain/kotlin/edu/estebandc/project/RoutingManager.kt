package edu.estebandc.project

import io.kvision.redux.createReduxStore
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

enum class Category(val url: String) {
    HOME("/home"),
    SKILLS("/skills"),
    PROJECTS("/projects")

}

enum class SubCategory(val url: String) {
    JAVA("java");

    companion object {
        fun urlOf(url: String): SubCategory? {
            return entries.find { subCategory -> subCategory.url == url }
        }
    }
}

enum class Project(val url: String) {
    FLOD_EDT_MOBILE("flop_edt");

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
    fun goToSkillPage(subCategory: SubCategory? = null) {
        stateStore.dispatch(AppAction.ChangePage(Category.SKILLS, subCategory))
    }

    fun goToProjectPage(project: Project? = null) {
        console.log("subPage", project)
        stateStore.dispatch(AppAction.ChangePage(Category.PROJECTS, newProject = project))
    }
}