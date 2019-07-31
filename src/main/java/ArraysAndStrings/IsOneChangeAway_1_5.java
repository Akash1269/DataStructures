package ArraysAndStrings;

public class IsOneChangeAway_1_5 {

    public static boolean isOneChangeAway(String s1, String s2){
        if(Math.abs(s1.length() - s2.length()) > 1)
            return false;
        boolean oneDiff = false;
        for (int i = 0, j = 0; i < s1.length() && j < s2.length(); i++, j++) {
            if(s1.charAt(i) != s2.charAt(j)){
                if(oneDiff)
                    return false;
                oneDiff = true;

                if(s1.length() > s2.length())
                    i++;
                else
                    j++;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isOneChangeAway("afas", "afs"));
        System.out.println(isOneChangeAway("leelmom","leelmsm"));
        System.out.println(isOneChangeAway("cod", "codr"));
        System.out.println(isOneChangeAway("d","t"));
        System.out.println(isOneChangeAway("d","rd"));

        System.out.println(isOneChangeAway("dd","ter"));
        System.out.println(isOneChangeAway("dg","rdgr"));
    }
}
