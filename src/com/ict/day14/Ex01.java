package com.ict.day14;

/*
 	내부클래스 : 클래스 안에 다른 클래스가 정의되어 있는 클래스
 	
 	종류) Member(멤버), Local(지역), static, Anonymous(익명)
  
  		1. Member
  			형식)
  			외부클래스{
  				...	
  				내부클래스{
  					...
  				}
  			 	...
  			 }
  			 
  			특징)	내부클래스는 외부클래스의 멤버필드와 멤버메서드를 마음대로 사용 가능 (상속과 비슷)
  			 	단, 상속은 private 접근이 안되지만, 내부클래스는 private 도 접근이 가능하다.
  				외부클래스를 통해서만 내부클래스를 생성할 수 있다.
  				(내부클래스만 별도로 객체 생성이 안된다.)
  
  		2. Local
  			형식)
  			외부클래스{
  				...
  				public void method(){
  					내부클래스{
  						...
  					}
  				} // 메서드
  				...
  			} // 클래스
  			
  			특징)	외부클래스의 메서드 안에 내부클래스가 존재한다.
  				외부클래스의 지역변수처럼 사용된다.
  				외부클래스의 메서드가 실행되어야 내부클래스를 생성할 수 있는 조건이 된다.
  				지역변수처럼 사용되기 때문에 메서드가 종료되면 내부클래스도 사라진다.
  				
  		3. static (거의 사용하지 않는다.)
  			형식)
  			외부클래스{
  				...	
  				static 내부클래스{
  					static 변수 	(스태틱 변수 때문에 내부클래스를 스태틱으로 만들어야한다)
  					...
  				}
  			 	...
  			 }
  			
  			특징)	Member 내부클래스와 같은 구조를 가지고 있다.
  				내부클래스의 멤버변수 중 하나라도 static 이 있으면, 내부클래스를 static 으로 만들어야된다.
  				그냥 static 접근 방법을 사용하면된다. (내부클래스이름.변수)
  				(외부클래스를 생성하지 않아도 된다.)
  				
  		**4. Anonymous 
  				
  			형식)
  			외부클래스{
  				...
  				
  				내부클래스 참조변수 = new 생성자(){				1) 내부클래스로 객체생성
  					..
  				}; (**객체 생성시 마지막에 세미클론 ; 붙여야한다)
  				...
  				
  				public void methodA(){				
  					new 내부클래스(){						2) 메서드 body 안에 내부클래스
  						...
  					}; ( ; 붙이자 )
  				}
  				
  				public void methodB(new 내부클래스(){		3) 메서드 인지에 내부클래스
  					...
  				});	( 메소드 끝에 ; 붙이자 )
  				
  			}	
  					
  			특징)	정의된 클래스의 이름이 없는 클래스
  				이름이 없으므로 다시 호출 할 수 없다.
  				일회용으로 한번 사용하고 다시 사용할 수 없다.
  
  
 */


public class Ex01 {

	
}
