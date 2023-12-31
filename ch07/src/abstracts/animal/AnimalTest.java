package abstracts.animal;

public class AnimalTest {

	public static void main(String[] args) {
		// Cat 인스턴스 생성
		//Cat cat = new Cat();
		//cat.breath();
		//cat.sound();
		
		// 다형성으로 객체 생성
		Animal cat = new Cat();
		cat.breath();
		cat.sound();
		
		Animal dog = new Dog();
		dog.breath();
		dog.sound();
		
		System.out.println("================================");
		
		// 메서드의 매개변수 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
