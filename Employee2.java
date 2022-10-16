package tamilNadu.thiruvannamali; //thiruvannamalai is another package but we are accesing Office class file in this class so we need to import the package and classfile by using import keyword .
import tamilNadu.chennai.Office;

class Employee2
{
public static void main (String[] args)
{
Office office = new Office(); //Creating object for Office class
office.work();  //Calling object were definition is present in office class
office.paySalary();
}
}
