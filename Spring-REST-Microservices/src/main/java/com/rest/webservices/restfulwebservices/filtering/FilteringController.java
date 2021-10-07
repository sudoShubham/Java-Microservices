package com.rest.webservices.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

	@GetMapping(value = "/filtering", params = "v1")
	public SomeBean retrieveSomeBean() {
		return new SomeBean("Value1", "Value2", "Value3");
	}

	@GetMapping(value = "/filtering", params = "v2")
	public List<SomeBean> retrieveSomeBeanList() {
		return Arrays.asList(new SomeBean("Value1", "Value2", "Value3"), new SomeBean("Value11", "Value22", "Value33"));
	}

}
