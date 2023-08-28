interface first{
	void show();
}
interface second extends first{
	void add();
}
class third implements second{
	public void show(){
		System.out.println("Show method");
	}
	public void add(){
		System.out.println("2 + 3 ="+(2+3));
	}
}
class interfaceITSDemo{
	public static void main(String args[]){
		third t = new third();
		t.show();
		t.add();
	}
}