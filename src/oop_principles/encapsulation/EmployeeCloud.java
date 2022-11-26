package oop_principles.encapsulation;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

public class EmployeeCloud {

    public static void main(String[] args) {

        /*
        Create two companies as company 1 and company 2
        company1 -> Microsoft, Washington, (000) 123-1234
        company2 -> Apple, California, (000) 000-0000
         */

        Company company1 = new Company("Microsoft", "Washington", "(000) 123-1234");
        Company company2 = new Company("Apple", "California", "(000) 000-0000");

        Employee emp1 = new Employee("John Doe", "Manager", 45, company1);
        Employee emp2 = new Employee("Alex Smith", "Developer", 48, company2);
        Employee emp3 = new Employee("Jane Doe", "Developer", 20, company1);
        Employee emp4 = new Employee("Ryan Smith", "Tester", 22, company1);
        Employee emp5 = new Employee("James Reynold", "Tester", 30, company2);
        Employee emp6 = new Employee("Matt Morgan", "Developer", 40, company1);

        /*
        # employees for Apple -> 2
        # employees for Microsoft -> 4
        # manager -> 1
        # developers -> 3
        # testers -> 2
        # developers works for Microsoft -> 2
        # developers works for Apple -> 1

        Find the youngest developer -> Jane is youngest with age -> 20
        Find the oldest employee -> John is the oldest with the age -> 45
         */

        Employee[] employees = {emp1, emp2, emp3, emp4, emp5, emp6};

        System.out.println("\n=======Count Apple and Microsoft employee number======");
        int totalAppleEmployee = 0;

        for (Employee employee : employees) {
            if (employee.getCompany().getName().equals("Apple")) totalAppleEmployee++;
        }

        System.out.println(totalAppleEmployee);

        System.out.println(Arrays.stream(employees).filter(e -> e.getCompany().getName().equals("Microsoft")).count());

        System.out.println("\n=======Count developer employee number======");

        int totalDevelopers = 0;

        for (Employee employee : employees) {
            if (employee.getJobPosition().equals("Developer")) totalDevelopers++;
        }
        System.out.println(totalDevelopers);

        System.out.println(Arrays.stream(employees).filter(e -> e.getJobPosition().equals("Tester")).count());

        System.out.println("\n=======Count developer employee number for Microsoft======");

        System.out.println(Arrays.stream(employees).filter(e -> e.getJobPosition().equals("Developer")
                && e.getCompany().getName().equals("Microsoft")).count());

        int totalNumbersDevelopersForApple = 0;

        for (Employee employee : employees) {
            if (employee.getJobPosition().equals("Developer") && employee.getCompany().getName().equals("Apple"))
                totalNumbersDevelopersForApple++;
        }
        System.out.println(totalNumbersDevelopersForApple);

        System.out.println("\n=======Find oldest developer working for Microsoft======");
        //Math is the oldest Developer working for Microsoft with the age -> 45


//        Employee oldestMicrosoftDev = new Employee();
//        for (Employee employee : employees) {
//            if (employee.getCompany().getName().equals("Microsoft")
//                    && employee.getJobPosition().equals("Developer")
//                    && employee.getAge() > oldestMicrosoftDev.getAge()){
//                oldestMicrosoftDev = employee;
//            }
//        }

        Employee oldestMicrosoftDev = Arrays.stream(employees).filter(
               e -> e.getCompany().getName().equals("Microsoft")
               && e.getJobPosition().equals("Developer")).
                max(Comparator.comparingInt(Employee::getAge)).get();

        System.out.println(
//                oldestMicrosoftDev.getFullName().substring(0, oldestMicrosoftDev.getFullName().indexOf(" ")) +
                oldestMicrosoftDev.getFullName().split(" ")[0] +
                " is the oldest "
                + oldestMicrosoftDev.getJobPosition()
                +"working for "
                + oldestMicrosoftDev.getCompany().getName() +
                " with the age = "
                + oldestMicrosoftDev.getAge());


    }
}
