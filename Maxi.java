class Maxi{
  public static void main(String args[]){
	int a,b,max;
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	max=(a>b)?a:b;
	System.out.println("Maximum number between "+a+" & "+b+" is "+max);
}
}

/*
--------------------------OUTPUT-----------------------------------
E:\ITS Java>javac Maxi.java

E:\ITS Java>java Maxi 34 78
Maximum number between 34 & 78 is 78

E:\ITS Java>
*/