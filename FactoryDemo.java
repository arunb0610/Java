abstract class FactoryDemo extends SmartPhone
{
boolean isOriginalPiece = false ;
static int price = 0 ;

abstract void verifyFingerPrint();

abstract void providePattern();

void browse()
{
System.out.println("Factory Demo browsing");
}

}
