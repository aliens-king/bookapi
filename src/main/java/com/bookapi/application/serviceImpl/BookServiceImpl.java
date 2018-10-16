
package com.bookapi.application.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapi.application.model.Book;
import com.bookapi.application.repository.BookRepository;
import com.bookapi.application.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public Book saveBooks(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public Book getBooksAll(Long id) {
		// TODO Auto-generated method stub
		
		return bookRepository.getOne(id);
	}

	public List<Book> findById() {
        // TODO Auto-generated method stub
        return bookRepository.findAll();
        
    }


}
