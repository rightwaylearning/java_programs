package Compositions;

public class A {
	private C c;
	private B b;

	public A(C c, B b) {
		this.c = c;
		this.b = b;
	}

	public A() {}

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public void m3() {
		c.m1();
		b.m2();
	}
}
