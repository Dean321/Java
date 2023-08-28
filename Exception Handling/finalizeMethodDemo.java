class finalizeMethodDemo{
	public void finalize(){System.out.println("Finalize called");}
	public static void main(String a[]){
		finalizeMethodDemo f1 = new finalizeMethodDemo();
		finalizeMethodDemo f2 = new finalizeMethodDemo();
		f1=null;
		f2=null;
		System.gc();
		
	}
}