package com.lily.ex.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lily.ex.mybatis.model.Review;

@Repository
public interface ReviewDAO {
	
	
	// new_review 테이블에서 id가 3인 리뷰 가져오기 
	public Review selectReview(@Param("id") int id);
			// "id" 의 값 입력 후 reviewMapper.xml 가서 `id` = #{id} 으로 변경하기

}
