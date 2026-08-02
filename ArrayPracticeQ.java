public class ArrayPracticeQ {
    public static void main(String[] args) {
        int [] num = {14,  24, 35 ,2,4};
        int even = 0;
        int odd = 0;

        for(int i= 0; i < num.length; i++){
            System.out.println("Data number ->" + num[i]);
            if(num[i] % 2 == 0){
                even += 1;
            }
            else {
                odd += 1;
            }

        }
        System.out.println("even number -->" + even);
        System.out.println("odd number -->" + odd);
    }
}
