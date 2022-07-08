
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
	private A a = new A();
	private B b = new B();
	
	void m1() {
		this.a.validateSource();
		this.b.validateDestination();
	}
}

public class HAS_Rel {

	public static void main(String[] args) {
		
		C c= new C();
		c.m1();
		c = null;
		c.m1();
	}
}
