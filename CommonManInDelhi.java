package india.newDelhi ;
import tamilNadu2.chennai.TrafficRules;

class CommonManInDelhi implements TrafficRulesDelhi,TrafficRules
{
public static void main(String[] args)
{
CommonManInDelhi man2 = new CommonManInDelhi();
man2.dontGoByDieselVehicle();
man2.goByBicycle();
man2.goByDieselVehicle();
}
public void dontGoByDieselVehicle()
{
System.out.println("Diesel vehicles are prohibited");
}

public void goByBicycle()
{
System.out.println("bicycles allowed");
}

public void goByDieselVehicle()
{
System.out.println("Only diesel vehicle");
}

}
