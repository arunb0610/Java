class Printing
{
public static void main(String[] args)
{
Printing pg = new Printing();
pg.printing_number();
}
void printing_number()
{
int num = 1;
int num2 = 10;
while(num<=10 && num2>=1)
{
System.out.println(num+"*"+num2);
num = num+1;
num2 = num2-1;
}
}
}
