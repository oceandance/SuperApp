package kz.oceandance.home

import kz.oceandance.common.base.ViewAction
import kz.oceandance.common.base.ViewIntent
import kz.oceandance.common.base.state.ViewState

sealed class HomeViewState: ViewState

sealed class HomeViewAction: ViewAction

sealed class HomeViewIntent: ViewIntent