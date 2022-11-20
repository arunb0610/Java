class Pattern_Num_7
{
public static void main(String[] args)
{
Pattern_Num_7.print_7();
}
static void print_7()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=5; col++)
    {
    if(row == 1 || col==5)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
