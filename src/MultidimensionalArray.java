public class MultidimensionalArray {
    public static void test() {
        int[][] results = new int[3][4];
        int[][] twoD = {
                {1, 2},
                {3, 4}
        };
        /**
         * 1 2 3 11
         * 4 5 6 22
         * 7 8 9 33
         */
        // convert the above matrix to rows to column
        /**
         * 1  4  7
         * 2  5  8
         * 3  6  9
         * 11 22 33
         */


        results[0][0] = 1;
        results[0][3] = 11;
        results[0][2] = 3;
        results[1][3] = 22;
        results[2][0] = 7;
        results[2][3] = 33;

        print2DMatrix(results);
        print2DMatrix(transpose(results));

//        print2DMatrix(results);
//        print2DMatrix(twoD);

        int[][] ragged = {
                {1,2,3},
                {4,5},
                {6}
        };

//        print2DMatrix(ragged);
//        print2DMatrix(twoD);
//        rowSum(twoD);
//        colSum(twoD);

        int[][][] threeD = new int[3][3][3];
        threeD[0][0][0] = 1;
        threeD[0][0][1] = 2;
        threeD[0][0][2] = 3;
        threeD[0][1][0] = 4;
        threeD[0][1][1] = 5;

        int[][][] bigMatrix = {
                {{1, 2}, {2, 3}},
                {{12, 22}, {22, 32}},
                {{91, 92}, {92, 93}},
        };
//        print3DMatrix(bigMatrix);
    }

    public static void print2DMatrix(int[][] matrix) {
        System.out.println("Printing array elements...");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print3DMatrix(int[][][] matrix) {
        System.out.println("Printing array elements...");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[j].length; k++) {
                    System.out.print(matrix[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void rowSum(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int total = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                total += matrix[i][j];
            }
            System.out.println("The sum of row " + i + " is: " + total);
        }
    }

    public static void colSum(int[][] matrix) {
        for (int col = 0; col < matrix[0].length; col++) {
            int total = 0;
            for (int row = 0; row < matrix.length; row++) {
                total += matrix[row][col];
            }
            System.out.println("The sum of col " + col + " is: " + total);
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] transpose = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

}
