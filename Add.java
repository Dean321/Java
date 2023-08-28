public class Add {
public static void main(String args[]){
	int a,b,sum;
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	sum=a+b;
	System.out.println("Sum of "+a+" + "+b+" is "+sum);

}
}
/*
------------------------OUTPUT--------------------------------
E:\ITS Java>javac Add.java

E:\ITS Java>java Add 1 5
Sum of 1 + 5 is 6

E:\ITS Java>

*/