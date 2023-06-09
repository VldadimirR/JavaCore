package Lesson2.Homework;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 2, 3, 4};
        int[] arr2 = new int[]{2, 2, 0};
        int[] arr3 = new int[]{1, 3, 5};

        System.out.println(countEvens(arr));
        System.out.println(countEvens(arr2));
        System.out.println(countEvens(arr3));
    }

    public static int countEvens(int[] arr){
        int count = 0;
        for (int i: arr) {
            if (i % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
