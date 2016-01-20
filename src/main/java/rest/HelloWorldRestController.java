package rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String getHello() {
		return "Hello World!";
	}
}
