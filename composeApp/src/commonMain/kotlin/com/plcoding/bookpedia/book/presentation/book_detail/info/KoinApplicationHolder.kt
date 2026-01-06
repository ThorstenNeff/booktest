package com.plcoding.bookpedia.book.presentation.book_detail.info

import org.koin.core.KoinApplication
import org.koin.core.module.Module

object KoinApplicationHolder {
    private var koinApplication: KoinApplication? = null

    fun getOrInitialize(modules: List<Module>): KoinApplication {
        return koinApplication ?: createKoinApplication(modules).also {
            koinApplication = it
        }
    }

    fun clear() {
        koinApplication?.close()
        koinApplication = null
    }
}

private fun createKoinApplication(modules: List<Module>): KoinApplication {
    return org.koin.dsl.koinApplication {
        modules(modules)
    }
}