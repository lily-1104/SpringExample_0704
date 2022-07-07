package com.lily.ex.database.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lily.ex.database.model.UsedGoods;

@Repository
public interface UsedGoodsDAO { 	// 꼭 인터페이스로 만들기!! ★★★
	
	// used goods 에서 모든 데이터 조회 
	public List<UsedGoods> selectUsedGoodsList();

}
