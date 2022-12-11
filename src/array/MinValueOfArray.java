package src.array;

//Find Minimum value present in array.

public class MinValueOfArray {
    public static int getMinimumValue(int[] array) {
        int i = 0;
        int min = array[0];
        while (i < array.length) {
            if (min > array[i]) {
                min = array[i];
            }
            i++;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {5, 7, 3, 8, 45, 76, 12, 4, 56};
        int minValue = getMinimumValue(array);
        System.out.println("Minimum value : " + minValue);
    }
}
