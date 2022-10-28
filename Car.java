abstract class Car
{
Car()
{
    System.out.println("Calling Car constructor");
}
abstract void accelerate();

abstract void applyBrakes();
    
void fixairBags()
{
    System.out.println("Air bags installed");
}
}
