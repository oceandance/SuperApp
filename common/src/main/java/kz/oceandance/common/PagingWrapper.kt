package kz.oceandance.common


data class PagingWrapper<T>(
    val next: String?,
    val previous: String?,
    val date: List<T>
)