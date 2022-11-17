package pattern_programs;

class Pattern14
{
public static void main(String[] args)
{
Pattern14 p1 = new Pattern14();
p1.Pattern14();
}
void Pattern14()
{
for(int row = 1; row<=5; row++)
{
    for(int col=1; col<=6-row; col++)
        {
        System.out.print(" ");
        }
    for(int col = 1; col<=row; col++)
    {
    System.out.print("*"+" ");
    }
System.out.println();
}
}
}
