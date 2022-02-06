package com.sapient;

import java.util.Scanner;

public class ComplexCaluculator {
 
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		 System.out.println("enter value1 ");
		 double value1=input.nextDouble();
		 
		 System.out.println("enter value2 ");
		 double value2=input.nextDouble();
		 
		 System.out.println("enter operator symbol ");
		 char op=input.next().charAt(0);
		 
		 switch(op) {
		 case'+':
			 System.out.println("addition "+ (value1+value2));
		     break;
		 case'-':
			 System.out.println("subtraction "+ (value1-value2));
		     break;
		 case'*':
			 System.out.println("multiplication "+ (value1*value2));
		     break;
		 case'/':
			 System.out.println("division "+ (value1/value2));
		     break;
		 default:
			 System.out.println("invalid operator ");
		     break;
		 }
		 
		 input.close();
	}
}
