import java.util.*;
class PerfectSquare
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enetr a number : ");
        int num = sc.nextInt(), div =1 , prod = 0;
        while(prod<num)
        {
        	prod = div * div;
        	if(prod == num)
        	{
        		System.out.println("The given number is perfect square");
                System.out.println("The square is "+div);
        		break;
        	}
        	else if(prod>num)
        	{
        		System.out.println("The given number is not perfect square");
        	}
            div++;
        }
	}
}
