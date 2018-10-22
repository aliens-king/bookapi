package com.bookapi.application.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bookapi.application.model.Book;
@Service
public class RestClientService {

	private  final String  POST_ALL_URL = "http://localhost:8080/saveBooks";
	private  final String  GET_ALL_URL = "http://localhost:8080/books";
	//define a RestTemplate object
    private final RestTemplate restTemplate;
	
	@Autowired
    public RestClientService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
	
	 public List<Book> findAllBooks(){
	        return Arrays.stream(restTemplate.getForObject(GET_ALL_URL,Book[].class)).collect(Collectors.toList());
	    }

	/*public Book saveAllBooks(Book book) {
		RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/saveBooks";
        Map<String, String> map = new HashMap<String, String>();
        map.put("id", "111");
        map.put("name", "Shyam");
        book = new Book( "Varanasi", "UP");
        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
      return restTemplate.postForObject(url, book, Book.class, map);
       
		 
		// TODO Auto-generated method stub
		// return Arrays.stream(restTemplate.getForObject(POST_ALL_URL,Book[].class)).collect(Collectors.toList());
	}*/
	 
	 public Book saveAllBooks(Book book) {
		//return Arrays.stream(restTemplate.postForObject( POST_ALL_URL,book,Book[].class)).collect(Collectors.toList());
 return restTemplate.postForObject(POST_ALL_URL, book, Book.class);
}
}