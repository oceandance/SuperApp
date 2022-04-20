package kz.oceandance.common.base.event

import android.os.Bundle
import androidx.annotation.IdRes
import androidx.navigation.NavDirections

sealed class NavigationEvent: BaseEvent {

    data class ToDirection(
        val direction: NavDirections,
        val rootGraph: Boolean = false
    ) : NavigationEvent()

    data class ToRes(
        @IdRes val resId: Int,
        val args: Bundle? = null,
        val rootGraph: Boolean = false
    ) : NavigationEvent()

    object Up : NavigationEvent()

    object Back : NavigationEvent()

    data class BackTo(
        val destinationId: Int,
        val inclusive: Boolean
    ) : NavigationEvent()
}