package com.lily.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lily.ex.mybatis.bo.ReviewBO;
import com.lily.ex.mybatis.model.Review;

@Controller
public class ReviewController {
	
	
	@Autowired
	private ReviewBO reviewBO;
	
	
	// id가 3인 리뷰 가져오기 
		// /mybatis/ex01/1?id=8
	@ResponseBody
	@RequestMapping("/mybatis/ex01/1")
	public Review review(
			
				// @RequestParam 사용법
//			@RequestParam("id") int id) { // id 값 필수 (주소창에 파라미터 값이 없으면 에러남)
//			@RequestParam(value="id", required=true) int id	  => true면 필수
//			@RequestParam(value="id", required=false) int id 	 => false면 필수 아님
			@RequestParam(value="id", defaultValue="1") int id 	// => id가 1로 세팅됨
			
			
			) {
		
		Review review = reviewBO.getReview(id);
		
		return review;
		
	}
	
	
		//  http://localhost:8080/mybatis/ex01/1
		//  http://localhost:8080/mybatis/ex01/1?id=2
	

}
