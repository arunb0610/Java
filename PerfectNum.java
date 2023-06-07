import java.util.*;
class PerfectNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enetr a number : ");
		int num = sc.nextInt(), div = 1, sum = 0;
		while(div<num)
		{
			if(num%div == 0)
			{
				sum = sum + div;
			}
			div++;
		}
		if(sum == num)
		{
			System.out.println("The given number is Perfect Number");
		}
		else
		{
			System.out.println("The given number is not Perfect Number");
		}
	}
}
