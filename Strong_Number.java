class Strong_Number
{
public static void main(String[] args)
{
Strong_Number sn = new Strong_Number();
sn.find_strong_number();
}
void find_strong_number()
{
int num = 145;
int num2 = num;
int total = 0;
while(num>=1)
{
int fact = 1;
int num3 = 1;
int rev = num%10;
while(num3<=rev)
{
fact = fact*num3;
num3 = num3+1;
}
total = total+fact;
num = num/10;
}
if(total == num2)
{
System.out.println("It is a Strong Number");
}
else
System.out.println("It is not a Strong Number");
}
}
