class Pattern_Num_8
{
public static void main(String[] args)
{
Pattern_Num_8.print_8();
}
static void print_8()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=5; col++)
    {
    if(row == 1 || row==9 || col==1 || col==5 || row == 5)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
