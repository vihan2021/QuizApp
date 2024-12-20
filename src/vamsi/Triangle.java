package vamsi;

import java.util.Scanner;

public class Triangle implements Shapes{
	//final double pi=3.14;
	double area2;
	double base;
	double height;
	@Override
	public void collectdata() {
		// TODO Auto-generated method stub
		Scanner se=new Scanner(System.in);
		
		System.out.println("enter base:");
		base=se.nextDouble();
		
		System.out.println("enter height:");
		height=se.nextDouble();
	
		
	}
	@Override
	public void calculate() {
	         area2=0.5*base*height;
	}
	@Override
	public void display() {
		System.out.println("Area of Triangle is:"+area2);
	}
}
