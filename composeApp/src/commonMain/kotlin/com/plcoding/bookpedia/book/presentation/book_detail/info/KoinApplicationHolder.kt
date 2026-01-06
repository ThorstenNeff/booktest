package com.plcoding.bookpedia.book.presentation.book_detail.info

import org.koin.core.KoinApplication
import org.koin.core.module.Module
import kotlin.jvm.Synchronized

object KoinApplicationHolder {
    private val map = mutableMapOf<String, KoinApplication>()

    fun getOrCreate(key: String, modules: List<Module>): KoinApplication {
        return map[key] ?: org.koin.dsl.koinApplication {
            modules(modules)
        }.also { map[key] = it }
    }

    fun clear(key: String) {
        map.remove(key)?.close()
    }
}