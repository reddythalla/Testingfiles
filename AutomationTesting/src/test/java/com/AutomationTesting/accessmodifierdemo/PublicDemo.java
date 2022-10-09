package com.AutomationTesting.accessmodifierdemo;

public class PublicDemo {
public void Addition()
{
	int a=10;
	int b=23;
	int c = a+b;
	System.out.println("Addition of two numbers is ::"+c);
}
public static void main(String[] args) {
	PublicDemo ss= new  PublicDemo();
	ss.Addition();
}
}
