package com.nt;

class A{
	public static final double PI=3.14;	
	class B{		
		public Double getPI() {
			return PI;
		}
		
		public static void get() {
		System.out.println("A.B.get()");
		}
	}
	
	
}

public class InnerClasses {

	public static void main(String[] args) {
	A.B a=new A().new B();
	a.getPI();
	a.get();

	}

}
