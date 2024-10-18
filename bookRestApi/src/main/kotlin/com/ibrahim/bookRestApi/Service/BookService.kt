package com.ibrahim.bookRestApi.Service

import com.ibrahim.bookRestApi.BookModel

interface BookService {
    fun getAllBooks(): List<BookModel>
    fun getBookById(id: Int): BookModel?
    fun saveBook(book: BookModel): BookModel
    fun updateBook(id:Int , updateBook : BookModel) : BookModel?
    fun deleteBook(id : Int): Boolean
}

