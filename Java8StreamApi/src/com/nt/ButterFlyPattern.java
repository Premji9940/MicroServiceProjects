package com.nt;

public class ButterFlyPattern {

	public static void main(String[] args) {
		
		int n=5;
		for(int rows=1;rows<=n;rows++) {			
			for(int cols=1;cols<=2*n;cols++) {
				if(cols>rows && cols< 2*n-rows+1) {
					System.out.print(" ");
					
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();

		}
		for (int rows = 1; rows <= n; rows++) {

			for (int cols = 1; cols <= 2 * n ; cols++) {
				if (cols > n - rows  && cols < n + rows +1) {
					System.out.print(" ");

				} else {
					System.out.print("*");
				}

			}
			System.out.println();

		}
	}

}
