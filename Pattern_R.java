class Pattern_R
{
public static void main(String[] args)
{
Pattern_R.print_R();
}
static void print_R()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=5; col++)
    {
    if(col == 1 || row == 1 || row == 5 || col == 5 && row<=5 || row==6 && col==2 || row==7 && col==3 || row==8 && col==4 || row==9 && col==5)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
