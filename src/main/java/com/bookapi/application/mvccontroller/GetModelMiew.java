package com.bookapi.application.mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/yes")
public class GetModelMiew {
	
	//@GetMapping("/check")
	public String getObj() {
		return"../templates/todo";
	}

}
