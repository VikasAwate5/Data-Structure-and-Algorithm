package src.array;

//Find a missing number from an array with length n.

public class MissingNumber {
    public static int findMissingNumber(int[] array) {
        int n = array.length + 1;
        int sum = n * (n + 1) / 2;
        int i = 0;
        while (i < array.length) {
            sum -= array[i];
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 7, 6, 4, 8, 5};
        int missing = findMissingNumber(array);
        System.out.println(missing);
    }
}
