class Binary_Number //Converting decimal number into binary number
{
public static void main(String[] args)
{
Binary_Number.find_binary(18);
}
static void find_binary(int decimal)
{
String binary = "" ;
while(decimal>0)
{
int rem = decimal % 2 ;
binary = rem + binary ;
decimal /= 2 ;
}
System.out.println("The Binary for the given decimal is "+binary);
}
}
