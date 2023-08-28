class Animal{
	public void show(){
		System.out.println("Animals have 4 limbs");
	}
}
class Dog extends Animal{
	public void show(){
		super.show();
		System.out.println("Dogs are animals too");
	}
}
class superDemo{//overridding example
	public static void main(String args[]){
		Animal d = new Dog();
		d.show();
	}
}