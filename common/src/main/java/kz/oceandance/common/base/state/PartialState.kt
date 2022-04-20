package kz.oceandance.common.base.state

import kz.oceandance.common.base.effect.ViewEffect

interface PartialState<VS : ViewState, VE : ViewEffect> {
    fun reduce(previousState: VS): VS = previousState
    fun mapToViewEffect(): VE? = null
}