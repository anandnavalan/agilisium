package com.agilisium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agilisium.service.ConfigService;

@RestController
public class ConfigController {

	@Autowired
	ConfigService configService;

	@RequestMapping(value = "/api/getconfigdetails")
	public ResponseEntity<Object> getConfig() {
		return new ResponseEntity<>(configService.getConfig(), HttpStatus.OK);
	}

}