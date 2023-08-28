class A{
	void d(){System.out.println("A here");}
}
class B extends A{
	void d(){System.out.println("A here");}
}
class instanceoffDemo{
	public static void main(String f[]){
		A a= new A();
		A aa=new B();
		B b=new B();
		B bb=null;
		System.out.println(bb instanceof B);
	}
}