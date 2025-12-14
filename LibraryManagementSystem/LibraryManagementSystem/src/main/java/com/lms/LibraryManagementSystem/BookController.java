package com.lms.LibraryManagementSystem;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {
	@Autowired
    private BookRepository bookRepo;
	

    // Create Book
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookRepo.save(book);
    }

    // Get All Books
    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }
    
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookRepo.getById(id);
    }
    
    
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable int id,@RequestBody Book updatedBook) {
    	Book book = getBookById(id);
        book.setTitle(updatedBook.getTitle());
        book.setAuthor(updatedBook.getAuthor());
        book.setIsbn(updatedBook.getIsbn());
        book.setPublishedDate(updatedBook.getPublishedDate());
        return bookRepo.save(book);
    }
    
    @DeleteMapping("{id}")
    public void deleteBook(@PathVariable int id) {
    	bookRepo.deleteById(id);
    }
    
    @GetMapping("/author/{author}")
    public List<Book> getBookByAuthor(@PathVariable String author){
    	return bookRepo.findByAuthor(author);
    }
    
    @GetMapping("/published-after/{year}")
    public List<Book> getBooksAfterYear(@PathVariable int year){
    	return bookRepo.findByPublishedDateAfter(LocalDate.of(year,1,1));
    }
    
}
