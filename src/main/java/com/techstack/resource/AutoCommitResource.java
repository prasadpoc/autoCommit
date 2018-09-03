package com.techstack.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoCommitResource {

	@GetMapping ("/callme")
	public String callme() {
		return "Successfull !!!!!!!";
	}
}
