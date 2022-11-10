class Spy_Number
{
public static void main(String[] args)
{
Spy_Number sn = new Spy_Number();
sn.find_spy_number(1412);
}
void find_spy_number(int num)
{
int rem = 0;
int sum = 0;
int mul = 1;
while(num>0)
{
int rem2 = num%10;
sum = sum + rem2;
mul = mul * rem2;
num = num/10;
}
if(sum == mul)
{
System.out.println("Spy Number");
}
else
{
System.out.println("Not Spy Number");
}
}
}
