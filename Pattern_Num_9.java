class Pattern_Num_9
{
public static void main(String[] args)
{
Pattern_Num_9.print_9();
}
static void print_9()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=5; col++)
    {
    if(row == 1 || row==9 || col==1 && row<=5 || col==5 || row == 5)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
