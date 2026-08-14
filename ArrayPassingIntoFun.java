public class ArrayPassingIntoFun {
    public static void displayArray(int [] arr, int noOfArray) {
        System.out.println("Array Number--> " + noOfArray);

        for(int value:arr){
            System.out.println("Data--> " + value);
        }
    }
    public static void main(String[] args) {
        int  arr1 []= {1,2,3,4,5};
        int arr2 []= {11,22,33,44,55};
        int arr3 []= {12,22,323};

        displayArray(arr1, 1);
        displayArray(arr2, 2);
        displayArray(arr3, 3);
    }
}
