package com.ibrahim.bookRestApi.repository

import com.ibrahim.bookRestApi.BookModel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface BookRepository: CrudRepository<BookModel, Int> {
}