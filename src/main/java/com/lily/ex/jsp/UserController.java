package com.lily.ex.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lily.ex.jsp.bo.UserBO;
import com.lily.ex.jsp.model.User;

@Controller
@RequestMapping("/jsp/user")	// 아래에서 GET을 쓸지 POST를 쓸지 모르니까 위에서는 @RequeMapping 사용
public class UserController {
	
	
	@Autowired
	private UserBO userBO;
	
	
	// 사용자가 파라미터를 통해서 전달한 데이터로 사용자 정보 저장 
	
	@ResponseBody
//	@RequestMapping(path="/jsp/user/insert", method=RequestMethod.POST)		=> 기본 값은 .POST가 아니라 .GET임, POST 메소드 사용할거면 꼭 바꿔줘야함  
	@PostMapping("/insert")		// 위의 @RequestMapping(path= ~ RequestMethod.POST)를 대체 가능! (간단 버전)
	public String addUser(		// 메소드 만들기, 메소드 이름 : addUser
			
			@RequestParam("name") String name
			, @RequestParam("yyyymmdd") String yyyymmdd
			, @RequestParam(value="introduce", required=false) String introduce  
			, @RequestParam(value="email", required=false) String email) {	 
		
				// SQL에서 DESC 보면 null 값이 가능한 항목이 있음
				// 이럴때는 (value="introduce", required=false) 형식으로 입력해야함 
				// required는 기본이 true, 비필수 항목이면 false  
		
		int count = userBO.addUser(name, yyyymmdd, introduce, email);
		
		return "삽입 결과 : " + count;
		
	}
	
	
		//  http://localhost:8080/jsp/user/insert?name=유재석&yyyymmdd=20020325  
	
	
	
	@PostMapping("/insert_view")
	public String addUserView(
			
			@ModelAttribute User user,
			Model model) {
		
		int count = userBO.addUserWithId(user);
		model.addAttribute("result", user);
		
		return "jsp/userInfo";
		
	}
	
	
		//  http://localhost:8080/jsp/user/insert_view
	
	
	
	// jsp 연결 
	
	@GetMapping("/input_view")		// view로 리스펀스 받아서 @ResponseBody 쓰면 안됨!
	public String userInputView() {
		
		return "jsp/userInput";		// jsp 파일 이름
		
	}
	
	
		// http://localhost:8080/jsp/user/input_view
	
	
	
	@GetMapping("/info")
	public String userInfo(Model model) {	 // 경로 보여줄거니까 String으로 리턴
		
			// 가장 최신 사용자 정보 
		User user = userBO.getLastUser();	// 임포트 
		
		model.addAttribute("result", user);		// user 객체를 result jsp로 사용  
		
		return "jsp/userInfo";
		
	}
	
	
		//  http://localhost:8080/jsp/user/info
	
	
}
