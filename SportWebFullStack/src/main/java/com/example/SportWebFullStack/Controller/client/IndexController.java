package com.example.SportWebFullStack.Controller.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SportWebFullStack.Service.MatHangService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Controller
@RequestMapping("/admin")
public class IndexController {
@Autowired
private MatHangService matHangService;
	@GetMapping()
	public String login(Model model) throws JsonMappingException, JsonProcessingException {
		model.addAttribute("products", this.matHangService.getDataFromAPI());
		return "FrontEnd/index";
	}
}
