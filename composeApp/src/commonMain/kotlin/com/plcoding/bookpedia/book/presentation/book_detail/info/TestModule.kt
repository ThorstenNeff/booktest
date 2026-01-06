package com.plcoding.bookpedia.book.presentation.book_detail.info

import org.koin.dsl.module

fun testModule(config: TestConfig) = module {
    single { TestRepository(config.testString) }
}