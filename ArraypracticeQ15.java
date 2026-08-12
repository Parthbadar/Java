public class ArraypracticeQ15 {

    // an array where each row can have a different number of columns.
    public static void main(String[] args) {
        int [][] matrix = {
            {1,2},
            {3,5,3,1,3},
            {9,6},
        };

        for(int row = 0; row<matrix.length; row+=1){
            for(int col = 0; col<matrix[row].length; col+=1) {
                System.out.print(matrix[row][col]+ "    ");
            }
            System.out.println();
        }
    }
}
