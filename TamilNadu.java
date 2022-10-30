class TamilNadu extends SouthIndia
{

static String capital = "Chennai";

public static void main(String[] args)
{

SouthIndia si = new TamilNadu();
si.cultivate();
si.livingStyle();

India ind = new TamilNadu();

ind.speakLanguage();
ind.eat();
ind.dress();

TamilNadu tn = new TamilNadu();
tn.speakLanguage();
tn.eat();
tn.dress();
tn.cultivate();
tn.livingStyle();

System.out.println(tn.capital);
System.out.println(ind.capital);
}
public void speakLanguage()
{
System.out.println("Speaking tamil");
}
public void eat()
{
System.out.println("Eating rice");
}
public void dress()
{
System.out.println("Wearing culture dress");
}
public void cultivate()
{
System.out.println("Rice and sugarcane cultivation");
}
public void livingStyle()
{
System.out.println("Above Average development");
}

}

