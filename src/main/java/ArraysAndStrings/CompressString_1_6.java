package ArraysAndStrings;

public class CompressString_1_6 {

    public static String compressString(String s) {

        int countConsecutive = 0;
        int compressedSize = 0;
        for (int i = 0; i < s.length(); i++) {
            countConsecutive++;
            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                compressedSize = compressedSize + 1 + String.valueOf(countConsecutive).length();
                countConsecutive = 0;
            }
        }

        if(s.length() <= compressedSize)
            return s;

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            countConsecutive++;
            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                compressedSize = compressedSize + 1 + String.valueOf(countConsecutive).length();
                stringBuilder.append(s.charAt(i)).append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(compressString("aaaattttttttttttttjjj"));
        System.out.println(compressString("leelmmmmmm"));
        System.out.println(compressString("could"));
        System.out.println(compressString("ccaddddddtt"));
        System.out.println(compressString("d"));
    }
}
