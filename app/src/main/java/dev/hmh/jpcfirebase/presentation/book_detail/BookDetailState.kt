package dev.hmh.jpcfirebase.presentation.book_detail

import dev.hmh.jpcfirebase.model.Book


data class BookDetailState(
    val isLoading: Boolean = false,
    val book: Book? = null,
    val error: String = ""
)
