package ArraysAndStrings;

public class CheckStringRotation_1_9 {

    public static boolean checkStringRotation(String string, String rotatedString){
        if(string.length() != rotatedString.length())
            return false;
        return (string + string).contains(rotatedString);
    }


    public static void main(String[] args){
        System.out.println(checkStringRotation("ell","lle"));
        System.out.println(checkStringRotation("lemon","onlem"));
        System.out.println(checkStringRotation("le","el"));
        System.out.println(checkStringRotation("ccdd","ddcc"));
        System.out.println(checkStringRotation("c","c"));
        System.out.println(checkStringRotation("cd","cdc"));
        System.out.println(checkStringRotation("iamadiscodancer","discodanceriama"));
    }
}
