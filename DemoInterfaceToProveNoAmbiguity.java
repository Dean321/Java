interface A{
	void print();
}
interface B{
	void print();
}
class C implements A,B{
	public void print(){System.out.println("Printing");}
}
class DemoInterfaceToProveNoAmbiguity{
	public static void main(String args[]){
		C c = new C();
	    c.print();
	}
}
