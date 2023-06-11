import java.util.*;
class FactorialNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt(), prod = 1;
		while(num>0)
		{
			prod *= num;
			num--;
		}
		System.out.println("The factorial of the given number is "+prod);
	}
}
