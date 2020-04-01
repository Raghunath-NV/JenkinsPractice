//Print numbers between m and n in recursive way

package Recursion;

public class Recursive {

	public static void recursive(int m, int n) {
		if (m <= n)
			return;
		System.out.print(m + " ");
		recursive(m - 1, n);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The number in decreasing order is : ");
		recursive(20, 10);
	}

}
