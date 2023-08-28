class callByValueDemo{  
 int data=50;  
  
 void change(int data){  
 this.data=data+100;//changes will be in the local variable only  
 }  
     
 public static void main(String args[]){  
   callByValueDemo op=new callByValueDemo();  
  
   System.out.println("before change "+op.data);  
   op.change(500);  
   System.out.println("after change "+op.data);  
  
 }  
}  