package kz.oceandance.common

import androidx.annotation.Keep

@Keep
data class PagingWrapper<T>(
    val next: String?,
    val previous: String?,
    val date: List<T>
)