package sef.module8.activity;
//Needs to be completed
//1 - Find out the error in this program and share your finding with the instructor
public class ExceptionSequenceActivity {
	
public static void main(String[] args) {
	new ExceptionSequenceActivity().divide(15,6);
}

void divide(double num1,double num2)
{
	try{
		
	System.out.println(num1/num2);	
	
	} catch(ArithmeticException a){
		
		System.out.println("Division by zero is not allowed");
	
	}catch(Exception e) {
	
		System.out.println("Exception!!!");
	}
	
}
}
