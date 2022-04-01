package kz.oceandance.common.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavDirections
import kz.oceandance.common.utils.EventWrapper
//import kz.oceandance.navigation.NavigationCommand

abstract class BaseViewModel: ViewModel() {

    // FOR ERROR HANDLER
    protected val _snackbarError = MutableLiveData<EventWrapper<Int>>()
    val snackBarError: LiveData<EventWrapper<Int>> get() = _snackbarError

//    // FOR NAVIGATION
//    private val _navigation = MutableLiveData<EventWrapper<NavigationCommand>>()
//    val navigation: LiveData<EventWrapper<NavigationCommand>> = _navigation
//
//    /**
//     * Convenient method to handle navigation from a [ViewModel]
//     */
//    fun navigate(directions: NavDirections) {
//        _navigation.value = EventWrapper(NavigationCommand.To(directions))
//    }
}