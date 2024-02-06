package com.ict.day18;

//	VO(Value Object), DTO(Data Transfer Object)
//	값이 있는 객체이다.
//	아래처럼 하는 것이 기본이다.
public class Ex08 {
	private String name;
	private int age;
	
	public Ex08() {
		
	}
	
	public Ex08(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
