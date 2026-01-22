package oop;
//<pre></pre> html tag 안에 적은 것 그대로 출력한다
/**
 * <pre> 
 * 객체 지향 프로그래밍의 첫 번째 실습
 * 
 * 자동차 클래스의 속성과 기능을 구현함으로써 클래스와 객체에 대해 이해한다.
 * </pre>
 */
public class Car {
	
	// 클래스의 속성 (맴버변수 | 인스턴스 필드)
	
	/**
	 * <pre>
	 * 엔진의 시동여부
	 * 엔진이 꺼져있을때는 가속페달을 누르거나 브레이크를 밟아도 효과가 없다
	 * 엔진이 켜져있을때는 누르는 페달에 따라 speed 가 변화한다
	 * </pre>
	 */
	boolean isEngineStart;
	/**
	 * <pre>
	 * 자동차의 현재 속도를 표현
	 * 
	 * 가속 페달을 누르면 속도가 증가
	 * 브레이크 페달을 누르면 속도가 감소
	 * </pre>
	 */
	int speed;
	
	
	
	
	/** 
	 * 자동차 모델명
	 */
	String name;
	
	public Car(String name) {
		this.name = name;
	}
	
	
	// 클래스의 기능 (인스턴스 메소드)
	/**
	 * <pre>
	 * 현재 엔진의 상태에 따라 시동을 키거나 끈다
	 * 시동이 걸리면 isEngineStart 의 값이 true, 꺼지면 false가 된다
	 * 시동이 꺼지면 speed의 값은 0이된다
	 * 시동이 켜지면 speed의 값은 10이된다.
	 * </pre>
	 */
	public void pressEngineStartButton() {
		if(isEngineStart) {
			isEngineStart = false;
			speed = 0;
			System.out.println("시동을 끕니다.");
			System.out.println("현재 속도는 " + speed);
		}else {
			isEngineStart = true;
			speed = 10;
			System.out.println("시동을 킵니다.");
			System.out.println("현재 속도는 " + speed);
		}
		
	}
	
	/**
	 * <pre>
	 * 시동이 켜져 있을 때 가속 페달을 누르는 압력만큼 속도가 증가한다
	 * </pre>
	 * @param press 가속 페달을 누르는 압력의 정도
	 */
	public void pressGasolinPedal(int press) {
		if(isEngineStart) {
			speed += press;
			System.out.println("현재 속도는 " + speed);
		}
	}
	
	/**
	 * <pre>
	 * 시동이 켜져 있을 때 브레이크 페달을 누르는 압력만큼 속도가 감소한다.
	 * </pre>
	 * @param press 브레이크 페달을 누르는 압력의 정도
	 */
	public void pressBrakePedal(int press) {
		if(isEngineStart) {
			speed -= press;
			if(speed < 0) speed = 0;
			System.out.println("현재 속도는 " + speed);
		}
	}
}
