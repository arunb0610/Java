class Calculator2
{
public static void main (String[] args)
    {
    Calculator2 calc = new Calculator2();
    calc.add(10,20);//Arguments passing
    calc.add(30,50,45);
    calc.add(6.6f,8.9f);
    //Method overloading (compile time polymorphism)
    }
void add(int num1 , int num2)//Parameter passing
    {
    System.out.println(num1 + num2);
    }
void add(int num1 , int num2 , int num3)
    {
    System.out.println(num1 + num2+num3);
    }
void add(float num1 , float num2)
    {
    System.out.println(num1 + num2);
    }
}
