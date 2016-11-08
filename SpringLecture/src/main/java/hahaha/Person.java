package hahaha;

public class Person {

	// 1. 변수 => field (C++에서는 member variable. JS에서는 property)
	// 2. 함수 => method
	// 3. 생성자 => 만들어진 instance를 초기화 시켜주는 역할
	private int age;	// 객체지향 개념 중 information hiding(정보은닉)이라는 개념을 
						// java언어에서 access modifier인 private으로 구현.
						// 단, 외부에서 해당 field를 제어하기 위해 getter or setter를 구현.
	
	public Person() {
		// default 생성자
	}
	
	// business logic을 처리하기 위한 method
	public void printAge(){
		
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
		
	
}
