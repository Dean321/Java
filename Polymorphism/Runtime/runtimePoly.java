class Bank{
	int getROI(){return 0;}
}
class SBI extends Bank{
	int getROI(){return 8;}
}
class ICICI extends Bank{
	int getROI(){return 7;}
}
class AXIS extends Bank{
	int getROI(){return 9;}
}
class runtimePoly{
	public static void main(String args[]){
		Bank b1=new SBI();
		Bank b2=new ICICI();
		Bank b3=new AXIS();
		System.out.println("SBI ROI is "+b1.getROI()+"\n ICICI ROI is "+b2.getROI()+"\n AXIS ROI is "+b3.getROI());

		}
}