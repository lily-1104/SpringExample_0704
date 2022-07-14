package com.lily.ex.jsp.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lily.ex.jsp.model.User;

@Repository
public interface UserDAO {
	
	
	public int insertUser(		// insert한 행의 개수라서 int로 리턴
			@Param("name") String name
			, @Param("yyyymmdd") String yyyymmdd
			, @Param("introduce") String intriduce
			, @Param("email") String email); 	
			
	
	
	public int insertUserWithId(User user);
	
	
	
	// 가장 최근 등록된 사용자 정보 조회
	public User selectLastUser();	// 내가 만든 패키지 이름 찾아서 임포트
	
}
