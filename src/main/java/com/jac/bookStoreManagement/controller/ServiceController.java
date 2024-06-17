package com.jac.bookStoreManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jac.bookStoreManagement.entity.Book;
import com.jac.bookStoreManagement.entity.BookOrderDTO;
import com.jac.bookStoreManagement.service.IBookService;
import com.jac.bookStoreManagement.service.IOrderService;

import jakarta.validation.Valid;




@Controller
public class ServiceController {
	
	@Autowired
	private IBookService bookService;
	
	@Autowired
	private IOrderService orderService;
	
	@GetMapping("/admin/showBookFormForAdd")
	public String showBookFormForAdd(Model theModel) {
		Book theBook = new Book();  
		theModel.addAttribute("book", theBook); 
		return "admin/bookForm";
	}
	
	@PostMapping("/admin/saveBook")
	public String saveBook(@Valid @ModelAttribute("book") Book theBook, BindingResult result) {
		
		if (result.hasErrors()) {
            return "admin/bookForm";
        }
		
		bookService.save(theBook);
		return "redirect:/";	
	}
	
	@GetMapping("/admin/showBookFormForUpdate")
	public String showBookFormForUpdate(
			@RequestParam("bookId") int theId,
			Model theModel) {
		
		Book theBook = bookService.findById(theId);
		theModel.addAttribute("book", theBook);
		return "admin/bookForm";					
	}
	
	@GetMapping("/admin/deleteBook")
	public String deleteBook(@RequestParam("bookId") int theId) {
		bookService.deleteById(theId);
		return "redirect:/";	
	}
	
	@GetMapping("/viewBook")
	public String viewBook(@RequestParam("bookId") int theId, Model theModel) {
		Book theBook = bookService.findById(theId);
		theModel.addAttribute("book", theBook);
		return "public/bookDetail";
	}
	
	@GetMapping("/getAllOrderList")
	public String getAllOrderList(Model theModel) {

		List<BookOrderDTO> allOrder = orderService.getAllBookOrders();
		theModel.addAttribute("order", allOrder);

		return "public/orderList";

	}

	

}
