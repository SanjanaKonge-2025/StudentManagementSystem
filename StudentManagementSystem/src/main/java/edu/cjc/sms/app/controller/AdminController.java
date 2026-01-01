package edu.cjc.sms.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cjc.sms.app.model.Student;
import edu.cjc.sms.app.servicei.StudentServiceI;
import jakarta.persistence.PostPersist;


@Controller
public class AdminController 
{
	@Autowired
	StudentServiceI ssi;
	
	@GetMapping("/")
	public String prelogin()
	{
		return "login";
	}
	
	@PostMapping("/login")
	public String onlogin(@RequestParam("username") String username, @RequestParam("password") String password, Model m)
	{
		if(username.equals("admin") && password.equals("admin"))
		{
			List<Student> students=ssi.getAllStudent();
			m.addAttribute("data", students);
			return "adminscreen";
		}
		else
		{
			m.addAttribute("login_fail", "Enter valid username and password");
			return "login";
		}
	}
	
	@RequestMapping("/enroll_student")
	public String saveStudentDetails(@ModelAttribute Student s, Model m)
	{
		ssi.saveStudentData(s);
		List<Student> students=ssi.getAllStudent();
		m.addAttribute("data", students);
		return "adminscreen";
	}
	@RequestMapping("/search")
	public String getBatchStudent(@RequestParam String batchNumber, Model m)
	{
		List<Student> result=ssi.searchStudentsByBatch(batchNumber);
		if(result.size()>0)
		{
			m.addAttribute("data", result);
		}
		else
		{
			List<Student> students=ssi.getAllStudent();
			m.addAttribute("data", students);
			m.addAttribute("message", "No records are available for the batch "+batchNumber+"'...!");
		}
		return "adminscreen";
	}
}
