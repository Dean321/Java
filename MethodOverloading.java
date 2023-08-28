class Sum{
	public void add(int a,int b){
		int ans=a+b;
		System.out.println(a+" + "+b+" = "+ans);
	}
	public void add(int a,int b,int c){
		int ans=a+b+c;
		System.out.println(a+" + "+b+" + "+c+" = "+ans);
	}
	public void add(double a,int b){
		double ans=a+b;
		System.out.println(a+" + "+b+" = "+ans);
	}
	public void add(int b,double a){
		int ans=(int)a+b;
		System.out.println(a+" + "+b+" = "+ans);
	}	
}
class MethodOverloading{
	public static void main(String args[]){
		Sum s = new Sum();
		s.add(1,2);
		s.add(1,2,3);
		s.add(1.2,4);
		s.add(4,1.2);
	}
}