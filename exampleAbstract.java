abstract class TellMe{
	abstract void name();
}
class exampleAbstract extends TellMe{
	void name(){System.out.println("Hello Myself");}
	public static void main(String args[]){
		exampleAbstract t = new exampleAbstract();
		t.name();
		
	}
}