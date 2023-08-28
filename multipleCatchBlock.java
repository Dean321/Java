class multipleCatchBlock{
	public static void main(String args[]){
		try{
			int a[]=new int[5];
			String str = null;
				System.out.println(str.length());
			a[5]=0;
			int c=50/0;
		}
		catch(ArrayIndexOutOfBoundsException e){System.out.println("ArrayIndexOutOfBound caught");}
		catch(ArithmeticException e){System.out.println("ArithmeticException caught");}
		catch(Exception e){System.out.println("Exception caught");}
		
	}
}