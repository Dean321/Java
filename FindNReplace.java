import java.util.Scanner;
class FindNReplace{
	public static void main(String args[]){
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		    a[i]=Integer.parseInt(args[i]);
		Scanner sc=new Scanner(System.in);
		int f,r;
		System.out.println("Enter the number to be found: ");f=sc.nextInt();
		System.out.println("Enter the number to be replaced with: ");r=sc.nextInt();
		for(int i=0;i<5;i++){
			if(a[i]==f)
				a[i]=r;
		}
		for(int i=0;i<5;i++)
		    System.out.println(" "+a[i]);
	}
}