class Trainer
{
String dept = "Java";
String institute = "Payilagam";
private int salary = 10000;

int get_salary()
{
return this.salary;
}

Trainer(String dept1,String institute1)
{
System.out.println("kumar dept is :" +dept1);
System.out.println("kumar institute is :" +institute);
}

Trainer()
{
System.out.println("Zero arg constructor");
}

public static void main (String[] args)
{
Trainer kumar = new Trainer("CSE","Payilagam");
}

void training()
{
System.out.println("Teaching java");
}

}
