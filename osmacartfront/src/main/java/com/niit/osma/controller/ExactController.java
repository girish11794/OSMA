package com.niit.osma.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ExactController 
{ 
	@RequestMapping("/")
	public String gohome()
	{
				return "index";
	}
	@RequestMapping("/registeration")
	public String registeration(Model model)
	{
		model.addAttribute("registermessage","You are successfully registered");
		return "index";
	}
	
	@RequestMapping("/validate")
	public String validate(@RequestParam("userid")String id,@RequestParam("password") String pwd,Model model)
	{
		if(id.equals("niit") && pwd.equals("niit"))
		{
			model.addAttribute("SuccessMessage","WELCOME");
			return "index";
				}
		else if(id.equals("123") && pwd.equals("456"))
		{
			model.addAttribute("SuccessAdmin","you have successfully loggedin as admin");
			return "admin";
		}
		else
			
		{
			model.addAttribute("ErrorMessage","Invalid Credentials");
			return "index";
		}
		
		
				}
	@RequestMapping("/login")
	public String login(Model model)
	{
		
			model.addAttribute("userClickedLogin","true");
			return "login";
	}
	@RequestMapping("/register")
	public String register(Model model)
	{
		model.addAttribute("userClickedRegister","true");
			return "register";
	}
	
	
	@RequestMapping("/home")
	public String home(Model model)
	{
							return "index";
	}

		@RequestMapping("/aboutus")
	public String about(Model model)
	{
		model.addAttribute("aboutus","true");
					return "aboutus";
	}
	@RequestMapping("/contactus")
	public String contatc(Model model)
	{
		model.addAttribute("contactus","true");
					return "contactus";
	}
	
	@RequestMapping("/mycart")
	public String mycart(Model model)
	{
		model.addAttribute("mycart","true");
					return "mycart";
	}
	@RequestMapping("/canon")
	public String canon(Model model)
	{
		model.addAttribute("userClickedCanon","true");
					return "canon";
	}
	@RequestMapping("/nikon")
	public String nikon(Model model)
	{
		model.addAttribute("userClickedNikon","true");
					return "nikon";
	}
				}