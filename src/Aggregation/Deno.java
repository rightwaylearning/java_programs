package Aggregation;

class A{
	void validateSource(){
		System.out.println("I am A class");
	}
}

class B{
	void validateDestination(){
		System.out.println("I am B class");
	}
}

class C{
	private A a;
	private B b;
	
	C(A a, B b){
		this.a =a;
		this.b =b;
	}
	
	void m1() {
		this.a.validateSource();
		this.b.validateDestination();
	}
}


public class Deno {

	public static void main(String[] args) {
		
		A a = new A();
		B b= new B();
		C c= new C(a,b);
		c.m1();
		c =null;
	}
}
