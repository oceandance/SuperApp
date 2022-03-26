package kz.oceandance.common.base

interface BaseMapper<in FROM, out TO> {

    fun transform(item: FROM) : TO

}