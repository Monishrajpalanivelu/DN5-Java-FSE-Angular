package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BookService {
    
    private BookRepository bookRepository;
    
    public BookService() {}

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    public void showBook() {
        System.out.println("BookService: Displaying book information...");
        bookRepository.displayBook();
    }
}
