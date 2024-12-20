package vamsi;

import java.util.Scanner;

class Rectangle implements Shapes{
	//final double pi=3.14;
	double area1;
	double length;
	double bredth;
	@Override
	public void collectdata() {
		Scanner se=new Scanner(System.in);
		System.out.println("enter bredth:");
		 length=se.nextDouble();
	   
		System.out.println("enter length:");
		bredth=se.nextDouble();
	}
     @Override
    public void calculate() {
	   area1=length*bredth;
     }
	
	public void display() {
		System.out.println("Area of Rectangle is:"+area1);
	}
}

