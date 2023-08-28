class ExceptionExamples{
	public static void main(String args[]){
		
		
		
		/*
		---------------Scenario where NumberFormatException occurs--------------- */
			String s="abc";  
			int i=Integer.parseInt(s);//NumberFormatException  
			System.out.println(""+i);
		
			//Error: Could not find or load main class ExceptionExamplescls
      
	   
		/*
		--------------Scenario where NullPointerException occurs--------------------
				String str = null;
				System.out.println(str.length());
		
					Exception in thread "main" java.lang.NullPointerException
					at ExceptionExamples.main(ExceptionExamples.java:4)
		*/
				
		/*
		-----------------Scenario where ArithmeticException occurs-------------------
			int a = 50/0;
			System.out.println("a = "+a);

			Exception in thread "main" java.lang.ArithmeticException: / by zero
			at ExceptionExamples.main(ExceptionExamples.java:3)
		*/
	}
}