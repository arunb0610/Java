class Pattern_S
{
public static void main(String[] args)
{
Pattern_S.print_S();
}
static void print_S()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=5; col++)
    {
    if(col == 1 &&  row <= 5 || row == 5 || row ==1 || row == 9 || col == 5 &&  row >= 5)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
