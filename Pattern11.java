package pattern_programs;

class Pattern11
{
public static void main(String[] args)
{
Pattern11 p2 = new Pattern11();
p2.Pattern11();
}
void Pattern11()
{
for(int row = 1; row <= 5; row++)
{
    for(int col=1; col <= 6-row; col++)
        {
        System.out.print(" "+" ");
        }
    for(int col = 1; col<=row; col++)
    {
    System.out.print(col+" ");
    }
System.out.println();
}
}
}
