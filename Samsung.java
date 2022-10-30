class Samsung extends FactoryDemo
{
static int price = 5000;


public static void main(String[] args)
{
Samsung sam = new Samsung();
sam.browse();
sam.call(55);
sam.sendMessage();
sam.receiveCall();
sam.verifyFingerPrint();
sam.providePattern();

System.out.println("The mobile price is :"+sam.price);
FactoryDemo fd = new Samsung();
System.out.println("It is a original price : "+fd.isOriginalPiece);
}

int call(int seconds)
{
return seconds;
}

void sendMessage()
{
System.out.println("Sending message");
}

void receiveCall()
{
System.out.println("Receiving call");
}

void verifyFingerPrint()
{
System.out.println("Verified finger print");
}

void providePattern()
{
System.out.println("Pattern provided");
}
}
