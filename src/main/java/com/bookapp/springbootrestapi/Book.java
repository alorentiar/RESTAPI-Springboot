package com.bookapp.springbootrestapi;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {

    private String title;
    private String author;
    private String category;
    private int bookid;
}
