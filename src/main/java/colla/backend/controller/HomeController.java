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
		
		//수정 수wjd123123
		
		String aa = "aaa";
		
		return "home";
	}
	@RequestMapping("toindex")
	public String index() {
		
		//수정 수wjd123123
		
		//병합!!!!
		
		//창현
		
		
		return "index";
		
	}


}

		
