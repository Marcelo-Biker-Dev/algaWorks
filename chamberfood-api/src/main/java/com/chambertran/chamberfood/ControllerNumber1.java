package com.chambertran.chamberfood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerNumber1 {
	@GetMapping("/chucrute")
	@ResponseBody
	public static String chucrute() {
		return "cheira pum";
	}
}
