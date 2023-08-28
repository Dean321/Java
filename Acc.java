class Account{
	int ano;
	String name;
	double bal;
	public void setData(int n,String nm,double b){
		name=nm;
		ano=n;
		bal=b;
	}
	public void withdraw(double amt){
		System.out.println("Your Balance before withdrawal is "+bal);
		bal=bal-amt;
		System.out.println("Your Current Balance is "+bal);
	}
	public void deposit(double amt){
		System.out.println("Your Balance before deposit is "+bal);
		bal=bal+amt;
		System.out.println("Your Current Balance is "+bal);
	}
	public void show(){
		System.out.println(" Account Number = "+ano+"\n Account Name = "+name+"\n Balance = "+bal);
	}
}
class Acc{
	public static void main(String args[]){
		Account a=new Account();
		a.setData(1001023,"Alice Glein",2300000);
		a.show();
		System.out.println("\n\n\n");
		a.withdraw(60000);
		System.out.println("\n\n\n");
		a.deposit(60001);
		System.out.println("\n\n\n");
		a.show();
	}
}