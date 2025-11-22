package EX2;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Roman {
    public static String intToRoman(int value) {


        LinkedHashMap<Integer, String> RomanValues = new LinkedHashMap<>();
        RomanValues.put(1000, "M");
        RomanValues.put(500, "D");
        RomanValues.put(100, "C");
        RomanValues.put(50, "L");
        RomanValues.put(10, "X");
        RomanValues.put(5, "V");
        RomanValues.put(1, "I");


       for(Object a :RomanValues.keySet()){
           if (value== (4)){
               return "IV";
           }
           if(value==9){
               return "IX";
           }
           if (value >=40 && value <50){
               System.out.print("XL");
               value=value-40;

           }if (value>=90&& value <100){
               System.out.print("XC");
               value=value-90;
           }
           if (value>=400&&value < 500){
               System.out.print("CD");
               value=value-400;
           }if (value>=900 &&value<1000) {
               System.out.print("CM");
               value=value-900;
           }
           if (value/(int)a >=1){



               int result = value/(int)a;




               value=value-((int)a*result);
               for (int i =0;i<result;i++){
                   System.out.print(RomanValues.get(a));
               }
           } else if ((int)a/value==0) {

               System.out.print(RomanValues.get(a));
               System.out.println(" ");


           }
       }








        return "";
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
