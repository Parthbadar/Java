public class TwoArraypractice16 {
    public static void main(String[] args) {
        String [][] matrix = {
            {"parth","sarthak"},
            {"sumit","suraj","jayesh"},
        };

        for(int row = 0; row<matrix.length; row+=1){
            for(int col = 0; col<matrix[row].length; col+=1) {
                System.out.print(matrix[row][col]+ "    ");
            }
            System.out.println();
        }
    }
}
