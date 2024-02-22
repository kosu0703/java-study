package com.ict.day18;

import java.util.function.BinaryOperator;

//	reduce(초기값, 수행할 기능)
//	reduce(T identity, BinaryOperator<T> accumulator)

public class Ex08 implements BinaryOperator<String>{	//	상속받아야 reduce 사용 가능 

	@Override
	public String apply(String s1, String s2) {
		//	글자수가 더 긴 문자열 반환
		if (s1.length() >= s2.length()) {		
			return s1;
		}else {
			return s2;
		}
	}
	
}



