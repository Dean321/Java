class factorial{
public static void main(String args[]){
	int n,fact=1;
        n=Integer.parseInt(args[0]);
	for(int i=1;i<=n;i++)
	   fact=fact*i;
	System.out.println("Factorial of "+n+" is "+fact);
}
}
/*
-------------------------------OUTPUT---------------------------
E:\ITS Java>javac factorial.java

E:\ITS Java>java factorial 5
Factorial of 5 is 120

E:\ITS Java>
*/