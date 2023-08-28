class exceptionDemo{
	public static void main(String s[]){
		int a,b;
		a=Integer.parseInt(s[0]);
		try{
			b=10/a;
			System.out.println("b = "+b);
			System.out.println("Before Catch");
		}
		catch(Exception e){
			System.out.println("Please do not enter 0");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("After catch");
	}
}	