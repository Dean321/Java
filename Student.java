class Student{
	int rno,m1,m2,m3,tot;
	String snm;
	double per;
	public void setData(int r,int s1,int s2,int s3,String s){
		rno=r;
		snm=s;
		m1=s1;
		m2=s2;
		m3=s3;
	}
	public void cal(){
		tot=m1+m2+m3;
		per=(double)tot/3;
		System.out.println(" Total = "+tot+"\n Percentage = "+per);
	}
	public static void main(String args[]){
		Student s=new Student();
		s.setData(101,45,67,89,"Alice Heigh");
		s.cal();
	}
}