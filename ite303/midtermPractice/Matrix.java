package midtermPractice;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        swapOffDiagonalElements(matrix);

        System.out.println("\nMatrix after off-diagonal swap:");
        printMatrix(matrix);
    }

    private static void swapOffDiagonalElements(int[][] matrix) {
        int n = matrix.length; // Assuming the matrix is square
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap elements off the main diagonal
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
