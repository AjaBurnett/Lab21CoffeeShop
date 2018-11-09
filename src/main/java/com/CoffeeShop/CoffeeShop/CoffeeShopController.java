package com.CoffeeShop.CoffeeShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class CoffeeShopController {
	
	@Autowired
	private Person p;
	
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index", "firstPage", "Welcome to CG COFFEE ");
		mv.addObject("imageTest","https://images-na.ssl-images-amazon.com/images/I/61uy-R6AzDL._SL1000_.jpg");
		return mv;
	}

@RequestMapping("/register")
public ModelAndView aboutTest() {
return new ModelAndView("register");
}
@RequestMapping ("/formresults")
public ModelAndView formTest(@RequestParam ("firstname") String fname, @RequestParam("lastname") String lname) {
	//p.setFirstName(fname);
	//p.setLastName (lname);
	String sayHello = "Hello, " + fname;
	return new ModelAndView("adduser", "userData"  ,sayHello);	}
	
}
