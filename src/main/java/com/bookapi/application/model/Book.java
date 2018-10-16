package com.bookapi.application.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOOK")
public class Book implements Serializable{
	
	
/**
	 * 
	 */
	private static final long serialVersionUID = -139863426212292908L;
	
	
private Long id;
private String title;
private String author;




@Column(name="book_title")
public String getTitle() {
	return title;
}

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public void setTitle(String title) {
	this.title = title;
}
@Column(name="book_author")
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}


}
