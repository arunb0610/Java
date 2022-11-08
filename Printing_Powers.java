class Printing_Powers
{
public static void main(String[] args)
{
Printing_powers pp = new Printing_powers();
pp.find_powers();
}
void find_powers()
{
int num = 4;
while(num>1)
{int power = num;
int num2 = num;
while(power>1)
{
num2 = num * num2;
power = power - 1;
}
num = num - 1;
System.out.println(num2);
}
}
}
