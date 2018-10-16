package com.bookapi.application.mvccontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bookapi.application.service.RestClientService;

@Controller
public class RestClientController {

	 private final RestClientService service;

	    //Argument contructor of controller, pass in the service
	    //and Autowire it
	    @Autowired
	    public RestClientController(RestClientService service){
	       this.service = service;
	    }
	    
	    @GetMapping("/todo")
	    public String getAll(Model model){
	        model.addAttribute("books", service.findAllBooks());
	        return "todo";
	    }
}
