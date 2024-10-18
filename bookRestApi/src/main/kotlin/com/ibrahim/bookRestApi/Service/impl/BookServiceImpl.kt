package com.ibrahim.bookRestApi.Service.impl

import com.ibrahim.bookRestApi.BookModel
import com.ibrahim.bookRestApi.Service.BookService
import com.ibrahim.bookRestApi.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class BookServiceImpl(
    var repo : BookRepository
) : BookService{

    override fun getAllBooks(): List<BookModel> = repo.findAll().toList()

    override fun getBookById(id: Int): BookModel? {
        return repo.findById(id).orElse(null)
    }

    override fun saveBook(book: BookModel): BookModel {
        return repo.save(book)
    }

    override fun updateBook(id: Int, updateBook: BookModel): BookModel? {
        if(repo.existsById(id)){
            var newbook : BookModel = repo.findById(id).orElse(null)
            newbook.id = id
            newbook.bookName = updateBook.bookName
            return repo.save(newbook)
        }
        return  null
    }

    override fun deleteBook(id: Int): Boolean {
        if(repo.existsById(id)){
            repo.deleteById(id)
            return true
        }
        return  false

    }

}