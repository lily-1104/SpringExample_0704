package com.lily.ex.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lily.ex.database.bo.UsedGoodsBO;
import com.lily.ex.database.model.UsedGoods;

@Controller
public class UsedGoodsController {
	
	@Autowired	 // 임포트
	private UsedGoodsBO usedGoodsBO;	// 임포트
	
	
	// used goods 안에 있는 모든 내용을 json으로 전달한다 
	@RequestMapping("/database/ex01/1")
	@ResponseBody
	public List<UsedGoods> ex01() {
		
		List<UsedGoods> list = usedGoodsBO.getUsedGoodsList();
		
		return list;
	}
	
	
		//  http://localhost:8080/database/ex01/1

	
}
