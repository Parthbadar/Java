public class Add2Darray {
  
    //addition of two 2D arrays (matrices).
    public static void main(String[] args) {

        int[][] arr1 = {
            {1, 2},
            {3, 2}
        };

        int[][] arr2 = {
            {3, 1},
            {3, 2}
        };

        int[][] sumMatrix = {
            {0, 0},
            {0, 0}
        };

        System.out.println("******************** ARRAY 1 ********************");

        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                System.out.print(arr1[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("******************** ARRAY 2 ********************");

        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                System.out.print(arr2[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("******************** sumMatrix ********************");

        for (int row = 0; row < sumMatrix.length; row++) {
            for (int col = 0; col < sumMatrix[row].length; col++) {
                System.out.print(sumMatrix[row][col] + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < sumMatrix.length; row++) {
            for (int col = 0; col < sumMatrix[row].length; col++) {
                sumMatrix[row][col] = arr1[row][col] + arr2[row][col];
            }
            System.out.println();
        }

        for (int row = 0; row < sumMatrix.length; row++) {
            for (int col = 0; col < sumMatrix[row].length; col++) {
                System.out.print(sumMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}

