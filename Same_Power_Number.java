class Same_Power_Number
{
public static void main(String[] args)
{
Same_Power_Number cn = new Same_Power_Number();
cn.power_number();
}
void power_number()
{
int num = 1;
int num2 = 1;
while(num<=4)
{
int power = num*2;
System.out.println(power);
num = num+1;
num2=num2+1;
}
}
}
