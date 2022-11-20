class Pattern_N
{
public static void main(String[] args)
{
Pattern_N.find_pattern_N();
}
static void find_pattern_N()
{
for(int row = 1; row<= 7; row++)
{
    for(int col = 1; col<=7; col++)
    {
    if(col == 1 || col == 7 || col == row)
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
