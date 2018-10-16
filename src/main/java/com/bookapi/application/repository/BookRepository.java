package com.bookapi.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookapi.application.model.Book;


@Repository("bookRepository")
public interface BookRepository extends JpaRepository<Book, Long> {

	
}
