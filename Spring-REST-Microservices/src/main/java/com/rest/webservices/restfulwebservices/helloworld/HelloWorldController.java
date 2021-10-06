package com.rest.webservices.restfulwebservices.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Autowired
	private MessageSource messageSource;

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}

	@GetMapping(path = "/hello-world/{id}")
	public HelloWorldBean helloWorldWithId(@PathVariable int id) {

		return new HelloWorldBean("Hello India", id);
	}

//	
//	@GetMapping(path = "/hello-world-internationalized")
//	public String helloWorldInternationalized(
//			@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
//		return messageSource.getMessage("good.morning.message", null, "defaultValue", locale);
//	}

	@GetMapping(path = "/hello-world-internationalized")
	public String helloWorldInternationalized() {
		return messageSource.getMessage("good.morning.message", null, "defaultValue", LocaleContextHolder.getLocale());
	}

}
