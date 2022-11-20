class Printing_Name
{
public static void main(String[] args)
{
Printing_Name pm = new Printing_Name();

pm.pattern_A();
System.out.println();
pm.print_R();
System.out.println();
pm.print_U();
System.out.println();
pm.find_pattern_N();
System.out.println();
}

void find_pattern_N()
{
for(int row = 1; row<= 7; row++)
{
    for(int col = 1; col<=7; col++)
    {
    if(col == 1 || col == 7 || col == row)
    {
    System.out.print("* ");
    }
    else
    System.out.print("  ");
    }
System.out.println();
}
}
void pattern_A()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=5; col++)
    {
    if(row == 1 || col==1 || col==5 || row == 5)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}

void print_R()
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
void print_U()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=5; col++)
    {
    if(col == 1 && row <= 8 || col == 5 && row <= 8 || row == 9 && col == 3 || row == 9 && col == 4 || row == 9 && col == 2)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}


