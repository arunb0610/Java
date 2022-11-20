class Pattern_Num_4
{
public static void main(String[] args)
{
Pattern_Num_4.print_4();
}
static void print_4()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=5; col++)
    {
    if(row == 5 || col == 5 || col ==1 && row<=5)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
