package com.nt;

public class ButterflyPattern1 {
	public static void main(String[] args) {
		int n=5;
		for(int rows=1;rows<=n;rows++) {			
			for(int cols=1;cols<=2*n-1;cols++) {
				if(cols>rows && cols< 2*n-rows) {
					System.out.print(" ");
					
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();

		}
		for(int rows=1;rows<=n;rows++) {			
			for(int cols=1;cols<=2*n-1;cols++) {
				if(cols>n-rows && cols< 2*n-n+rows) {
					System.out.print(" ");
					
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();

		}
	}

}
