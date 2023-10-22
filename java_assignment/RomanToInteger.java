package java_assignment;

import java.util.Scanner;
import java.util.regex.*;

class RomanToInteger{

    static int value(char ch){
        
        if(ch == 'I') return 1;
        if(ch == 'V') return 5;
        if(ch == 'X') return 10;
        if(ch == 'L') return 50;
        if(ch == 'C') return 100;
        if(ch == 'D') return 500;
        if(ch == 'M') return 1000;
        
        return -1;
    }

    static boolean validateRoman(String str){
        String regexString = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
        Pattern pattern = Pattern.compile(regexString);
        
        if(str == null) return false;

        Matcher matcher = pattern.matcher(str);

        return matcher.matches();

    }

    public static int romanToInt(String str){
        int integer = 0;
        String roman = str.toUpperCase();
        
        if(!validateRoman(roman)) return -1;

        for(int i=0; i<roman.length(); i++){
            int s1 = value(roman.charAt(i));
            if(i+1 < roman.length()){
                int s2 = value(roman.charAt(i+1));
                if(s1 >= s2){
                    integer += s1;
                } else{
                    integer += (s2-s1);
                    i++;
                }
            } else{
                integer += s1;
            }
        }

        return integer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.nextLine();
        int integer = romanToInt(roman);
        if(integer == -1){
            System.out.println("INVALID INTEGER !!! Please Enter a Valid Integer...");
        } else{
            System.out.println("Integer: "+integer);
        }
        sc.close();
    }
}