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
while(num<=10)
{
int power = num*num;
int total = power + num;
System.out.println(total);
num = num+1;
}
}
}
