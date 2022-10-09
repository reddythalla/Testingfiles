package com.AutomationTesting.reusablemethod;

public class AdditionMethod {
	int a=17;
	int b=2;
	int c=a+b;


	public static void Subtraction(int a, int b) {
		int c =a+b;
		System.out.println("Addition of two numbers is::"+c);
	}
	public static void main(String[] args) {
		Subtraction(1,4);
	}
}