class Sum_Of_Digits
{
public static void main(String[] args)
{
Sum_Of_Digits sd = new Sum_Of_Digits();
sd.find_sum_of_digits();
}
void find_sum_of_digits()
{
int num = 8976;
int rem2 = 0;
while(num>0)
{
int rem1 = num%10;
rem2 = rem2 + rem1;
num = num/10;
}
System.out.println(rem2);
}
}
