class finalVar{
	String name;
	final int eid;
	public finalVar(String n,int e){
		name=n;
		eid=e;
	}
	public void display(){
		System.out.println(" EID = "+eid+" is held by "+name);
	}
}
class finalVarDemo{
	public static void main(String args[]){
		new finalVar("Alice Jenkkins",100110).display();
		new finalVar("James Franco",100134).display();
		finalVar obj1=new finalVar("Hugh Jackman",101010);
		obj1.display();
		obj1=new finalVar("Claire Dunffy",1213421);
		obj1.display();
	}
}