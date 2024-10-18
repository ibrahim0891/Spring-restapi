package com.ibrahim.bookRestApi

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class BookModel (
       @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int = 1,
        var imageLink: String ="",
        var bookName: String = "Futurama",
        var authorName: String = "Michel Macarthy",
        var publisher: String = "Openbooks.org",
        var pages: Int = 320,
        var isbn: String = "978-1234567890",
        var publishYear: Int = 2022,
        var rating: Int = 4,
        var category: String = "art",
        var price: Int = 200,
        var currency: String = "Taka",
        var description: String = "A description of Futurama. This captivating novel takes readers on a journey through time and space, exploring the possibilities of future civilizations. With its blend of humor and thought-provoking scenarios, Futurama challenges our perceptions of technology and human nature.",
        var language: String = "English",
        var isAvailable: Boolean = true,
        var copiesInStock: Int = 10,
        var format: String = "Hardcover",
        var createdAt: String =  "2024-10-14T16:00:17.357Z",
        var updatedAt: String = "2024-10-14T16:00:17.357Z",
        var tags: List<String> = listOf("General", "Book")
)