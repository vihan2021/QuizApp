package vamsi;
interface Calculator1{
	int a=10;//constant//rule no 9
	void add();//abstract method //rule9

	void sub();//abstract method //rule9
}
//interface Calculator2 implements Calculator1{}//error rule no 7
interface Calculator3 extends Calculator1{//rule no 8
	//int a=10;//can be accessed here also
	//void add();//available from calculator1
	//void sub();available from calculator1
	void mul();//abstract method //rule9

	void div();//abstract method //rule9
	
}
interface Calculator4{
	void add1();
	void sub2();
}
class SampleCode1 implements Calculator1{
	@Override
	public void add() {
		System.out.println("inside add method of SampleCode1");
	}
	@Override
	public void sub() {
		System.out.println("inside add method of SampleCode1");
	}
	}
	class SampleCode2 implements Calculator1{
		@Override
		public void add() {
			System.out.println("inside add method of SampleCode2");
		}
		@Override
		public void sub() {
			System.out.println("inside add method of SampleCode2");
		}
	}
	
	class SampleCode3 implements Calculator1,Calculator3{
		@Override
		public void add() {
			System.out.println("inside add method of SampleCode3");
		}
		@Override
		public void sub() {
			System.out.println("inside add method of SampleCode3");
		}
		@Override
		public void mul() {
			System.out.println("inside add method of SampleCode3");
		}
		@Override
		public void div() {
			System.out.println("inside add method of SampleCode3");
		}
	}
	interface Calculator5{
	}
	class SampleCode4{
		void display() {
			System.out.println("inside display method");
		
		}
	}
	class SampleCode5 extends SampleCode4 implements Calculator1{
		@Override
		public void add() {
			System.out.println("inside add method of SampleCode3");
		}
		@Override
		public void sub() {
			System.out.println("inside add method of SampleCode3");
		}
		
	}
	interface Calculator6{
		void addition();
		void substraction();//rule no 4
		default void multip()
		{
			System.out.println("inside the mul method in Calculator6");
			
		}
        static void division()
		{
			System.out.println("inside the div method in Calculator6");
		}
	}
	abstract class SampleCode6 implements Calculator6{
		@Override
        public void addition()
		{
			System.out.println("inside the addition method in SampleCode6");
		}
	}
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //Calculator1 c1=new Calculator1();
		Calculator1 c2;
		Calculator1 c3=new Calculator1() {
			@Override
			public void add() {
				System.out.println("inside add method of calculator1");
			}
			@Override
			public void sub() {
				System.out.println("inside sub method of calculator");
			}
			
	};
	}
}

