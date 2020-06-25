package colla.backend.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping("/")

	public String home() {
		
		
		return "home";
	}
	@RequestMapping("hyundong")
	public String index() {
		
		//병합 문제 해결해봅시다!! HD
		
		return "index";
		
	}


}

		
