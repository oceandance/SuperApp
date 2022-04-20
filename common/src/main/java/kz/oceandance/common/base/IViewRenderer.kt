package kz.oceandance.common.base

interface IViewRenderer<STATE> {
    fun render(state: STATE)
}