class Reverse_Printing
{
public static void main (String[] args)
{
Reverse_Printing rp = new Reverse_Printing();
rp.findReverse();
}
void findReverse()
{
int num = 6734;
int count = 0;
while(num>0)
{
int rem = num%10;
System.out.println(rem);
count = count+1;
num = num/10;
}
System.out.println("The number of digits is : "+count);
}
}

