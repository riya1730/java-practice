package dsa.arrays;

public class ArraySumMax {
    public static void main(String[] args) {

        int[] arr = {3, 7, 2, 9, 4};

        int sum = 0;
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("Max = " + max);
    }
}