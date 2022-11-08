class Armstrong
{
public static void main(String[] args)
{
Armstrong an = new Armstrong();
an.find_Armstrong_Number();
}
void find_Armstrong_Number()
{
int num = 153;
int num2 = num;
int arm = 0;
while(num>0)
{
int rem = num%10 ;
rem = rem*rem*rem;
arm =rem+arm;
num = num/10;
}
if(num2 == arm)
{
System.out.println("Armstrong number");
}
else 
{
System.out.println("Not Armstrong Number");
}
}
}


