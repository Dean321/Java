interface A{
	void show();
}
interface B extends A{
	void display();
}
class C implements B{
	public void show(){System.out.println("show");}
	public void display(){System.out.println("display");}
}
class intfIntFExtends{
	public static void main(String args[]){
		C c = new C();
		c.show();
		c.display();
	}
}