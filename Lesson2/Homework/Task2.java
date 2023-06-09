package Lesson2.Homework;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 2, 3, 4};
        int[] arr2 = new int[]{2, 2, 0};
        int[] arr3 = new int[]{1, 3, 5};

        System.out.println(findDiffMinMax(arr));
        System.out.println(findDiffMinMax(arr2));
        System.out.println(findDiffMinMax(arr3));

    }

    public static int findDiffMinMax(int[] arr){
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int min = arr[0];
        return max - min;
    }
}
