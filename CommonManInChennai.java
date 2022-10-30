package tamilNadu2.chennai;

class CommonManInChennai implements TrafficRules
{
public static void main(String[] args)
{
CommonManInChennai man = new CommonManInChennai();
man.goByDieselVehicle();
man.goByBicycle();
}

public void goByDieselVehicle()
{
System.out.println("Only diesel vehicle");
}

public void goByBicycle()
{
System.out.println("Only bicycle");
}

}
