import java.io.*;
import java.util.*;

class Solution {

    Hashtable<Character, Integer> romanMap = new Hashtable<Character, Integer>();


    public int romanToInt(String s) {
        int result = 0;

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        if(s.length() > 1){
            for(int i = 0; i < s.length()-1; i++){
                if(subtract(s.charAt(i), s.charAt(i + 1))){
                    result += (romanMap.get(s.charAt(i+1)) - romanMap.get(s.charAt(i)));
                    i++;
                }else {
                    result += romanMap.get(s.charAt(i));
                }

                if(i == s.length() - 2){
                    result += romanMap.get(s.charAt(i + 1));
                }
            }
        } else{
            result = romanMap.get(s.charAt(0));
        }

        return result;
    }
    private Boolean subtract(char prev, char current){
        if((romanMap.get(current)  / romanMap.get(prev)) >= 5 && (romanMap.get(current)  / romanMap.get(prev)) <= 10){
            return romanMap.get(prev) == 1 || romanMap.get(prev) == 10 || romanMap.get(prev) == 100;
        }
        return false;
    }
}
