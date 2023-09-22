package funcinterface;

// 함수형 인터페이스를 사용하려는 이유 - 익명 함수를 사용
// 함수형 인터페이스에서는 추상 메서드가 한개 밖에 사용할 수 없음
@FunctionalInterface  // => 처음부터 2개를 쓸 수 없도록 방지해줌
public interface MyFunction1 {
	
	public void method();
	//public void method2();  => 불가

}
