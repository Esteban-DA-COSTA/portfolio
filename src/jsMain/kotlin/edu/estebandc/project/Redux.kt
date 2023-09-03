package edu.estebandc.project

import redux.RAction


data class AppState(
    val currentPage: Pages = Pages.HOME
)

sealed class AppAction: RAction {
    data class ChangePage(val newPage: Pages) : AppAction()
}


fun reducer(state: AppState, action: AppAction): AppState = when (action) {
    is AppAction.ChangePage -> {
        state.copy(currentPage = action.newPage)
    }
}