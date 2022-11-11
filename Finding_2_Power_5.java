package power;

public class Finding_2_Power_5
{
public static void main(String[] args)
{
Finding_2_Power_5 fp = new Finding_2_Power_5();
int result = fp.finding_power(2,5);
System.out.println(result);
}
public static int finding_power(int num , int power)
{
int total = 1;
while(power>0)
{
total = total * num;
power = power - 1;
}
return total;
}
}
