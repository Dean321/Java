class emp{
	int eno;
	double es;
	String enm;
	public emp(){
		System.out.println("Default Constructor Called");
		System.out.println("Employee Details:\nID = "+eno+"\nName = "+enm+"\nSalary = "+es);
	}
	public emp(String enm,int eno,double es){
		System.out.println("Parameterized Constructor Called");
		this.eno=eno;
		this.es=es;
		this.enm=enm;
	}
	public void show(){
		System.out.println("Employee Details:\nID = "+eno+"\nName = "+enm+"\nSalary = "+es);
	}
}
class overloading{
	public static void main(String args[]){
		emp e=new emp("Jamie Foxx",101,350000);
		e.show();
		emp e1=new emp();
	}

}