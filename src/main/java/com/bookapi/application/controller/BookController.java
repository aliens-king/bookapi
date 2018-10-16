package com.bookapi.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookapi.application.model.Book;
import com.bookapi.application.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping(value="/book")
	public String helloSid() {
		return "helloWorld";
	}
	
	
@PostMapping("/saveBooks")
public Book saveBook(@RequestBody Book book) {
	return bookService.saveBooks(book);
}

@GetMapping(value="/books", produces = MediaType.APPLICATION_JSON_VALUE)
public List<Book> getUserById() {
    
	return bookService.findById();
}
}
