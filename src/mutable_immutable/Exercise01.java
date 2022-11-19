package mutable_immutable;

public class Exercise01 {
    /*
    Create a method that takes a string and return the string
    if given String have even length and length is at least 2, then insert * int the middle of the string

    aa -> a*a
    Java -> ja*va
    yoanna -> yoa*nna

    if the given string have odd length and length is at least 3, then insert * in before and after the middle char

    aaa -> a*a*a
    olena -> ol*e*na

    if string is Empty or length of 1 then return String itsesf
     */

    public static String insertStar(String str){
        if (str.length() <= 1) return str;
        if (str.length()%2 == 0){
           return new StringBuilder(str).insert(str.length()/2, "*").toString();
        }
        else{
           return new StringBuilder(str).insert(str.length()/2, "*").insert(str.length()/2+2, "*").toString();
        }

    }

    public static void main(String[] args) {
        System.out.println(insertStar("yoanna"));
        System.out.println(insertStar("aa"));
        System.out.println(insertStar("Java"));
        System.out.println(insertStar("aaa"));
        System.out.println(insertStar("olena"));
    }

}
