package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping ("/home")
	public String home(Model model) {
		
		System.out.println("this is home url");
		
		model.addAttribute("name","Asif shaikh ");
		model.addAttribute("id",164);
		model.addAttribute("mobile","9768229086");
		
		List<String>friends=new ArrayList<String>();
		friends.add("azhar");
		friends.add("shubham");
		friends.add("Umar");
		model.addAttribute("f",friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
	System.out.println("this is about page");
	return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() 
	{
		System.out.println("this is help controller");
		//creating model and view object
		ModelAndView modelAndview =new ModelAndView();
		
		//setting data
		modelAndview.addObject("name", "Asif Shaikh");
		modelAndview.addObject("mobile", "9768229086");
		modelAndview.addObject("id", 162);
		LocalDateTime now=LocalDateTime.now();
		modelAndview.addObject("time", now);
		
		//adding collection data
		List<String> l=new ArrayList<String>();
		l.add("asif");
		l.add("umar");
		l.add("azhar");
		l.add("shubham");
		l.add("Asad");
		 modelAndview.addObject("frnd", l);
		
		
		
		now.toString();
		
		//setting view name
		modelAndview.setViewName("help");
		return modelAndview;
	}
	
}
