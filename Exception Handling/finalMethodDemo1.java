class finalMethod{
	final void run(String s){System.out.println("Running Final Method");}
}
class finalMethodDemo1 extends finalMethod{
	public static void main(String args[]){
		new finalMethod().run("Alice");
	}
}