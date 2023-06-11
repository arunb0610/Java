import java.util.*;
class FibonacciSeries
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a count : ");
		int count = sc.nextInt(), num = 1, fibo = 0;
		System.out.println(num);
		while(count>1)
		{
			int sum = num + fibo;
			System.out.println(sum);
			fibo = num;
			num = sum;
			count--;
		}
	}
}
