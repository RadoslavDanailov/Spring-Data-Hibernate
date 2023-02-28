package com.example.springdataadvancedquery.Service;

import com.example.springdataadvancedquery.entity.Author;
import com.example.springdataadvancedquery.entity.AuthorNamesWithTotalCopies;

import java.io.IOException;
import java.util.List;

public interface AuthorService {
    void seedAuthors() throws IOException;

    Author getRandomAuthor();

    List<String> getAllAuthorsOrderByCountOfTheirBooks();

    List<Author> findByFirstNameEndingWith(String endsWith);

    List<AuthorNamesWithTotalCopies> getWithTotalCopies();
}
