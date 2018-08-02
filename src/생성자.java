
/*
생성자(Construnctor) 특징
생성자의 이름은 클래스의 이름과 같아야 한다는 약속
생성자는 리턴값 X
생성자는 오버로딩이 가능해 하나의 클래스에 여러 개의 생성자가 존재할 수 있음
오버로딩(Overloading): 같은 이름의 메소드를 여러 개 가지면서 매개변수의 유형과 개수가 다르도록 하는 기술
생성자도 메소드이므로 리턴값이 없다면 void를 적어야 하지만, 모든 생성자가 리턴값이 없으므로 void 생략

작업 시작 전 책상 치우기 등 어떤 일을 시작하기 전에 준비를 하게 되는 행위를 초기화라고 함
이런 초기화에 해당하는 기능을 생성자가 제공
*/		

class Calculator {
	int left, right;

	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class 생성자 {

	public static void main(String[] args) {

		Calculator c1 = new Calculator(10, 20);
		c1.sum();
		c1.avg();

		Calculator c2 = new Calculator(20, 40);
		c2.sum();
		c2.avg();
	}

}