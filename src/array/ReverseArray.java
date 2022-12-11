package src.array;

//Reverse an array.

public class ReverseArray {

    public static void printArray(int[] array) {
        System.out.println();
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
    }

    public static int[] reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }


    public static void main(String[] args) {
        int[] array = {2, 5, 7, 6, 3, 4};
        printArray(array);

        int[] arr = reverseArray(array, 0, array.length - 1);
        printArray(arr);
    }
}
