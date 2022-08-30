package com.bookapp.springbootrestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book-restapi")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/hello")
    public String sayHello(){
        return "Welcome to RESTAPI";
    }
    //    http://127.0.0.1:8080/book-restapi/book-by-id/1
    @GetMapping("/book-by-id/{bookid}")
    public Book getBookById(@PathVariable int bookid){
        return bookService.getById(bookid);
    }
//    http://127.0.0.1:8080/book-restapi/book-by-author/Kathy
    @GetMapping("/book-by-author/{author}")
    public List<Book> getBookByAuthor(@PathVariable String author){
        return bookService.getBooksByAuthor(author);
    }
    //    http://127.0.0.1:8080/book-restapi/book-by-category/Tech
    @GetMapping("/book-by-category")
    public List<Book>  getBookByCategory(@RequestParam("category") String category){
        return bookService.getBooksByCategory(category);
    }
}
