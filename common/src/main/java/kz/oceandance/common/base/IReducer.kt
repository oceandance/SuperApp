package kz.oceandance.common.base

interface IReducer<STATE, T :Any> {
    fun reduce(result: Result<T>, state: STATE,): STATE
}