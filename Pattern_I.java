class Pattern_I
{
public static void main(String[] args)
{
Pattern_I.print_I();
}
static void print_I()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=7; col++)
    {
    if(row == 1 || row == 9 || col == 4)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
