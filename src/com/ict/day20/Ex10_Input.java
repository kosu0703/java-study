package com.ict.day20;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex10_Input {
	public static void main(String[] args) {
		
			//	역직렬화 (파일을 읽기)
			String pathname = "D:/kosu0703/util/object02.txt";
			File file = new File(pathname);
			
			FileInputStream fis = null;
			BufferedInputStream bis = null;
			ObjectInputStream ois = null;
			
			try {
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				ois = new ObjectInputStream(bis);
			
				//	객체가 여러개 일때 역직렬화
				//	무조건 형변환
				ArrayList<Ex10_VO> list = (ArrayList<Ex10_VO>) ois.readObject();
				System.out.println("이름\t나이\t몸무게\t성별");
				for (Ex10_VO k : list) {
					System.out.print(k.getName() + "\t");
					System.out.print(k.getAge() + "\t");
					System.out.print(k.getWeight() + "\t");
					if (k.isGender()) {
						System.out.println("남성");
					}else {
						System.out.println("여성");
					}
				}
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				try {
					ois.close();
					bis.close();
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		
	}
}
