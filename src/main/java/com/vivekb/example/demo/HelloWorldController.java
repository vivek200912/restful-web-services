package com.vivekb.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.json.JSONObject;

//Controller  
@RestController
public class HelloWorldController {
	@GetMapping(path="/color")  
	public String helloWorld()  
	{  
	    return "{colorName:INDIANRED,colorRGBCode:(205, 92, 92)},{colorName:LIGHTCORAL,colorRGBCode:(240, 128, 128)},{colorName:SALMON,colorRGBCode:(250, 128, 114)}";  
	}  
}
