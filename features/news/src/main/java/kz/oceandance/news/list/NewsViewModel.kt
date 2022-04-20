package kz.oceandance.news.list

import BaseViewModel


class NewsViewModel: BaseViewModel<NewsViewIntent, NewsViewAction, NewsViewState>() {

    override fun intentToAction(intent: NewsViewIntent): NewsViewAction {
        return NewsViewAction.LoadNewsAction
    }

    override fun handleAction(action: NewsViewAction) {
        when(action){
            is NewsViewAction.LoadNewsAction -> {}
        }
    }

}