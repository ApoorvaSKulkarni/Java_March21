import java.util.*;
public class FibonacciSeries {
	public static int fib0=0,fib1=1, fibnext=0;
	
	static void fibonacciCompute(int num) {
		if(num>0) {
			fibnext = fib0 + fib1;
			fib0 = fib1;
			fib1 = fibnext;
			System.out.println(" "+fibnext);
			fibonacciCompute(num-1);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms to be printed:");
		int num = sc.nextInt();
		System.out.println("Fibonacci series: ");
		System.out.println(fib0+"\n "+fib1);
		fibonacciCompute(num-2);
	}

}
