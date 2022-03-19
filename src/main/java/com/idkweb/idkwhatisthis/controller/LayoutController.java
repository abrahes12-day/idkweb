package com.idkweb.idkwhatisthis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class LayoutController {
	
	@GetMapping
	public ModelAndView layout() {
		ModelAndView view = new ModelAndView("fragments/layout");
		return view;
	}
}
