abstract class shape{
	abstract void draw();
}
class circle extends shape{
	void draw(){System.out.println("Drawing a Circle");}
}
class rectangle extends shape{
	void draw(){System.out.println("Drawing a Rectangle");}
}
class exampleAbstractClass{
	public static void main(String args[]){
		shape c = new circle();
		System.out.println("\nRunning shape c = new circle()\n\n");
		c.draw();
		
		shape r = new rectangle();
		System.out.println("\nRunning shape r = new rectangle()\n\n");
		r.draw();
		
		circle cr = new circle();
		System.out.println("\nRunning circle cr = new circle()\n\n");
		cr.draw();

		rectangle re = new rectangle();
		System.out.println("\nRunning rectangle re = new rectangle()\n\n");
		re.draw();
		}
}