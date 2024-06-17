package com.jac.bookStoreManagement.controller;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jac.bookStoreManagement.entity.Book;
import com.jac.bookStoreManagement.entity.Order;
import com.jac.bookStoreManagement.service.IBookService;



@Controller
public class SecurityController {
	
	@Autowired
	private IBookService bookService;
	
	@GetMapping("/")
	public String showBookList(Model theModel) {
		
		Date currentDate = new Date();
		List<Book> theBook = bookService.findAll();
		
		theModel.addAttribute("book", theBook);
		theModel.addAttribute("order", new Order());
		theModel.addAttribute("currentDate", currentDate);
		
		return "public/home";
	}
	
	
	
	
	@GetMapping("/login")
	public String showMyLoginPage() {
		return "public/login";
	}
	
	@GetMapping("/access-denied")
	public String accessDenied() {
		return "customer/accessDenied";
	}


}
