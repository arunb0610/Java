class Sum_Of_Digit
{
public static void main(String[] args)
{
Sum_Of_Digit sd = new Sum_Of_Digit();
sd.digSum();
}
void digSum()
{
int num = 5067;
int sum = 0;
while(num>0 || sum>9)
{
if (num == 0)
    {
    num = sum;
    sum = 0;
    }
sum = sum+num%10;
num = num/10;
}
System.out.println(sum);
}
}
