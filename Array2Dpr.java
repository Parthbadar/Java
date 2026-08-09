public class Array2Dpr {
    public static void main(String[] args) {
        int [][] evenodd = {
            {1,2},
            {3,2}
        };
        int even = 0;
        int odd = 0;

        for(int row=0; row<evenodd.length; row++){
            for(int col=0; col<evenodd[row].length; col++){

                if(evenodd[row][col] % 2 == 0){
                    even = even +1;
                } else {
                    odd = odd + 1;
                }
            }
        }
        System.out.println("even num --->" + even);
        System.out.println("even num --->" + odd);
    }
}
