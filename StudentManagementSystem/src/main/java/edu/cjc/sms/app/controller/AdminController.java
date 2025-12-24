package edu.cjc.sms.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController 
{
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
}
