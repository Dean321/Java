public class autoboxingDemo{
	public static void main(String args[]){
		int a=20;
		Integer i=Integer.valueOf(a);
		Integer j=a;
		System.out.println("a = "+a+" i = "+i+" j = "+j);
	}
}