package Lesson2.Homework;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 0, 2, 0, 4};
        int[] arr2 = new int[]{2, 0, 0};
        int[] arr3 = new int[]{0, 0, 5};
        int[] arr4 = new int[]{2, 4, 2, 3, 4};


        System.out.println(findZeros(arr));
        System.out.println(findZeros(arr2));
        System.out.println(findZeros(arr3));
        System.out.println(findZeros(arr4));
    }

    public static boolean findZeros(int[] arr) {
        int previous = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (previous == 0 & arr[i] == 0) {
                return true;
            } else {
                previous = arr[i];
            }
        }
        return false;
    }
}
