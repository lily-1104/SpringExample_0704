package com.lily.ex.mybatis.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lily.ex.mybatis.dao.ReviewDAO;
import com.lily.ex.mybatis.model.Review;

@Service
public class ReviewBO {
	
	
	@Autowired
	private ReviewDAO reviewDAO;
	
	
	// id가 3인 리뷰 가져오기 
	public Review getReview(int id) {
		
		Review review = reviewDAO.selectReview(id);		// controller로부터 전달받은 id
		
		return review;
		
	}

}
