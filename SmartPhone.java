abstract class SmartPhone
{

public SmartPhone()
{
System.out.println("Smartphone under development");
}

abstract int call(int seconds);

abstract void sendMessage();

abstract void receiveCall();

void browse()
{
System.out.println("Smartphone browsing");
}

}


