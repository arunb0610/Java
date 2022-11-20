class Pattern_Z
{
public static void main(String[] args)
{
Pattern_Z.find_pattern_Z();
}
static void find_pattern_Z()
{
for(int row = 1; row<= 9; row++)
{
    for(int col = 1; col<=9; col++)
    {
    if(col == 10-row || row == 1 || row == 9)
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
