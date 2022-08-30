package com.bookapp.springbootrestapi;

import java.util.List;

public interface BookService {
    Book getById(int bookid);
    List<Book> getBooksByAuthor(String author);
    List<Book> getBooksByCategory(String category);

}
