class unboxingDemo{
	public static void main(String args[]){
		Integer a=new Integer(3);
		int i=a.intValue();
		int j=a;
		System.out.println("a = "+a+" i = "+i+" j = "+j);
	}
}