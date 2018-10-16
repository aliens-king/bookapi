package com.bookapi.application.service;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bookapi.application.model.Book;
@Service
public class RestClientService {

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


}
