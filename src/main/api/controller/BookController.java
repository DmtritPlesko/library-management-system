package api.controller;

import api.model.Book;
import api.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Slf4j
@RestController
@RequestMapping("/book")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public Book addNewBook(@RequestBody Book book) {

    }

    @GetMapping
    public Collection<Book> getAllBook () {

    }

    @PutMapping
    public Book updateBook (@RequestBody Book book) {

    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") Long id) {

    }
}
