package com.lily.ex.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller		// 임포트
public class HelloController {
	
	@ResponseBody	// 임포트 
	@RequestMapping("/hello")	// 임포트
	public String helloWorld() {	// 메소드 내마음대로 작성
		return "Hello World";
	}

	
		//  http://localhost:8080/hello
	
	
}
