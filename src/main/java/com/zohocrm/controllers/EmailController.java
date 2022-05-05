package com.zohocrm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.utility.EmailService;

@Controller
public class EmailController {
	@Autowired
	private EmailService email;
	@RequestMapping("sendEmail")
public String sendMail(@RequestParam("emailId")String email,ModelMap model) {
		model.addAttribute("email",email);
	return "compose_email";
}
	@RequestMapping("/compose")
	public String composeEmail(@RequestParam("to")String to,@RequestParam("subject")String subject,@RequestParam("text")String text,ModelMap model) {
		email.sendSimpleMessage(to, subject, text);
		model.addAttribute("msg","Email is sent");
		return "compose_email";
	}
}
