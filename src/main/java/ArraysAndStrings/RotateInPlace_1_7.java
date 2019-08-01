package ArraysAndStrings;

public class RotateInPlace_1_7 {

    public static boolean rotateInPlace(int[][] matrix){
        if(matrix.length == 0 || matrix[0].length == 0 || matrix.length != matrix[0].length){
            return false;
        }
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i -1 ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i -1];
                matrix[j][n - i -1] = temp;
            }
        }
        return true;
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Original Matrix");
        printMatrix(matrix);

        System.out.println(rotateInPlace(matrix));

        System.out.println("Rotated Matrix");
        printMatrix(matrix);

        int[][] matrix1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        System.out.println("Original Matrix 1");
        printMatrix(matrix1);

        System.out.println(rotateInPlace(matrix1));

        System.out.println("Rotated Matrix 1");
        printMatrix(matrix1);

        int[][] matrix2 = {{1,2},{3,4}};

        System.out.println("Original Matrix 2");
        printMatrix(matrix2);

        System.out.println(rotateInPlace(matrix2));

        System.out.println("Rotated Matrix 2");
        printMatrix(matrix2);

        int[][] matrix3 = {{1,2,3},{4,5,6}};

        System.out.println("Original Matrix 3");
        printMatrix(matrix3);

        System.out.println(rotateInPlace(matrix3));

        System.out.println("Rotated Matrix 3");
        printMatrix(matrix3);
    }
}
