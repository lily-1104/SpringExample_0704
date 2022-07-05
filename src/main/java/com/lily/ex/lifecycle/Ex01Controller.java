package com.lily.ex.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lifecycle/ex01")	 // 공통된 url 매핑 작성
public class Ex01Controller {
	
	
	@RequestMapping("/1")	// 임포트, /ex01/1 : 예제 1번의 첫번째 페이지 
		// 원래는 ("/lifecycle/ex01/1")인데 ("/1")만 입력한 이유는 
//		   위에 @RequestMapping("/lifecycle/ex01") 때문에!
	@ResponseBody	// 임포트
	public String printString() {
		return "예제 1번 문자열을 response에 담는다";
	}
	
	
	
	@RequestMapping("/2")
	
	@ResponseBody
	public Map<String, Integer> printMap() {
		
		// 과일 이름과 가격
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 1500);
		map.put("banana", 3000);
		map.put("orange", 1000);
		
		return map;
		
	}
	
	
	//  http://localhost:8080/lifecycle/ex01/1
	//  http://localhost:8080/lifecycle/ex01/2
	
	
}
