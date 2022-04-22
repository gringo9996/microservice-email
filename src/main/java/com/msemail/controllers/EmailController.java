package com.msemail.controllers;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msemail.dtos.EmailDto;
import com.msemail.models.EmailModel;
import com.msemail.services.EmailService;

@RestController
@RequestMapping("/api")
public class EmailController {
	
	
	
	@Autowired
	EmailService emailService;
	
	
	@PostMapping("/sending-email")
	public ResponseEntity<EmailModel>sendingEmail(@RequestBody EmailDto emailDto){
		
		EmailModel emailModel= new EmailModel();
		BeanUtils.copyProperties(emailDto, emailModel);
		emailService.sendEmail(emailModel);
		return new ResponseEntity<>(emailModel,HttpStatus.CREATED);
		
	}

}
