package com.lily.ex.jstl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lily.ex.jsp.model.User;

@Controller
@RequestMapping("/jstl")
public class JSTLController {
	
	@GetMapping("/ex01")
	public String ex01() {
		
		return "jstl/ex01";		// jstl은 src쪽에 있는 폴더 이름
	}
	
	
		//  http://localhost:8080/jstl/ex01
	
	
	
	@GetMapping("/ex02")
	public String ex02(Model model) {	// List 때문에 model 작성 
		
		// 과일 이름 리스트
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("melon");
		fruits.add("peach");
		fruits.add("mango");
		
		model.addAttribute("data", fruits);
		
		
		
		List<User> userList = new ArrayList<>();	// 내가 만든 패키지로 임포트
		
		User user1 = new User();
		user1.setName("김인규");
		user1.setYyyymmdd("20120325");
		user1.setEmail("lecture@hagulu.com");
		userList.add(user1);
		
		User user2 = new User();
		user2.setName("유재석");
		user2.setYyyymmdd("20020511");
		user2.setEmail("yu@hagulu.com");
		userList.add(user2);
		
		model.addAttribute("userList", userList);
		
		return "jstl/ex02";
	}
	
	
		//  http://localhost:8080/jstl/ex02
	
	
	
	@GetMapping("/ex03")
	public String ex03(Model model) {
		
		Date now = new Date();	// java.util.date로 임포트
		model.addAttribute("now", now);
		
		
		return "jstl/ex03";
	}
	
	
		//  http://localhost:8080/jstl/ex03
	
	
	
	@GetMapping("/ex04")
	public String ex04() {
		
		return "jstl/ex04";
	}
	
	
		// http://localhost:8080/jstl/ex04
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
