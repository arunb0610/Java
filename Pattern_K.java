class Pattern_K
{
public static void main(String[] args)
{
Pattern_K.print_K();
}
static void print_K()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=5; col++)
    {
    if(col == 1 || row == 6-col || row==6 && col==2 || row==7 && col==3 || row==8 && col==4 || row==9 && col==5)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
