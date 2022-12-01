package oop_principles.inharitance;

import java.util.Arrays;

public class TesterClub {
    public static void main(String[] args) {

        FrontendTester ft1 = new FrontendTester("Othman", 23, "1993", "000", true);

        BackendTester bt1 = new BackendTester("John", 45, "1982", "111", false);

        FrontendTester ft2 = new FrontendTester("Yoanna", 29, "1996", "222", false);

        BackendTester bt2 = new BackendTester("Jane", 36, "1992", "333", true);

        Tester[] testers = {ft1, ft2, bt1, bt2}; //Polymorphic array
       // Tester[] testers1 = new Tester[]; //Polymorphic array

        /*
        Manual testers = 3
        Automation tester = 1
        Average age = 33
         */

        System.out.println(Arrays.stream(testers).filter(x -> x.isAutomationTester).count());
        System.out.println(Arrays.stream(testers).filter(x -> !x.isAutomationTester).count());

        int countManual = 0;
        int countAutomation = 0;
        int sumAverageAge = 0;

        for (Tester tester : testers) {
            if (!tester.isAutomationTester) countManual++;
            else countAutomation++;
           sumAverageAge += tester.age;
        }
        System.out.println("Manual testers = " + countManual);
        System.out.println("Automation tester = " + countAutomation);
        System.out.println("Average age = " + sumAverageAge/testers.length);
    }
}
