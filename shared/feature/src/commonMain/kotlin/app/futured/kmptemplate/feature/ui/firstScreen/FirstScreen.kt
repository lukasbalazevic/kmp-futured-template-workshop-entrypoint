package app.futured.kmptemplate.feature.ui.firstScreen

import kotlinx.coroutines.flow.StateFlow

/**
 * A copy-paste template for creating new screen.
 * All you need to do is to copy contents of this file into your destination package and replace "First" with name of the screen.
 *
 * Hint: Ctrl+G
 */
interface FirstScreen {
    val viewState: StateFlow<FirstViewState>
    val actions: Actions

    interface Actions {
        fun onBack()
    }
}

