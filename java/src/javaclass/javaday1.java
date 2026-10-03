package javaclass;

public class javaday1 {
	
	//1.swapping two numbers using temporary variable
          
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("Before swapping");
		System.out.println("a = "+ a);
		System.out.println("b ="+ b);
		
		int temp= a;
		a = b;
		b = temp;
		
		System.out.println("After swapping");
		System.out.println("a ="+ a);
		System.out.println("b ="+ b);
		
		//2.swapping two numbers without using temporary variable
		
		    a = a + b;
	        b = a - b;
	        a = a - b;

	   //3.calculate the total and average of a student
	        
	        int tamil =70;
	        int english =90;
	        int maths =75;
	        int science =95;
	        int social =80;
	        
	     // Calculate total
	        int total = tamil + english + maths + science + social;
	        
	     // Calculate average 
	        
	        double average = total/ 5.0;
	        		
	        System.out.println("Tamil =" + tamil);
	        System.out.println("English =" + english);
	        System.out.println("Maths =" + maths);
	        System.out.println("Science =" + science);
	        System.out.println("Social =" + social);
	        
	        System.out.println("Total = " + total);
	        System.out.println("Average = " + average);
	        
	        //4.operations
	         
	        //1.ternary operation
	        
	       
	        int greater = (a > b) ? a : b;
	        
	        System.out.println("Greater number = " + greater);
	       
	        
	        
	        
	}

}
