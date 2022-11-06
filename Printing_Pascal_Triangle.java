class Printing_Pascal_Triangle
{
public static void main(String[] args)
{
Printing_11_Table pt = new Printing_11_Table();
pt.Printing_11_Table();
}
void Printing_11_Table()
{
int num = 1;
System.out.println(num);
while(num<=1000)
{
int total = (num*10)+num ;
System.out.println(total);
num = total;
}
}
}
