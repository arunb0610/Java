class Teacher
{
Teacher()
{
        System.out.println("Teacher class Constructor");
}
}


//class 2


class Student extends Teacher
{
Student()
{
        System.out.println("Student class Constructor");
}
}


//class 3


class Main
{
    public static void main(String[] args)
{
     // Creating object of subclass
     // inside main() method
     Student Arun = new Student();
}
}
