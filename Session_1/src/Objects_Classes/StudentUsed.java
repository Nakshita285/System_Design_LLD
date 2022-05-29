package Objects_Classes;

public class StudentUsed {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2;
        new Student();

        s1.rollno = 10;
        s1.name = "Hemant";

        System.out.println("Hello " + s1.name+" Your roll Number is : " + s1.rollno);
    }
}
