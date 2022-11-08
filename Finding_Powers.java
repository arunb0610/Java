class Finding_Powers
{
public static void main(String[] args)
{
Finding_Powers fp = new Finding_Powers();
fp.finding_powers();
}
void finding_powers()
{
int num = 4;
while(num>=1)
{
int power = num;
int num2 = num;
while(power>1)
{
num2 = num * num2;
power = power-1;
}
System.out.println(num2);
num = num-1;
}
}
}
