package EX2;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Roman {
    public static String intToRoman(int value) {


        LinkedHashMap<Integer, String> RomanValues = new LinkedHashMap<>();

        RomanValues.put(1000, "M");
        RomanValues.put(900, "CM");
        RomanValues.put(500, "D");
        RomanValues.put(400, "CD");
        RomanValues.put(100, "C");
        RomanValues.put(90, "XC");
        RomanValues.put(50, "L");
        RomanValues.put(40, "XL");
        RomanValues.put(10, "X");
        RomanValues.put(9, "IX");
        RomanValues.put(5, "V");
        RomanValues.put(4, "IV");
        RomanValues.put(1, "I");

         String Answer ="";
       for(Object a :RomanValues.keySet()) {

           if (value / (int)a >= 1) {
               int result = value / (int) a;

               for (int i = 0; i < result; i++) {
                   Answer += RomanValues.get(a);
               }

               value = value - ((int) a * result);
           }
       }
        return Answer;
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(4));
        System.out.println(intToRoman(9));
        System.out.println(intToRoman(58));
       System.out.println(intToRoman(1994));
        System.out.println(intToRoman(90));
    }
}
