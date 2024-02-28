package edu.estebandc.project

import redux.RAction


data class AppState(
    val currentCategory: Category = Category.HOME,
    val currentSubCategory: SubCategory? = null,
    val currentProject: Project? = null
)

sealed class AppAction: RAction {
    data class ChangePage(val newCategory: Category, val newSubCategory: SubCategory? = null, val newProject: Project? = null) : AppAction()
}


fun reducer(state: AppState, action: AppAction): AppState = when (action) {
    is AppAction.ChangePage -> {
        state.copy(
            currentCategory = action.newCategory,
            currentSubCategory = action.newSubCategory,
            currentProject = action.newProject
        )
    }
}