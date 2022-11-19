package mutable_immutable;

public class ReverseString {

    /*
    Write a method that takes a string and returns its back reverse

    Hello -> olleH
    Java -> avaJ
    "" -> ""
    "a" -> "a"
    1234 -> 4321
    Good morning -> gninrom dooG

     */
    public static String reversString(String str){


         return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str){
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    public static void main(String[] args) {
        System.out.println(reversString("Hello"));
        System.out.println(reversString("Java"));
        System.out.println(reversString(""));
        System.out.println(reversString("a"));
        System.out.println(reversString("1234"));
        System.out.println(reversString("Good morning"));


        System.out.println("\n");
        System.out.println(isPalindrome("civic"));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("Madam"));
        System.out.println(isPalindrome("Hello"));
    }

}
