package src.array;

//Move all zero element from an array to the last index of array.

public class MoveAllZeroToLastInArray {

    public static void printArray(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
    }

    public static int[] moveZerosToLast(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[j] == 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            if (array[j] != 0) {
                j++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 0, 4, 6, 0, 9};
        printArray(array);

        System.out.println();

        int[] result = moveZerosToLast(array);
        printArray(result);

    }
}
