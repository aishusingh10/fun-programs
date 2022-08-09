import java.util.*;

public class PSudoko {
    public static void main(String args[]) {
        //int[][] input3 = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
        int[][] input3 = {{1,2,3,4,5}, {4,5,6,7,8}, {1,3,2,5,4},{5,4,3,2,1}};
        //int[][] input3 = { { 1, 4, 3, 2 }, { 2, 2, 2, 3 }, { 3, 3, 4, 1 }, { 4, 1, 1, 4 } };
        int row = input3.length;
        int col = input3[0].length;
        sortCol(input3, row, col);
        int[][] finalInput = transpose(input3, row, col);

        List<Integer> list = new ArrayList<>();
        for (int c : finalInput[0]) {
            list.add(c);
        }

        Boolean flag = false;

        for (int i = 1; i < finalInput.length; i++) {

            List<Integer> subList = new ArrayList<>();
            for (int c : finalInput[i]) {
                subList.add(c);
            }

            if (list.containsAll(subList)) {

                flag = true;

            } else {
                break;
            }

        }

        System.out.println(flag);

    }

    static int[][] transpose(int[][] mat, int row,
            int col) {

        // Stores the transpose
        // of matrix mat[][]
        int[][] tr = new int[col][row];

        // Traverse each row of the matrix
        for (int i = 0; i < row; i++) {

            // Traverse each column of the matrix
            for (int j = 0; j < col; j++) {

                // Transpose matrix elements
                tr[j][i] = mat[i][j];
            }
        }
        return tr;
    }

    // Function to sort the given
    // matrix in row wise manner
    static void RowWiseSort(int[][] B) {

        // Traverse the row
        for (int i = 0; i < (int) B.length; i++) {

            // Row - Wise Sorting
            Arrays.sort(B[i]);
        }
    }

    // Function to print the matrix
    // in column wise sorted manner
    static void sortCol(int[][] mat, int N, int M) {

        // Function call to find transpose
        // of the matrix mat[][]
        int[][] B = transpose(mat, N, M);

        // Sorting the matrix row-wise
        RowWiseSort(B);

        // Calculate transpose of B[][]
        mat = transpose(B, M, N);

        // Print the matrix mat[][]
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}