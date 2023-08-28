class employee{
	protected int empno;
	protected String empnm;
	protected double salary;
	public employee(int eno,String enm,double sal){
		System.out.println("\n\n Default Constructor Called\n\n");
		empno=eno;
		empnm=enm;
		salary=sal;
	}
	public employee(){System.out.println("\n\n Default Constructor Called\n\n");}
	public void show(){
		System.out.println("Employee Details:\nID = "+empno+"\nName = "+empnm+"\nSalary = "+salary);
	}
}
class manager extends employee{
	double bonus;
	public manager(String nm,int id,double s,double b){
		super(id,nm,s);
		bonus=b;
	}
	public void display(){
		show();
		System.out.println("Bonus = "+bonus);
	}
}
class inheritEmp{
	public static void main(String args[]){
		manager m = new manager("Jamie Foxx",101,35000,4000);
	    m.display();
	}
}