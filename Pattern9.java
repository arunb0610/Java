package pattern_programs;

class Pattern9
{
public static void main(String[] args)
{
Pattern9 p2 = new Pattern9();
p2.Pattern9();
}
void Pattern9()
{
for(int row = 1; row <= 5; row++)
{
    for(int col=1; col <= 6-row; col++)
        {
        System.out.print(col+" ");
        }
    for(int col = 1; col<=row; col++)
    {
    System.out.print(col+" ");
    }
System.out.println();
}
}
}
