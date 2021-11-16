package com.thuan.anular.spring.example.DemoSpringBoot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/getname")
	public String getName() {
		return "Nguyen Van Thuan";
	}
}
