package hahaha;

public class Main {

	public static void main(String[] args) {
		
		// IS-A 관계(is-a relationship)
		// 정의: subclass is a superclass.(o)
		// 역관계는 성립하지 않는다. superclass is a subclass.(x)
		// subclass의 type을 superclass의 type으로 쓸 수 있다.
		// 다형성: 하나의 객체를 다른 여러가지 형태로 사용할 수 있는 것.
	
		Student a = new Student();
		Person b = new Person();
		
		Student s = (Student) new Person();
		Person p = new Student();
		Student stu = (Student) new Object();
		
		
	}

}
