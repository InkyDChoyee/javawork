package polymorphism.animals;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}
class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다");
	}
}
class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 날개로 날아갑니다");
	}
}
class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 달려갑니다");
	}
}

public class AnimalTest {
	
	// moveAnimal() 정의 - 매개변수의 다형성
	public void moveAnimal(Animal animal) { // 매개변수가 부모의 타입이기 때문에 그 안에 자식의 변수를 대입할 수 있다
		animal.move();
	}

	public static void main(String[] args) {
		// AnimalTest객체 생성
		AnimalTest aTest = new AnimalTest();
		
		// Animal 타입으로 객체 생성 = 다형성 사용O
		Animal human = new Human();
		Animal eagle = new Eagle();
		Animal tiger = new Tiger();
		
		//aTest.moveAnimal(new Human());
		//aTest.moveAnimal(new Eagle());
		//aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(human);
		aTest.moveAnimal(eagle);
		aTest.moveAnimal(tiger);
	}

}
