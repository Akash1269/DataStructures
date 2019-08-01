package ArraysAndStrings;

public class ZeroMatrix_1_8 {

    public static boolean makeMatrixZero(int[][] matrix){
        if (matrix.length == 0 || matrix[0].length == 0)
            return false;

        int rowWidth = matrix[0].length;
        int columnHeight = matrix.length;

        boolean isFirstRowZero = false;
        boolean isFirstColumnZero = false;

        for (int i = 0; i < rowWidth; i++) {
            if (matrix[0][i] == 0){
                isFirstRowZero = true;
                break;
            }
        }
        for (int i = 0; i < columnHeight; i++) {
            if (matrix[i][0] == 0){
                isFirstColumnZero = true;
                break;
            }
        }

        for (int i = 1; i < columnHeight; i++) {
            for (int j = 1; j < rowWidth; j++) {
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < columnHeight; i++) {
            if(matrix[i][0] == 0){
                makeRowZero(matrix, i);
            }
        }
        for (int i = 1; i < rowWidth; i++) {
            if(matrix[0][i] == 0){
                makeColumnZero(matrix, i);
            }
        }
        if (isFirstRowZero)
            makeRowZero(matrix, 0);
        if (isFirstColumnZero){
            makeColumnZero(matrix, 0);
        }
        if (isFirstRowZero || isFirstColumnZero){
            matrix[0][0] = 0;
        }
        return true;
    }
    public static void makeRowZero(int[][] matrix, int rowNum) {
        for (int i = 1; i < matrix[0].length; i++) {
            matrix[rowNum][i] = 0;
        }
    }
    public static void makeColumnZero(int[][] matrix, int columnNum){
        for (int i = 1; i < matrix.length; i++) {
            matrix[i][columnNum] = 0;
        }
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
        int[][] matrix = {{0,2,3},{4,5,6},{7,8,9}};

        System.out.println("Original Matrix");
        printMatrix(matrix);

        System.out.println(makeMatrixZero(matrix));

        System.out.println("Zeroed Matrix");
        printMatrix(matrix);

        int[][] matrix1 = {{1,2,3,0},{5,6,0,8},{9,10,11,0},{13,14,15,16}};

        System.out.println("Original Matrix 1");
        printMatrix(matrix1);

        System.out.println(makeMatrixZero(matrix1));

        System.out.println("Zeroed Matrix 1");
        printMatrix(matrix1);

        int[][] matrix2 = {{0,2},{3,4}};

        System.out.println("Original Matrix 2");
        printMatrix(matrix2);

        System.out.println(makeMatrixZero(matrix2));

        System.out.println("Zeroed Matrix 2");
        printMatrix(matrix2);

        int[][] matrix3 = {{1,2,3},{4,5,0}};

        System.out.println("Original Matrix 3");
        printMatrix(matrix3);

        System.out.println(makeMatrixZero(matrix3));

        System.out.println("Zeroed Matrix 3");
        printMatrix(matrix3);

        int[][] matrix4 = {{1,2},{3,4},{0,6}};

        System.out.println("Original Matrix 4");
        printMatrix(matrix4);

        System.out.println(makeMatrixZero(matrix4));

        System.out.println("Zeroed Matrix 4");
        printMatrix(matrix4);
    }
}