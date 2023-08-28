class exceptionHandlingExample{
	public static void main(String args[]){
		try{
			int a=50/0;
		}
		catch(Exception e){
			System.out.println("Exception Caught");
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("Remaining Code");

	}
}