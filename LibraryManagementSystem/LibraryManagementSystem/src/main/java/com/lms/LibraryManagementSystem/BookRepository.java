package com.lms.LibraryManagementSystem;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer>{
    List<Book> findByAuthor(String author);
    List<Book> findByPublishedDateAfter(LocalDate date);


}
