package ArraysAndStrings;

public class URLify_1_2 {

    public static String URLify(String s, int trueLength){
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if(s.charAt(i) == ' '){
                spaceCount += 2;
            }
        }
        char[] stringArray = s.toCharArray();
        int insertIndex = trueLength + spaceCount - 1;
        for (int i = trueLength - 1; i >= 0; i-- ) {
            if(stringArray[i] == ' '){
                stringArray[insertIndex] = '0';
                stringArray[insertIndex - 1] = '2';
                stringArray[insertIndex - 2] = '%';
                insertIndex -= 3;
            } else{
                stringArray[insertIndex] = stringArray [i];
                insertIndex --;
            }
        }
        return new String(stringArray);
    }

    public static void main(String[] args){
        System.out.println(URLify("el l  ",4));
        System.out.println(URLify("le m on      ",7));
        System.out.println(URLify("could",5));
        System.out.println(URLify(" ccdd  ",5));
    }
}
