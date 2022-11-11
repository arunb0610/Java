class Swapping_Number //Using third variable
{
public static void main(String[] args)
{
Swapping_Number.swap();
}
static void swap()
{
int num1 = 32 , num2 = 45;
int temp = num1;
{
num1 = num2;
num2 = temp;
System.out.println("num1 = "+num1);
System.out.println("num2 = "+num2);
}
}
}
