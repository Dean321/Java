public class throwDemo{
	static void validate(int age){
		if(age<18)
			throw new ArithmeticException("Not valid");
		else
			System.out.println("Welcome to Voting booth");
	}
	public static void main(String a[]){
		validate(13);
		System.out.println("rest of the code...");
	}
}