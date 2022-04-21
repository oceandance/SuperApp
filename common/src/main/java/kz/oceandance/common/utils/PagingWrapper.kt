package kz.oceandance.common.utils


data class PagingWrapper<T>(
    val next: String?,
    val previous: String?,
    val date: List<T>
)