class Animal{
	void eat(){System.out.println("Animal is eating");}
}
class Dog extends Animal{
	void eat(){System.out.println("Dog is eating fruits");}
}
class multilevelInherit1 extends Dog{
	public static void main(String args[]){
		Animal a = new multilevelInherit1();
		a.eat();
	}
}