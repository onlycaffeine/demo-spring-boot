package com.thuan.anular.spring.example.DemoSpringBoot;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thuan.anular.spring.example.dto.Book;

@SpringBootApplication
@RestController
public class DemoSpringBootApplication {
	
	@GetMapping("/findAllBooks")
	
	public List<Book> getBooks(){
		return Stream.of(new Book(101, "Java", 999),
				new Book(103, "Spring", 888)).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootApplication.class, args);
	}

}
