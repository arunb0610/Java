package pattern_programs;

class Pattern5
{
public static void main(String[] args)
{
Pattern5 p2 = new Pattern5();
p2.Pattern5();
}
void Pattern5()
{
for(int row = 1; row <= 5; row++)
{
    for(int col=1; col <= 6-row; col++)
        {
        System.out.print(col*row+" ");
        }
System.out.println();
}
}
}
