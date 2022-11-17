class Factorial_For // using for loop
{
public static void main (String[] args)
{
Factorial_For fl = new Factorial_For();
fl.find_factorial(5);
}
void find_factorial(int max)
{
int fact = 1;
for(int num = 1;num<=max;num++)
{
fact = fact * num;
}
System.out.println(fact);
}
}
