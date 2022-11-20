class Pattern_L
{
public static void main(String[] args)
{
Pattern_L.print_L();
}
static void print_L()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=5; col++)
    {
    if(col == 1 || row == 9)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
