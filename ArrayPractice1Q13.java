public class ArrayPractice1Q13 {
    public static void main(String[] args) {

        // claculate postivie and negative numbers in an array
        int [] num = {1, 2, -1, -2, 2};
        int positiveCount = 0;
        int negativeCount = 0;


        for(int index = 0; index < num.length; index++){
            System.out.println("Data number " + num[index]);
            if(num[index] > 0){
                positiveCount++;
            } else if(num[index] < 0){
                negativeCount++;
            }
        }
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);

    }
}
