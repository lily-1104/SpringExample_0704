package com.lily.ex.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lily.ex.database.dao.UsedGoodsDAO;
import com.lily.ex.database.model.UsedGoods;

@Service
public class UsedGoodsBO {
	
	@Autowired
	private UsedGoodsDAO usedGoodsDAO;
	
	
	// used goods 데이터 모두 가져오는 메소드 만들기 
	public List<UsedGoods> getUsedGoodsList() {
		List<UsedGoods> list = usedGoodsDAO.selectUsedGoodsList();
		// 원래 하는일 : 데이터 조작 
		// 조작 조작 조작 
		
		return list;
	}
	
	
	
}
