package com.lily.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lily.ex.mybatis.bo.ReviewBO;
import com.lily.ex.mybatis.model.Review;

@Controller
@RequestMapping("/mybatis")
public class ReviewController {
	
	
	@Autowired
	private ReviewBO reviewBO;
	
	
	// id가 3인 리뷰 가져오기 
		// /mybatis/ex01/1?id=8
	@ResponseBody
	@RequestMapping("/ex01/1")
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
	
	
	
	@ResponseBody
	@RequestMapping("/ex02/1")
	public String addReview() {
		
		// 리뷰 한행 저장
			// storeId, menu, userName, point, review
			// 4, "콤비네이션 피자", "김바다", 4.5, "할인도 많이 받고 잘 먹었습니다" 
		
		int count = reviewBO.addReview(4, "콤비네이션 피자", "김바다", 4.5, "할인도 많이 받고 잘 먹었습니다");  
		
		return "삽입 결과 : " + count;
		
	}
	
	
		//  http://localhost:8080/mybatis/ex02/1
	
	
	
	@ResponseBody
	@RequestMapping("/ex02/2")
	public String addReviewByObject() {
		
		// 2, "뿌링클", "김인규", 4.0, "역시 뿌링클은 진리입니다"
		
		Review review = new Review();
		review.setStoreId(4);
		review.setMenu("뿌링클");
		review.setUserName("김인규");
		review.setPoint(4.0);
		review.setReview("역시 뿌링클은 진리입니다");
		
		
		int count = reviewBO.addReviewByObject(review);
		
		return "삽입 결과 : " + count;
		
	}
	
	
		//  http://localhost:8080/mybatis/ex02/2
	
	
	
	
	
	

}
