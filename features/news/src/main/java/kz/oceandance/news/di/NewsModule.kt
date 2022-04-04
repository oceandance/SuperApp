package kz.oceandance.news.di

import kz.oceandance.news.list.NewsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val newsModule = module {

    viewModel { NewsViewModel() }

}