package in.sbms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String msg="Welcome To Code Lab...";
		return msg;
	}

}
