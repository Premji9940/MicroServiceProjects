package com.nt;

public class DiamondPattern {

	public static void main(String[] args) {
		int n=5;
		
		
		for(int rows=1;rows<=n;rows++) {				
			
			for(int spaces=1;spaces<n-rows+1;spaces++) {
				System.out.print(" ");
			}
			for(int cols=1;cols<=2*rows-1;cols++) {
				System.out.print("*");
				
			}
			System.out.println();

		}
	for(int rows=1;rows<=n;rows++) {				
			
			for(int spaces=1;spaces<=rows;spaces++) {
				System.out.print(" ");
			}
			for(int cols=1;cols<=2*n-2*rows-1;cols++) {
				System.out.print("*");
				
			}
			System.out.println();

		}

	}

}
