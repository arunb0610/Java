class Swapping_Number2 //Without using third variable
{
public static void main(String[] args)
{
Swapping_Number2.swap();
}
static void swap()
{
int num1 = 67 , num2 = 56 ;
num1 = num1 + num2;
num2 = num1 - num2;
num1 = num1 - num2;
System.out.println("num1 = "+num1);
System.out.println("num2 = "+num2);
}
}
