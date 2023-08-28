class A{
	void run(){System.out.println("A is running");}
}
class B extends A{
	void run(){System.out.println("B is running");}
}
class runtimePolyUpcast{
	public static void main(String ar[]){
		A a= new B();
		a.run();
	}
}