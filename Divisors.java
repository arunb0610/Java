class Divisors
{
public static void main(String[] args)
{
Divisors ds = new Divisors();
ds.find_divisors();
}
void find_divisors()
{
int num = 34;
int div = 1;
int count = 0;
while(div<=34)
{
if(num%div == 0)
{
System.out.println(div);
count = count+1;
}
div = div+1;
}
System.out.println("The number of divisors are : "+count);
}
}

