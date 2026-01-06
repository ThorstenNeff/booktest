package com.plcoding.bookpedia.book.presentation.book_detail.info

class TestRepository(
    private val testString: String,
    private val additionalStrings: List<String> = emptyList()
) {
    fun getAllStrings(): List<String> {
        return listOf(testString) + additionalStrings
    }

    fun getPrimaryString(): String = testString
}