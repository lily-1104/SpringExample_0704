package com.lily.ex.lifecycle.model;

public class Person {
	
	
	// 이름, 나이 
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {	// 값을 끄집어내려고 get 사용, 
							// get이 있어야 잭슨이 제이슨을 만들 수 있음
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	// 위 코드 작성할 때 ★★
//	private String name;
//	private int age;
//	
//	두줄 입력 후 오른쪽 마우스 -> Source -> Generate Getters and Setters 클릭
//		-> name, age 체크 -> Generate
	
	
	

}
