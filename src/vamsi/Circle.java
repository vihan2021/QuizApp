package vamsi;

import java.util.Scanner;

public class Circle implements Shapes{
    double pi=3.14;
	double area;
	double r;
	@Override
	public void collectdata() {
		Scanner se=new Scanner(System.in);
		
		System.out.println("enter radius:");
		r=se.nextDouble();
	}
	@Override
	public void calculate() {
		area=pi*r*r;
		
	}
	@Override
	public void display() {
		System.out.println("Area of circle is:"+area);
	
	}

}
