class Multiples_9_And_6
{
public static void main(String[] args)
{
Multiples_9_And_6 mp = new Multiples_9_And_6();
mp.multiples_of_9_And_6();
System.out.println();
mp.usingor();
}
void multiples_of_9_And_6()
{
int num = 1;
while(num<=60)
{
if (num%9 == 0 && num%6 == 0)
    {
    System.out.print(num+"\t");
    }
num = num+1;
}
}
void usingor()
{
int num = 1;
while(num<=70)
{
if (num%9 == 0 || num%6 == 0)
    {
    System.out.print(num+"\t");
    }
num = num+1;
}
}
}
