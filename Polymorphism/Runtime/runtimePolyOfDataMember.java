class A{
	int n=90;
}
class B extends A{
	int n=120;
}
class runtimePolyOfDataMember{
	public static void main(String args[]){
		A a=new B();
		System.out.println(a.n);
	}
}
