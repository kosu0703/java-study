package com.ict.day10;

public class Ex02 {
	public static void main(String[] args) {
		Ex01 t = new Ex01();
		int var1 = 100;
		//	인자가 기본 자료형 : Call By Value
		//	값이 변하지 않는다.
		int var2 = t.add(var1);		//	var1 이 넘어간게 아니라 그 안에 있는 값 100 이 넘어가서
									//	var1 은 변하지 않는다.
		//	**값이 변하지 않는다
		System.out.println(var1);	// 	100
		//	반환값은 변한다.
		System.out.println(var2);	// 	101
		
		
		int[] su = {1,10,100,1000};
		//	인자가 객체(배열 포함) 자료형 : Call By Reference
		//	참조되는 값이 변할 수 도 있다.
		t.add2(su);	
		
		//	배열 안에 있는 값이 변한다.	
		for (int i = 0; i < su.length; i++) {
			System.out.print(su[i]+"\t");
		}
		
	}
}
