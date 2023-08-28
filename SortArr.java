class SortArr{
	public static void main(String args[]){
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		    a[i]=Integer.parseInt(args[i]);
		int temp;
		for(int i=0;i<5;i++){
			for(int j=i+1;j<5;j++){
				 if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
			}
		}
		System.out.println("\n \n The Sorted Array is: \n");
		for(int i=0;i<5;i++)
		    System.out.println(" "+a[i]);
	}
}