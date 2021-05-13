package com.ltts.ConnectedBoatSimulatorUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatessentials;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatessentialsService;

@Controller
public class BoatessentialsController {
	@Autowired
	private BoatessentialsService service1;
	
	@GetMapping("/")
	public String viewEngine(Model model) {
		List<Boatessentials> li1 = service1.getAllBoatessentials();
		model.addAttribute("boatessentialslist", li1);
		return "boatessentialslist";
	}
	
	
	@RequestMapping("/boatenginelist")
	public ModelAndView firstMethod() {
		return new ModelAndView("boatenginelist");
	}	
	
	
	@RequestMapping("/boatessentialslist")
	public ModelAndView secondMethod() {
		return new ModelAndView("boatessentialslist");
	}	
	
	@RequestMapping("/boateventlist")
	public ModelAndView thirdMethod() {
		return new ModelAndView("boateventlist");
	}	
	@RequestMapping("/boatlocationlist")
	public ModelAndView fourthMethod() {
		return new ModelAndView("boatlocationlist");
	}	
	@RequestMapping("/boatloglist")
	public ModelAndView fivthMethod() {
		return new ModelAndView("boatloglist");
	}	
	@RequestMapping("/boatsensorlist")
	public ModelAndView sixthMethod() {
		return new ModelAndView("boatsensorlist");
	}	
}

