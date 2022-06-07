package com.cg.ExceptionHandelers;

public class ExceptionHandling {
	
		
		public static void main(String[] args) {
			ExceptionHandling obj = new ExceptionHandling();
			
			try {
				obj.math();
			}catch(ArithmeticException e) {
				System.out.println("Expection in main class "+e);
			}
			System.out.println("Outside ");
		}
		
		public void math() {
			try {
				System.out.println(100/0);
			}catch(NullPointerException e) {
				System.out.println("We have a expection "+e);
			}System.out.println("Outside try-catch block");
		}

	}