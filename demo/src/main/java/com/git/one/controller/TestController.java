package com.git.one.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/check")
	public String doCheck() {
		return "working!!!";
	}
}
