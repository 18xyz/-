
public class String_정리 {

	public static void main(String[] args) {
			String str = "문자열";
//			자바는 문자열을 String 변수에 저장
//			String 변수에 문자열을 저장하려면 리터럴 대입
//			문자열이 직접 변수에 저장X, 문자열은 String 객체로 생성, 변수는 String 객체를 참조
			
			String animal1 = "Cat";
			String animal2 = "Cat";
//			문자열 리터럴이 동일값이면 갖은 String 객체 공유

			animal1 = new String("Cat");
			animal2 = new String("Cat");
			
//			new 연산자를 사용해 String 객체 생성
//			new 연산자는 (연산자는 힙 영역에 새로운 객체를 만들 때 사용하는 연산자) 객체 생성 연산자
//			new 연산자는 객체 생성 후 생성된 번지를 리턴하는 역할

	}

}
