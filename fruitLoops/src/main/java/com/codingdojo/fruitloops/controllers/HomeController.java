package com.codingdojo.fruitloops.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.fruitloops.models.Item;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(Model model) {
		
		
		
		return "index.jsp";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(
		@RequestParam(value="number") String number,
	    @RequestParam(value="city") String nice,  @RequestParam(value="person") String person, @RequestParam(value="hobby") String hobby, @RequestParam(value="thing") String thing, @RequestParam(value="words") String words,  Model model, HttpSession session) {
	    
	    	
		session.setAttribute("sessionNumber", number);
		session.setAttribute("sessionCity", nice);
		session.setAttribute("sessionPerson", person);
		session.setAttribute("sessionHobby", hobby);
		session.setAttribute("sessionThing", thing);
		session.setAttribute("sessionWords", words);
		
		model.addAttribute("numberToJsp", number);
		model.addAttribute("cityToJsp", nice);
	    model.addAttribute("personToJsp", person);
	    model.addAttribute("hobbyToJsp", hobby);
	    model.addAttribute("thingToJsp", thing);
	    model.addAttribute("wordsToJsp", words);
	    	
	    	return "welcome.jsp"; // <-- we'll change this when we learn redirecting
	}
	@RequestMapping("/goback")
	public String goBack() {
		return "redirect:/";
		
	}
	
	
	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		
		ArrayList<Item> fruits = new ArrayList<Item>();
        fruits.add(new Item("Kiwi", 1.5));
        fruits.add(new Item("Mango", 2.0));
        fruits.add(new Item("Goji Berries", 4.0));
        fruits.add(new Item("Guava", .75));
        model.addAttribute("addFruit", fruits);
		return "dashboard.jsp";
	}
	

}
