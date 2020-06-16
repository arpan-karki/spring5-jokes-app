package org.springframework.joke.jokeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.joke.jokeapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Joke {

	private JokeService jokeService;
	
	@Autowired
	public Joke(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/",""})
	public String showJoke(Model model) {
		System.out.println(jokeService.getJoke());
		model.addAttribute("joke",jokeService.getJoke());
		return "chucknorris/chucknorris";
	}
	
}
