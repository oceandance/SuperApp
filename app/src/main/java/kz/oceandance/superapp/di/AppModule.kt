package kz.oceandance.superapp.di

import kz.oceandance.news.di.newsModule
import kz.oceandance.superapp.main.mainModule
import org.koin.core.module.Module

val appModules = listOf<Module>(
    mainModule,
    newsModule
)