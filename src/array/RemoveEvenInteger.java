package src.array;

//Remove even number from an array.

class RemoveEvenInteger {

    public static void printArray(int[] arr) {
        System.out.println();
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i]);
            i++;
        }
    }

    public static int[] removeEvenNumber(int[] arr) {
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount += 1;
            }
        }

        int[] result = new int[oddCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index += 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 4, 7, 9, 5};

        printArray(arr);
        printArray(removeEvenNumber(arr));

    }
}