class Pattern_Q
{
public static void main(String[] args)
{
Pattern_Q.print_Q();
}
static void print_Q()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=7; col++)
    {
    if(col == 1 && row<=5 || row == 1 && col <= 5 || col == 5 && row <= 5 || row == 5 && col <= 5 || col == row && row >= 5)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
