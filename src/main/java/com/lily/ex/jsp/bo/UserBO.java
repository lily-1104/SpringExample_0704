package com.lily.ex.jsp.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lily.ex.jsp.dao.UserDAO;
import com.lily.ex.jsp.model.User;

@Service
public class UserBO {
	
	@Autowired
	private UserDAO userDAO;
	
	
	public int addUser (String name, String yyyymmdd, String introduce, String email) {  
		
		return userDAO.insertUser(name, yyyymmdd, introduce,  email);
		
	}
	
	
	
		// jsp 연결 
	
	// 가장 최신 등록된 사용자 정보 
	
	public User getLastUser() {		// 임포트, 내가 만든 패키지 이름 찾아서 임포트
		
		return userDAO.selectLastUser();
		
	}
	
}
