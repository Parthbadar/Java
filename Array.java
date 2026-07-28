public class Array {
    public static void main(String[] args) {
        int [] parth = {10,2,3,4};

        for (int index = 0; index<parth.length; index+=1)
        {
            int squ = parth[index]*parth[index];
            int cub = parth[index]*parth[index]*parth[index];
            System.out.println("Data-->" + parth[index] + "squ-->" + squ + "cub-->"+ cub);
        }
    }
}
