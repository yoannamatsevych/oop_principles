package class_object;

import java.util.ArrayList;
import java.util.List;

public class StudentTeacherPractice2 {
    public static void main(String[] args) {

        /*
        Create a Teacher object
        Create 4 Student object

        Add students to Teacher Student list
        Find the age difference between oldest anf youngest students
         */

        Teacher teacher = new Teacher("Alex", "Smith");
        Student student1 = new Student("John", "Doe", 15);
        Student student2 = new Student("Jane", "Doe", 20);
        Student student3 = new Student("Mike", "Smith", 25);
        Student student4 = new Student("Robert", "Smith", 50);


        teacher.addStudent(student1);
        teacher.addStudent(student2);
        teacher.addStudent(student3);
        teacher.addStudent(student4);

        int maxAge = student1.age;
        int minAge = student1.age;


        for (Student student : teacher.getStudents()){
            if(student.age > maxAge) maxAge = student.age;
            if(student.age < minAge) minAge = student.age;
        }


        System.out.println(maxAge - minAge);

    }
}
