class BMW extends Car
{
BMW()
{
System.out.println("BMW class constructor");
}
public static void main (String[] args)
{

Car inspector = new BMW();
BMW bmw = new BMW();
inspector.accelerate();
inspector.applyBrakes();
inspector.fixairBags();
bmw.quality();
}
void accelerate()
{
System.out.println("High speed car");
}
void applyBrakes()
{
System.out.println("ABS brakes");
}

void quality()
{
System.out.println("High quality car");
}
}
