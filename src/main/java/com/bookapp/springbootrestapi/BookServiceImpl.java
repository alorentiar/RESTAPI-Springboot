package com.bookapp.springbootrestapi;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService{
    private List<Book> getBookList(){
        return Arrays.asList(new Book("Java", "Kathy", "Tech",10),
        new Book("Spring", "Rachmat", "Tech",11),
        new Book("Fairy Tale", "Calista", "Fiction",12),
        new Book("Gym Tutor", "Vincent", "Health",13),
                new Book("Log Out", "Sisca", "Fiction",14));

    }

    @Override
    public Book getById(int bookid) {
//        return null;
        return getBookList().stream().filter((book)->book.getBookid()==bookid)
                .findAny()
                .get();
    }

    @Override
    public List<Book> getBooksByAuthor(String author) {
//        return null;
        return getBookList()
                .stream()
                .filter((book)->book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> getBooksByCategory(String category) {
//        return null;
        return getBookList()
                .stream()
                .filter((book)->book.getCategory().equals(category))
                .collect(Collectors.toList());
    }
}
