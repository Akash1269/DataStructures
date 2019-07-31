package ArraysAndStrings;

import java.util.HashMap;

public class IsPermutation_1_2 {

    public static boolean IsPermutation(String s1, String s2){
        if(s1.length() != s2.length())
            return false;

        HashMap<Character,Integer> countMap = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if(countMap.containsKey(c))
                countMap.replace(c, countMap.get(c) + 1);
            else
                countMap.put(c, 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if(countMap.containsKey(c)) {
                if ((countMap.get(c) - 1) < 0)
                    return false;
                else
                    countMap.replace(c, countMap.get(c) - 1);
            } else
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(IsPermutation("ell","lle"));
        System.out.println(IsPermutation("lemon","noelm"));
        System.out.println(IsPermutation("could","lie"));
        System.out.println(IsPermutation("ccdd","cccd"));
    }
}
