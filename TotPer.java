class TotPer{
	public static void main(String args[]){
		String name;
		int rn,m1,m2,m3,tot;
		double per;
		name=args[0];
		rn=Integer.parseInt(args[1]);
		m1=Integer.parseInt(args[2]);
		m2=Integer.parseInt(args[3]);
		m3=Integer.parseInt(args[4]);
		tot=m1+m2+m3;
		per=(double)tot/3;
		System.out.println("Total = "+tot+"\nPercentage = "+per);
}
}
/*
---------------------------OUTPUT----------------------------------
E:\ITS Java>javac TotPer.java

E:\ITS Java>java TotPer Alice 101 67 56 87
Total = 210
Percentage = 70.0

E:\ITS Java>
*/