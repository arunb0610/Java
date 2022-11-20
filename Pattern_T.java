class Pattern_T
{
public static void main(String[] args)
{
Pattern_T.print_T();
}
static void print_T()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=7; col++)
    {
    if(row == 1 || col == 4)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
