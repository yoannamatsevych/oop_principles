package acces_modifiers.package2;

import acces_modifiers.package1.BMW;
import acces_modifiers.package1.Honda;
import acces_modifiers.package1.Toyota;


public class TestPackage2 {
    public static void main(String[] args) {

        Honda h1 = new Honda();

        System.out.println(h1);// acces_modifiers.package1.Honda@1540e19d

       // Tesla t1 = new Tesla(); can not be access as it is default class

       //Toyota t1 = new Toyota(); // protected but default behavior

        BMW b1 = new BMW();




    }

    public String stringX(String str) {
        for(int i = 1; i < str.length()-1; i++){
            if(str.charAt(i) == 'x') str.replace(str.substring(i, i+1), "");
        }
        return str;
    }

}
