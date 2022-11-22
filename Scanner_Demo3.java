import java.util.Scanner;

class Scanner_Demo3
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter number1 :");
int num1 = sc.nextInt();
System.out.print("Enter number2 :");
int num2 = sc.nextInt();
int total = num1 + num2;
System.out.println("Total is :"+total);
}
}
