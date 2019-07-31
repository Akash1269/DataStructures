package ArraysAndStrings;

import java.util.HashSet;

public class IsUnique_1_1 {

    private static boolean isUnique(String s){
        HashSet<Character> set = new HashSet<>();
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if(set.contains(array[i]))
                return false;
            set.add(array[i]);
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isUnique("today"));
        System.out.println(isUnique("Tot"));
        System.out.println(isUnique("Hello"));
    }
}
