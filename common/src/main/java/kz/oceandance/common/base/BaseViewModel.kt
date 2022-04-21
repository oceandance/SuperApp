package kz.oceandance.common.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavDirections
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kz.oceandance.common.base.IModel
import kz.oceandance.common.base.NavigationCommand
import kz.oceandance.common.base.ViewAction
import kz.oceandance.common.base.ViewIntent
import kz.oceandance.common.base.state.ViewState
import kz.oceandance.common.utils.EventWrapper

abstract class BaseViewModel<INTENT : ViewIntent, ACTION : ViewAction, STATE : ViewState> :
    ViewModel(),
    IModel<STATE, INTENT> {

    // FOR NAVIGATION
    private val _navigation = MutableLiveData<EventWrapper<NavigationCommand>>()
    val navigation: LiveData<EventWrapper<NavigationCommand>> = _navigation

    /**
     * Convenient method to handle navigation from a [ViewModel]
     */
    fun navigate(directions: NavDirections) {
        _navigation.value = EventWrapper(NavigationCommand.To(directions))
    }

    protected val mState = MutableLiveData<STATE>()
    override val state: LiveData<STATE>
        get() {
            return mState
        }

    fun launchOnUI(block: suspend CoroutineScope.() -> Unit) {
        viewModelScope.launch { block() }
    }

    final override fun dispatchIntent(intent: INTENT) {
        handleAction(intentToAction(intent))
    }

    abstract fun intentToAction(intent: INTENT): ACTION
    abstract fun handleAction(action: ACTION)
}