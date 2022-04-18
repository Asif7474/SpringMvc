package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {
	@RequestMapping("/contact")
	public String show(Model m)
	{
		m.addAttribute("Header","please fill the blank");
		return "contact";
	}
	
	@RequestMapping(path = "/processform",method = RequestMethod.POST)
	public String handleform(@ModelAttribute User user,Model model) {	
		System.out.println(user);
		return "success";
	}
}
			/*@RequestParam("email")String useremail,
			@RequestParam("name")String username,
			@RequestParam("password")String userpassword,Model model) {
		User user=new User();
		user.setEmail(useremail);
		user.setName(username);
		user.setPassword(userpassword);
		System.out.println(user);*/
		
		//proccess
		/*
		 * model.addAttribute("useremail", useremail); model.addAttribute("name",
		 * username); model.addAttribute("userpassword", userpassword);
		 */
		//model.addAttribute("user", user);
			
		
	
	
