package pattern_programs;

class Pattern8
{
public static void main(String[] args)
{
Pattern8 p2 = new Pattern8();
p2.Pattern8();
}
void Pattern8()
{
for(int row = 1; row <= 5; row++)
{
    for(int col=1; col <= 6-row; col++)
        {
        System.out.print(col+" ");
        }
    for(int col = 1; col<=row; col++)
    {
    System.out.print(1+" ");
    }
System.out.println();
}
}
}
