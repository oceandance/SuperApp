package kz.oceandance.superapp.di

import kz.oceandance.news.di.newsModule
import org.koin.core.module.Module

val appModules = listOf<Module>(
    newsModule
)