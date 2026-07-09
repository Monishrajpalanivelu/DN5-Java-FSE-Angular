package com.LibraryManagement.App.Repository;

import com.LibraryManagement.App.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
      
}
