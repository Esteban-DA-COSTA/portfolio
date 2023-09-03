package edu.estebandc.project

import io.kvision.redux.createReduxStore
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

enum class Pages(val url: String) {
    HOME("/home"),
    SKILLS("/skills")

}

object RoutingManager : CoroutineScope by CoroutineScope(Dispatchers.Default + SupervisorJob()) {
    val stateStore = createReduxStore(::reducer, AppState(Pages.HOME))

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
     * @see [Pages.HOME]
     */
    fun goToHomePage() {
        stateStore.dispatch(AppAction.ChangePage(Pages.HOME))
    }

    /**
     * Navigates to the skill home page.
     *
     * This method dispatches an AppAction to change the current page to the skills page.
     * The stateStore is responsible for handling the dispatched action and updating the application state accordingly.
     */
    fun goToSkillHomePage() {
        stateStore.dispatch(AppAction.ChangePage(Pages.SKILLS))
    }
}