package in.sbms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetApi {
	
	@Autowired
	private WelcomeClient welcomeClient;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		
		String greetMsg = "Good Morning.";
		 String welcomeMsg = welcomeClient.invokeWelcomeMsg();
		//String welcomeMsg = "Welcome To AshokIt..";
		return greetMsg +" "+welcomeMsg;
		
	}

}
