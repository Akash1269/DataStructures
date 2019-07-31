package ArraysAndStrings;

import java.util.HashMap;

public class IsPermutationPalindrome_1_4 {

    public static boolean isPermutationOfPalindrome(String s){
        HashMap<Character, Integer> countMap = new HashMap<>();
        int oddCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(countMap.containsKey(c)){
                countMap.replace(c, countMap.get(c) + 1);
            }else {
                countMap.put(s.charAt(i), 1);
            }
            if(countMap.get(s.charAt(i)) % 2 == 0)
                oddCount--;
            else
                oddCount++;
        }
        return oddCount <= 1;
    }

    public static void main(String[] args){
        System.out.println(isPermutationOfPalindrome("afasfasayuu"));
        System.out.println(isPermutationOfPalindrome("leelmom"));
        System.out.println(isPermutationOfPalindrome("could"));
        System.out.println(isPermutationOfPalindrome(" ccadd "));
        System.out.println(isPermutationOfPalindrome("d"));
    }
}
