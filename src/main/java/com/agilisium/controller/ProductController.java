package com.agilisium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agilisium.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/api/getproductdetails")
	public ResponseEntity<Object> getProduct() {
		return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
	}

}