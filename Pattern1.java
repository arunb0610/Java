package pattern_programs;

class Pattern1
{
public static void main(String[] args)
{
Pattern1 p1 = new Pattern1();
p1.pattern1();
}
void pattern1()
{
for(int row = 1; row<=5; row++)
{
    for(int col=1; col<=6-row; col++)
        {
        System.out.print(" ");
        }
    for(int col = 1; col<=row; col++)
    {
    System.out.print(1+" ");
    }
System.out.println();
}
}
}
