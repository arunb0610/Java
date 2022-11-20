class Pattern_G
{
public static void main(String[] args)
{
Pattern_G.print_G();
}
static void print_G()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=6; col++)
    {
    if(row == 1 || row == 9 || col == 1 || col == 6 && row >= 5 || row == 5 && col > 3)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
