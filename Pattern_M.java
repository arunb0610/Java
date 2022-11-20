class Pattern_M
{
public static void main(String[] args)
{
Pattern_M.find_pattern_M();
}
static void find_pattern_M()
{
for(int row = 1; row<= 9; row++)
{
    for(int col = 1; col<=9; col++)
    {
    if(col == 1 || col == 9 || col == row && row<=5 || col == 10-row && row<=5)
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
