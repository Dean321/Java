class finalPara{
	void display(int id,String name,final float sal){
		System.out.println(id+" held by "+name+" earns "+sal+" in a month");
	}
	public static void main(String args[]){
		new finalPara().display(101,"Rachel Green",35000);
		new finalPara().display(101,"Ross Geller",45000);
	}
}