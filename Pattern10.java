package pattern_programs;

class Pattern10
{
public static void main(String[] args)
{
Pattern10 p2 = new Pattern10();
p2.Pattern10();
}
void Pattern10()
{
for(int row = 1; row <= 5; row++)
{
    for(int col=1; col <= 6-row; col++)
        {
        System.out.print(" "+" ");
        }
    for(int col = 1; col<=row; col++)
    {
    System.out.print(1+" ");
    }
System.out.println();
}
}
}
