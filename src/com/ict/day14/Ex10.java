package com.ict.day14;

import java.util.InputMismatchException;
import java.util.Scanner;

//	finally : 예외 처리와 상관없이 반드시 실행해야 되는 문장을 처리할때 사용
//			 주로 데이터베이스, 입/출력, 네트워크에서 사용 (보통 닫을 때 사용)
//			 
//		형식) try {
//				예외 발생 가능한 문장들 ;
//				예외 발생 가능한 문장들 ;
//				예외 발생 가능한 문장들 ;
//			} catch ( 예외객체 e ) {
//				예외 발생시 처리하는 문장 ;
//			} catch ( 예외객체 e ) {
//				예외 발생시 처리하는 문장 ;
//			} finally {
//				반드시 실행해야 되는 문장 ;
//			}

public class Ex10 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {
			int su1 = 25;
			System.out.print("정수 입력 : ");
			int su2 = scan.nextInt();
			System.out.println("정답 : " + (su1 / su2));
		} catch (InputMismatchException e) {
			System.out.println("문자가 입력 되었습니다.");
			scan.nextLine(); 
			//return;									//	호출한 곳으로 되돌아간다. 즉, JVM 으로 돌아가는데 
		} catch (ArithmeticException e) {				//	원래는 바로 가지만 finally 가 있으면
			System.out.println("0 으로는 나눌 수 없습니다.");	//	finally 는 무조건하고 되돌아간다.
			scan.nextLine();							//	수고하셨습니다.는 안찍히고 되돌아간다.
			//return;
		} finally {
			scan.close();							//	close 는 대부분 finally 에 넣는다
			System.out.println("반드시 실행되는 문장");	//	정상적인 경우에서는 닫힐 수 있지만, 
		}											//	망가질 경우에는 catch 로 떨어져 close 가 안될 수 있다.
		
		System.out.println("수고하셨습니다.");
		
		
		
	}
}
