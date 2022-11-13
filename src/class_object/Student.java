package class_object;

public class Student {

    public Student(){

    }

    //Create the constructor that takes two args

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        addStudent();
    }

    public static int numberOfStudents = 0;

   public static final String program = "Software Engineer in Test";


   public String firstName;
   public String lastName;
   public int age;
   public Teacher teacher;
   public void study(){
       System.out.println( this.firstName + " studies");

   }
   public void rest(){
       System.out.println( this.firstName + " " + this.lastName +
               " rests");
   }

   public static void addStudent(){
       numberOfStudents++;
   }

    @Override
    public String toString() {
        return "Student{" +
                "program= " + program + '\'' +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
