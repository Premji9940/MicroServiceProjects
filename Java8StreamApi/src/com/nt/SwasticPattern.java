package com.nt;

public class SwasticPattern {

	public static void main(String[] args) {

		int n = 5;

		int mid = n / 2 + 1;
		for (int rows = 1; rows <= n; rows++) {

			for (int cols = 1; cols <= n; cols++) {

				if (cols == mid || rows == mid || (rows == 1 && cols > mid) || (rows == n && cols < mid)
						|| (cols == 1 && rows < mid) || (cols == n && rows > mid))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
