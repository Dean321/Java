class LargestNoInArray{
	public static void main(String args[]){
		int a[];
		a=new int[5];
		for(int i=0;i<5;i++)
		  a[i]=Integer.parseInt(args[i]);
		int max=a[0];
		for(int i=0;i<5;i++){
			if(max<a[i])
			   max=a[i];
		}
		System.out.println("The largest number is "+max);
	}
}