//Print numbers between m and n in non recursive way

package Recursion;

public class NonRecursive {

	public static void printNumbers(int m,int n){
		while(m>=n)
       {
    	   System.out.print(m+" ");
    	   m--;
       }        
    }

	public static void main(String[] args) {
		System.out.println("The number in decresing order is");
		printNumbers(20,10);
	}

}
