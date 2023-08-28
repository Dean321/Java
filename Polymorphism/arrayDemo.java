class arrayDemo{
	public static void main(String args[]){
		int[] a=new int[5];
		int []b=new int[5];
		int c[]={1,2,3,4,5};
		for(int i=0;i<5;i++){
			a[i]=i+1;
			b[i]=c[i];
		}
		for(int i=0;i<5;i++){
		System.out.println("a["+i+"]="+a[i]+" b["+i+"]="+b[i]+" c["+i+"]="+c[i]);
		}
	}
}