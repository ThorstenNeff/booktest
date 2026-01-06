package com.plcoding.bookpedia.book.presentation.book_detail.info

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val infoModule = module {
    singleOf(::InfoRepository)
}