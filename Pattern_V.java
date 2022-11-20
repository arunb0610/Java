class Pattern_V
{
public static void main(String[] args)
{
Pattern_V.print_V();
}
static void print_V()
{
for(int row = 1; row<=5; row++)
{
    for(int col = 1; col<=9; col++)
    {
    if(col == row && row<=5 || col == 10-row && row <= 5)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
