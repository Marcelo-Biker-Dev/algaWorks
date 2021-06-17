package com.chambertran.chamberfood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerNumber2 {
	@GetMapping("/gorgonzola")
	@ResponseBody
	public static String gorgonzola() {
		return "cheira chulé";
	}
}
