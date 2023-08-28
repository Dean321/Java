class finallyBlockDemo{
	public static void main(String args[]){
		try{
			int x=300;
			System.out.println("x = "+x);
		}catch(Exception e){System.out.println(e);}
		finally{System.out.println("Finally Block is Executed");}
	}
}