package oop_principles.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Employee_Exercise {
        public static void main(String[] args) {


        /*
        Create 3 companies
        Name, address, phone numbers
        Tesla, California, 123
        US Bank,Minnesota, 000
        Verizon, Texas, 111

        Create 10 employees
        FullName, position, age, company
        Andrii, Developer, 25, Tesla
        Yildiz, System Architect, 23, US Bank
        Malek, Developer, 30, Verizon
        Saeed, Manager, 35, Verizon
        Samir, Tester, 20, US Bank
        Viktoriya, Designer, 30, Tesla
        Ibrahim, Designer, 27, Tesla
        Jeremiah, Scrum Master, 21, US Bank
        Olena, Tester, 29, Verizon
        Yoanna, Tester, 23, Tesla

         */

                Company c1 = new Company("Tesla", "California", "123");
                Company c2 = new Company("US Bank", "Minnesota", "000");
                Company c3 = new Company("Verizon", "Texas", "111");

                ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(
                        new Employee("Andrii", "Developer", 25, c1),
                        new Employee("Yildiz", "System Architect", 23, c2),
                        new Employee("Malek", "Developer", 30, c3),
                        new Employee("Saeed", "Manager", 35, c3),
                        new Employee("Samir", "Tester", 20, c2),
                        new Employee("Viktoriya", "Designer", 30, c1),
                        new Employee("Ibrahim", "Designer", 27, c1),
                        new Employee("Jeremiah", "Scrum Master", 21, c2),
                        new Employee("Olena", "Tester", 29, c3),
                        new Employee("Yoanna", "Tester", 23, c1)
                ));

        /*
        Write a program to find and report below info

        Employee numbers for each company
        Tesla = 4
        US Bank = 3
        Verizon = 3

        Employee numbers for each position
        Tester = 3
        Developers = 2
        Manager = 1
        System Architect = 1
        Designer = 2
        Scrum master = 1

        Find youngest
        Tester = Samir with the age of 20
        developer = Andrii with the age of 25
        designer = Ibrahim with the age of 27

        Find the company
        Manager = Saeed works at Verizon
        System Architect = Yildiz works at US Bank
        Scrum Master = Jeremiah work at US Bank
         */

                int teslaEmployees = 0, usbankEmployee = 0, verizonEmployees = 0;
                int testerPosition = 0, developerPosition = 0, managerPosition = 0;
                int saPosition = 0, designerPosition = 0, scrumMusterPosition = 0;

                Employee testerYoungest = new Employee();
                Employee developerYoungest = new Employee();
                Employee designerYoungest = new Employee();

                Employee managerEmployee = new Employee();
                Employee systemArchitectEmployee = new Employee();
                Employee scrumMasterEmployee = new Employee();

                for (Employee employee : employees) {
                        if(employee.getCompany().getName().equals("Tesla")) teslaEmployees++;
                        else if (employee.getCompany().getName().equals("US Bank")) usbankEmployee++;
                        else if (employee.getCompany().getName().equals("Verizon")) verizonEmployees++;

                        if(employee.getJobPosition().equals("Tester")) testerPosition++;
                        else if (employee.getJobPosition().equals("Developer")) developerPosition++;
                        else if (employee.getJobPosition().equals("Manager")) managerPosition++;
                        else if (employee.getJobPosition().equals("System Architect")) saPosition++;
                        else if (employee.getJobPosition().equals("Designer")) designerPosition++;
                        else if (employee.getJobPosition().equals("Scrum Master")) scrumMusterPosition++;

                        testerYoungest = employees.stream().filter(e -> e.getJobPosition().equals("Tester")).
                                min(Comparator.comparingInt(Employee::getAge)).get();
                        developerYoungest = employees.stream().filter(e -> e.getJobPosition().equals("Developer")).
                                min(Comparator.comparingInt(Employee::getAge)).get();
                        designerYoungest = employees.stream().filter(e -> e.getJobPosition().equals("Designer")).
                                min(Comparator.comparingInt(Employee::getAge)).get();

                        if (employee.getJobPosition().equals("Manager")) managerEmployee = employee;
                        else if (employee.getJobPosition().equals("System Architect")) systemArchitectEmployee = employee;
                        else if (employee.getJobPosition().equals("Scrum Master")) scrumMasterEmployee = employee;


                }

                System.out.println("Employee numbers for each company\n" +
                        c1.getName() + " = " + teslaEmployees + "\n" +
                        c2.getName() + " = " + usbankEmployee +"\n" +
                        c3.getName() + " = " + verizonEmployees);

                System.out.println("\nEmployee numbers for each position\n" +
                        "Tester = " + testerPosition +
                        "\nDevelopers = " + developerPosition +
                        "\nManager = " + managerPosition +
                        "\nSystem Architect = " + saPosition +
                        "\nDesigner = " + designerPosition +
                        "\nScrum master = " +scrumMusterPosition);

                System.out.println("\nFind youngest\n" +
                        "Tester = " + testerYoungest.getFullName().split(" ")[0] + " with the age of " +
                                testerYoungest.getAge() + "\n" +
                        "developer = " + developerYoungest.getFullName().split(" ")[0] + " with the age of " +
                        developerYoungest.getAge() + "\n" +
                        "designer =  " + designerYoungest.getFullName().split(" ")[0] +
                        " with the age of " + designerYoungest.getAge());

                System.out.println("\nFind the company\n" +
                        "Manager = " + managerEmployee.getFullName().split(" ")[0] +
                                " works at " + managerEmployee.getCompany().getName() + "\n" +
                        "System Architect = " + systemArchitectEmployee.getFullName().split(" ")[0] +
                        " works at " + systemArchitectEmployee.getCompany().getName() + "\n" +
                        "Scrum Master = " + scrumMasterEmployee.getFullName().split(" ")[0] +
                        " work at " + scrumMasterEmployee.getCompany().getName());
        }
        }
