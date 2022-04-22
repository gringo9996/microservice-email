package com.msemail.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class EmailDto {
	
	@NotBlank
	private String owerRef;
	
	
	@NotBlank
	@Email
	private String emailFrom;
	
	@NotBlank
	private String emailTo;
	
	@NotBlank
	private String subject;
	@NotBlank
	private String text;

}
