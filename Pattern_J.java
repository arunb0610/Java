class Pattern_J
{
public static void main(String[] args)
{
Pattern_J.print_J();
}
static void print_J()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=7; col++)
    {
    if(row == 1 || row == 9 && col == 3 || row == 8 && col == 2|| row ==7 && col == 2 || col == 4 && row<=8)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
