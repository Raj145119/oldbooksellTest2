package com.oldBookSell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oldBookSell.dto.OldBookSellDTO;
import com.oldBookSell.model.SellOrderRequest;
import com.oldBookSell.repository.SellOrderRequestRepository;
import com.oldBookSell.service.OldBookSellServices;

@RestController
@RequestMapping
@CrossOrigin
public class OldBookSellController {
	
		@Autowired
		OldBookSellServices oldBookSellServices;
		
		
		@Autowired
		SellOrderRequestRepository sellOrderRequest;// for testing purpose
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		//String currentPrincipalName = authentication.getName();
		
		@GetMapping("/hello")
		public  String hello() {
			//UserDetails userDetails = (UserDetails) authentication.getPrincipal();
			System.out.println(authentication.getName());
			return "hello fundtion excute sucessfully";
		}
		
		@RequestMapping("/add")
		public OldBookSellDTO createUser(@RequestBody OldBookSellDTO userDetail) {
			return  oldBookSellServices.createUser(userDetail);
		}
		
		
		// for testing purpose 
		@RequestMapping("/bookDetailsRequest")
		public SellOrderRequest addBookDetails(SellOrderRequest bookDetailsObj) {
			return sellOrderRequest.save(bookDetailsObj);
		}
		
}
