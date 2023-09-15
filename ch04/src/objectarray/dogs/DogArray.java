package objectarray.dogs;

public class DogArray {

	public static void main(String[] args) {
		// Dog 인스턴스 4개 생성 -> 배열에 저장
		Dog[] cage = new Dog[4];
		
		// 배열에 저장
		cage[0] = new Dog("백구", "진돗개");
		cage[1] = new Dog("황구", "시고르자브종");
		cage[2] = new Dog("발발이", "삽살개");
		cage[3] = new Dog("쉬바", "시바견");
		
		// 정보 출력
		for(int i = 0; i < cage.length; i++) {
	
			/*System.out.println("이름 : " + cage[i].getName());
			System.out.println("종 : " + cage[i].getType());
			
			System.out.println("=============================");*/
			
			System.out.println("이름 : " + cage[i].getName() + " / 견종 : " + cage[i].getType());
			
		}
		
		System.out.println("==================================");
		
		// 향상된 for문
		for(Dog dog : cage) {
			System.out.println(dog.getName() + ", " + dog.getType());
		}
		

	}

}
