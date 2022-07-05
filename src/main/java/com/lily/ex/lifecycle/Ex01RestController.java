package com.lily.ex.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lily.ex.lifecycle.model.Person;

//@Controller	  	// 임포트, Controller 클래스 만들면 무조건 @Controller 어노테이션 하기!! 

@RestController 	// RestController : controller + responseBody
//					   	responseBody 기반으로 작성되는 클래스면 RestController 사용 가능

@RequestMapping("/lifecycle/ex01")
public class Ex01RestController {
	
	
	@RequestMapping("/3")	// 임포트
	public String printString() {
		
		return "RestController 테스트";
	}

	
	
	@RequestMapping("/4")
	public Person printObject() {	// Person이 다른 클래스라서 임포트 해야함
		
		Person person = new Person();	// 생성자 만들어줌
		person.setName("김인규");
		person.setAge(28);
		
		return person;
	}
	
	
	
	@RequestMapping("/5")
	public ResponseEntity<Person> entity() {	// 임포트
		
		Person person = new Person();	
		person.setName("김인규");
		person.setAge(28);
		
		// 데이터를 전달할 때 response의 status 코드를 추가로 전달
		// 정상 status 코드 : 200 OK   (아무 문제가 없음)
		ResponseEntity<Person> entity = new ResponseEntity(person, HttpStatus.INTERNAL_SERVER_ERROR);  
		
		return entity;
		
		
	}
	
	
		//  http://localhost:8080/lifecycle/ex01/3
		//  http://localhost:8080/lifecycle/ex01/4
		
	
}
