class Prime_Number
{
public static void main(String[] args)
{
Prime_Number pn = new Prime_Number();
pn.find_primeNumber();
}
void find_primeNumber()
{
int num = 20;
int div = 1;
int count = 0;
while(div <= num)
{
if(num%div==0)
    {
    count = count +1;
    }
div = div+1;
}
if(count==2)
{
System.out.println("Prime Number"+num);
}
else
{
System.out.println("Not Prime Number");
}
}
}


