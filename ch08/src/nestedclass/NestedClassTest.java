package nestedclass;

class A{

	A(){System.out.println("A 객체 생성");}
	// 내부 멤버 클래스
	class B{
		int field1;
		// static int field2; => 내부클래스에서는 정적 static 변수 생성X
		B(){System.out.println("B 객체 생성");}

		void method1() {
		}
	}
	// 내부 정적 멤버 클래스
	static class C{
		int field1;
		static int field2;

		C(){System.out.println("C 객체 생성");}

		void method1() {}
		static void method2() {}
	}
	// 메서드 내부 로컬 클래스 사용
	void method() {
		class D{
			int field1;
			//static int field2;
			D(){System.out.println("D 객체 생성");	}
			void method1() {};
		}
		// d 객체 생성
		D d = new D();
		d.field1 = 10;
		d.method1();
	}
}

public class NestedClassTest {

	public static void main(String[] args) {
		// a 객체 생성
		A a = new A();

		// b 객체 생성
		A.B b = a.new B();

		b.field1 = 3;
		b.method1();
		
		// c 객체 생성
		// static이 있으면 A.C로 접근
		A.C c = new A.C();  // -> static때문에 A 클래스에 직접 접근
		c.field1 = 2;
		A.C.field2 = 3;
		A.C.method2();
		
		// D 클래스 호출
		a.method();
	}
}

