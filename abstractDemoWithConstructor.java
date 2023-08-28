abstract class Automobile{
	Automobile(){
		System.out.println("Automobile Object is Created");
	}
	abstract void type();
	abstract int wheels();
}
class Bike extends Automobile{
	void type(){
		System.out.println("Its a Bike");
	}
	int wheels(){
		return 2;
	}
}
class abstractDemoWithConstructor{
	public static void main(String args[]){
		Bike b = new Bike();
		b.type();
		int w;
		System.out.println(" No. of wheels = "+b.wheels());
	}
}