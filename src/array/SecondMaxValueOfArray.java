package src.array;

//Find Second Max value from an array.

public class SecondMaxValueOfArray {

    public static int secondMaxValueOfArray(int[] array) {
        int max = array[0];
        int secondMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                secondMax = max;
                max = array[i];
            } else if (secondMax < array[i] && max != array[i]) {
                secondMax = array[i];
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] array = {5, 7, 3, 8, 45, 76, 12, 4, 56, 60};

        int secondMax = secondMaxValueOfArray(array);

        System.out.println("Second max of Array : " + secondMax);
    }
}
