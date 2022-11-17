class Swapping2 //swapping four numbers without using third variable
{
public static void main(String[] args)
{
Swapping2 sg = new Swapping2();
sg.find_swapping();
}
void find_swapping()
{
int a = 57, b = 46, c = 72, d = 54 ;
d = a+b+c+d;
c = d-(a+b+c);
b = d-(a+b+c);
a = d-(a+b+c);
d = d-(a+b+c);
System.out.println("a = "+a);
System.out.println("b = "+b);
System.out.println("c = "+c);
System.out.println("d = "+d);
}
}
