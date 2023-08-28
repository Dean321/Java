import java.io.IOException;
class throwsDemo{
	void m()throws IOException{
		throw new IOException("Device Error");//Checked Exception
	}
	void n()throws IOException{
		m();
	}
	void p(){
		try{
			n();
		}catch(Exception e){System.out.println("Exception Handled");}
	}
	public static void main(String a[]){
		throwsDemo obj=new throwsDemo();
		obj.p();
		System.out.println("Normal Flow");
	}
}