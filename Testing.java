package sample ;
public class Testing
{ 
public static void main(String[] args)
{ 
Number num = new Number(); //Creating an object of class Number

   num.set(9); //calling setter method to set value for num(reference variable)
   int number = num.get(); //calling getter method where definition given in class Number
   System.out.println("The number is : " + number); 
  } 
}
