package com.ktdsuniversity.edu.fp.basic;

//함수형 인터페이스 지정
@FunctionalInterface
public interface PrintSomething {
	
	void print(String message);
	
	//추상메소드가 더 생기면 CallFunciton.java에서 람다식 사용 불가 추상메소드는 1개만 있어야함
//	void printRepeat(String message);

}
