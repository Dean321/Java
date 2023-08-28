interface A{
	void a();
	interface B{
		void b();
	}
}
interface C extends A{
	void c();
}
class D implements C{
	public void a(){System.out.println("I am A");}
	public void b(){System.out.println("I am B");}
	public void c(){System.out.println("I am C");}
	public void d(){System.out.println("I am D");}
}
class nestedInterface{
	public static void main(String args[]){
		D d = new D();
		d.a();
		d.b();
		d.c();
		d.d();
	}
}