package com.bookapi.application.mvccontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bookapi.application.model.Book;
import com.bookapi.application.service.RestClientService;

@Controller
//@RequestMapping("clientview")
public class RestClientController {

	private final RestClientService service;

	// Argument contructor of controller, pass in the service
	// and Autowire it
	@Autowired
	public RestClientController(RestClientService service) {
		this.service = service;
	}

	@GetMapping("/todo")
	public String getAll(Model model) {
		model.addAttribute("books", service.findAllBooks());
		return "todo";
	}
	@GetMapping("/saveBks")
	public String saveAllBooks(Model model,@ModelAttribute("book") Book book) {
		model.addAttribute("bks", service.saveAllBooks(book));
		return"../templates/save"
;	}

	/*@RequestMapping(method = RequestMethod.POST, value ="/saveBks")
	public Book saveAllBooks(Model model, @RequestBody Book book) {
	https://g00glen00b.be/consuming-rest-apis-with-spring/
		model.addAttribute("bks", service.saveAllBooks(book));
		return book;
	}*/
}
