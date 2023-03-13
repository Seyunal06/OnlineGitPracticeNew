package BootCamp.Day2;

import java.util.Arrays;

public class StringFunctions {
    public static void main(String[] args) {
        //charAt(), replace(), indexOf(), substring(), **split()**
        //toUpperCase, toLowerCase, etc..

        //interview Q, change the plus word with "+"
        // and minus word with "-"
        String str = "plusminusplusminusplusminus";

        //it returns char of the giving index
        char ch = str.charAt(1);
        System.out.println(ch);

        //replace
        String str2 = str.replace("plus","+");
        str2 = str2.replace("minus","-");
        System.out.println(str2);

        //given a time, return only the hours
        //11:00
        String str3 = "11:00";
        //if it does not find index of given char, it returns -1
        int indexOfChar = str3.indexOf(":");
        String str4 = str3.substring(0,indexOfChar);
        System.out.println("The hour is "+str4);

        //given a name, please return only last name
        String str5 = "Seyma Unal";
        int indexOfWhiteSpace = str5.indexOf(" ");
        String onlyLastName = str5.substring(indexOfWhiteSpace + 1, str5.length());
        System.out.println(onlyLastName);

        //str = "plusminusplusminusplusminus";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        //Interview Q, sort the String, and make the first word start with upper case letter.
        //This is a String >>A is

        //split method
        String str6 = "This is a String";
        String[] strArray = str6.split(" ");//[This, is, a, string]

        //join()
        System.out.println(String.join(" ","This", "is","a","String"));






    }
}
