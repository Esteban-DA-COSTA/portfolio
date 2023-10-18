package edu.estebandc.project

import redux.RAction


data class AppState(
    val currentCategory: Category = Category.HOME,
    val currentSubCategory: SubCategory? = null,
    val currentPage: Int? = null
)

sealed class AppAction: RAction {
    data class ChangePage(val newCategory: Category, val newSubCategory: SubCategory? = null, val newPage: Int? = null) : AppAction()
}


fun reducer(state: AppState, action: AppAction): AppState = when (action) {
    is AppAction.ChangePage -> {
        state.copy(
            currentCategory = action.newCategory,
            currentSubCategory = action.newSubCategory,
            currentPage = action.newPage
        )
    }
}