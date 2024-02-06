package com.ict.day10;

import java.util.Iterator;

public class Ex01 {
	//	메서드의 인자에 기본자료형인 값을 인자로 전달하면 값 호출 (Call By Value)
	//	원본값은 변하지 않는다.
	public int add(int k) {
		++k ;
		return k ;
	}
	
	//	메서드의 인자에 배열이나 객체인 값을 인자로 전달하면 참조 호출 (Call By Reference)
	//	원본값이 변한다.
	public void add2(int[] k) {
		//	받은 배열을 하나씩 꺼내서 10 증가하자
		for (int i = 0; i < k.length; i++) {
			k[i] = k[i] + 10 ;	//	k[i] += 10 와 같음
			
		}
		
	}
	
	
	
	
	
}
