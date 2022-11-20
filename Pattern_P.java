class Pattern_P
{
public static void main(String[] args)
{
Pattern_P.print_P();
}
static void print_P()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=5; col++)
    {
    if(col == 1 || row == 1 || col == 5 && row <= 5 || row == 5)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
