package com.bookapi.application.service;

import java.util.List;
import java.util.Optional;

import com.bookapi.application.model.Book;

public interface BookService {

	public Book saveBooks(Book book) ;

	public Book getBooksAll(Long id);

	public List<Book> findById();

}
