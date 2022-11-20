class Pattern_U
{
public static void main(String[] args)
{
Pattern_U.print_U();
}
static void print_U()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=5; col++)
    {
    if(col == 1 && row <= 8 || col == 5 && row <= 8 || row == 9 && col == 3 || row == 9 && col == 4 || row == 9 && col == 2)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
