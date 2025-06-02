package app.futured.kmptemplate.feature.ui.firstScreen

import app.futured.factorygenerator.annotation.GenerateFactory
import app.futured.kmptemplate.feature.domain.GetAvatarsUseCase
import app.futured.kmptemplate.feature.domain.GetLocalPhotoUseCase
import app.futured.kmptemplate.feature.domain.LoadPhotoUseCase
import app.futured.kmptemplate.feature.domain.UploadPhotoUseCase
import app.futured.kmptemplate.feature.ui.base.AppComponentContext
import app.futured.kmptemplate.feature.ui.base.ScreenComponent
import kotlinx.coroutines.flow.StateFlow
import org.koin.core.annotation.Factory
import org.koin.core.annotation.InjectedParam

@GenerateFactory
@Factory
internal class FirstComponent(
    @InjectedParam componentContext: AppComponentContext,
    @InjectedParam override val navigation: FirstScreenNavigation,
    private val getAvatarsUseCase: GetAvatarsUseCase,
    private val uploadPhotoUseCase: UploadPhotoUseCase,
    private val getLocalPhotoUseCase: GetLocalPhotoUseCase,
    private val loadPhotoUseCase: LoadPhotoUseCase
) : ScreenComponent<FirstViewState, Nothing, FirstScreenNavigation>(
    componentContext = componentContext,
    defaultState = FirstViewState,
),
    FirstScreen,
    FirstScreenNavigation by navigation,
    FirstScreen.Actions {

    override val actions: FirstScreen.Actions = this
    override val viewState: StateFlow<FirstViewState> = componentState.asStateFlow()

    override fun onBack() = pop()
}
