interface B{
	void show();
}
interface C{
	void display();
}
class A implements B,C{
	public void show(){System.out.print("Hello ");}
	public void display(){System.out.print("World");}
}
class interfaceDemoWithMultipleInheritance{
	public static void main(String args[]){
		A a = new A();
		a.show();
		a.display();
	}
}