package com.ibrahim.bookRestApi.Controller

import com.ibrahim.bookRestApi.BookModel
import com.ibrahim.bookRestApi.Service.BookService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController(
    val bookService: BookService
) {

    //get all books
    @GetMapping("books")
    fun getAllBooks() : List<BookModel> {
        return bookService.getAllBooks()
    }
    //get book by id
    @GetMapping("books/{id}")
    fun getBookById(@PathVariable id: Int): BookModel? {
        return bookService.getBookById(id)
    }
    //save book
    @PostMapping("books")
    fun saveBook(@RequestBody book: BookModel) {
        bookService.saveBook(book)
    }

    @PutMapping("books/{id}")
    fun updateBook(@PathVariable id: Int , @RequestBody updateDatedBook : BookModel)= bookService.updateBook(id ,updateDatedBook)

    @DeleteMapping("books/{id}")
    fun deleteBook(@PathVariable id : Int ) = bookService.deleteBook(id)


    // Update my database resorce.my name is hamim.
    // Update my database resorce.my name is ibrahim
}