class Pattern_W
{
public static void main(String[] args)
{
Pattern_W.find_pattern_W();
}
static void find_pattern_W()
{
for(int row = 1; row<= 9; row++)
{
    for(int col = 1; col<=9; col++)
    {
    if(col == 1 || col == 9 || col == row && row>=5 || col == 10-row && row>=5)
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
