class Swapping //swapping three numbers without using third variable
{
public static void main(String[] args)
{
Swapping sg = new Swapping();
sg.find_swapping();
}
void find_swapping()
{
int a = 5, b = 6, c = 7 ;
c = a+b+c;
b = c-(a+b);
a = c-(a+b);
c = c-(a+b);
System.out.println("a = "+a);
System.out.println("b = "+b);
System.out.println("c = "+c);
}
}
