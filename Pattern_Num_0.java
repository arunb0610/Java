class Pattern_Num_0
{
public static void main(String[] args)
{
Pattern_Num_0.print_0();
}
static void print_0()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=5; col++)
    {
    if(row == 1 || row==9 || col==1 || col==5)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
