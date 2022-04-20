package kz.oceandance.news.list

import kz.oceandance.common.base.ViewAction

sealed class NewsViewAction: ViewAction {
    object LoadNewsAction: NewsViewAction()
}