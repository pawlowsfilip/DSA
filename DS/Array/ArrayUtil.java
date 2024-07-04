public class ArrayUtil {

    public void printArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] removeEven(int[] arr) {
        int oddCount = 0;
        int arrLength = arr.length;

        for (int i = 0; i < arrLength; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        int[] result = new int[oddCount];
        int idx = 0;

        for (int i = 0; i < arrLength; i++) {
            if (arr[i] % 2 != 0) {
                result[idx] = arr[i];
                idx++;
            }
        }

        return result;
    }

    public void reverseArry(int[] numbers, int start, int end) {
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }


    public int minValue(int[] arr) {
        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        ArrayUtil arrUtil = new ArrayUtil();
        int[] arr = {3, 8, 4, 7, 2, 6, 5};
        // //print
        // arrUtil.printArray(new int[] {5, 1, 2, 9, 10});

        // //remove Even
        // int[] oddArr = arrUtil.removeEven(arr);
        
        // // reverse
        // arrUtil.printArray(arr);
        // arrUtil.reverseArry(arr, 0, arr.length - 1);
        // arrUtil.printArray(arr);

        // minimum value
        int min = arrUtil.minValue(arr);
        System.out.println(min);
    }

}
