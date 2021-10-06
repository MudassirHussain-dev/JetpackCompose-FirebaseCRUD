package dev.hmh.jpcfirebase.presentation.book_list

import dev.hmh.jpcfirebase.model.Book


data class BookListState(
    val isLoading: Boolean = false,
    val books: List<Book> = emptyList(),
    val error: String = ""
)
