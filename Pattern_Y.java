class Pattern_Y
{
public static void main(String[] args)
{
Pattern_Y.find_pattern_Y();
}
static void find_pattern_Y()
{
for(int row = 1; row<= 9; row++)
{
    for(int col = 1; col<=9; col++)
    {
    if(col == row && row<=5 || col == 10-row)
    {
    System.out.print("* ");
    }
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
