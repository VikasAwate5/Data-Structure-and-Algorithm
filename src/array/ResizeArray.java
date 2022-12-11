package src.array;

//Resize an array to any length.

public class ResizeArray {

    public static int[] resizeArray(int[] arr, int newSize) {
        int[] temp = new int[newSize];
        int i = 0;
        while (i < arr.length) {
            temp[i] = arr[i];
            i++;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 6, 8, 9};

        System.out.println("Before resize : " + arr.length);

        arr = resizeArray(arr, 10);

        System.out.println("After resize : " + arr.length);
    }

}
