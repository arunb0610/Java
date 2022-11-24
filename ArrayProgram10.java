import java.util.Scanner;

class ArrayProgram10
{
public static void main(String[] args)
{
ArrayProgram10 ap = new ArrayProgram10();
ap.miniProject();
}
void miniProject()
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of subjects : ");
int subjects = sc.nextInt();
Integer count = subjects;
String[] subjectname = new String[count];
int[] marks = new int[count];
int total = 0;
for(int i = 0; i<subjectname.length; i++)
{
System.out.print("Enter the Subject Name : ");
subjectname[i] = sc.next();
for(int j = 0; j<marks.length; j++)
{
for(int k = 0; k == j; k++)
{
if(k == j)
System.out.print("Enter "+subjectname[i]+" Mark : ");
marks[j] = sc.nextInt();
total = total + marks[j];
}
}
}
System.out.println("The total Marks obtained is "+total);
System.out.println("The percentage is "+total/subjects);
}
}
