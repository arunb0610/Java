import power.Finding_2_Power_5;

class Decimal_Number // Converting binary number into decimal number
{
public static void main(String[] args)
{
Decimal_Number.find_decimal(11010);
}
static void find_decimal(int binary)
{
int i = 0;
int decimal = 0;
while(binary>0)
{
int rem = binary%10 ;
if(rem == 1)
{
decimal += Finding_2_Power_5.finding_power(2,i);//Using recursion
}
i++;
binary = binary/10;
}
System.out.println("The Decimal number for given binary is "+decimal);
}
}
