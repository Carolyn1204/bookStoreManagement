package com.jac.bookStoreManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.jac.bookStoreManagement.entity.BookOrderDTO;
import com.jac.bookStoreManagement.entity.Order;

import com.jac.bookStoreManagement.service.IOrderService;

@Controller
public class CustomerController {

	@Autowired
	private IOrderService orderService;

	

	@PostMapping("/saveOrder")
	public String saveOrder(@ModelAttribute("order") Order theOrder, @AuthenticationPrincipal UserDetails userDetails) {
		
		String username = userDetails.getUsername();
		orderService.saveOrder(theOrder);		
		return "redirect:/getCustomerOrderList?customerName=" + username;
	}

	@GetMapping("/getCustomerOrderList")
	public String getCustomerOrderList(@RequestParam("customerName") String customerName, Model theModel) {

		List<BookOrderDTO> customerOrderList = orderService.getBookOrdersByCustomerName(customerName);
		theModel.addAttribute("order", customerOrderList);

		return "public/orderList";

	}

}
