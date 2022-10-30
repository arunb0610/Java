class SQL_trainer extends Trainer
{
public static void main (String[] args)
{
SQL_trainer ram = new SQL_trainer();
Trainer kumar = new Trainer("CSE","Payilagam");
ram.training();
System.out.println(ram.get_salary());
System.out.println(ram.dept);
System.out.println(ram.institute);
}

}
