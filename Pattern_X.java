class Pattern_X
{
public static void main(String[] args)
{
Pattern_X.find_pattern_X();
}
static void find_pattern_X()
{
for(int row = 1; row<= 9; row++)
{
    for(int col = 1; col<=9; col++)
    {
    if(col == row || col == 10-row)
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
