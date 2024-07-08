import java.lang.reflect.Array;

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
    
    public int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }            
        }
        return secondMax;
    }

    public void moveZeros(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }

    
    public int[] resize(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public int findMissing(int[] arr) {
        int capacity = arr.length + 1;
        int sum = (capacity * (capacity + 1)) / 2;
        for(int i = 0; i < arr.length; i++) {
            sum -= arr[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        ArrayUtil arrUtil = new ArrayUtil();
        int[] arr = {1, 2, 4, 3, 6, 7, 8};
        // //print
        // arrUtil.printArray(new int[] {5, 1, 2, 9, 10});

        // //remove Even
        // int[] oddArr = arrUtil.removeEven(arr);
        
        // // reverse
        // arrUtil.printArray(arr);
        // arrUtil.reverseArry(arr, 0, arr.length - 1);
        // arrUtil.printArray(arr);

        // // minimum value
        // int min = arrUtil.minValue(arr);
        // System.out.println(min);

        // // second max value
        // arrUtil.printArray(arr);
        // int secondMax = arrUtil.findSecondMax(arr);
        // System.out.println(secondMax);

        // // moveZeros
        // arrUtil.printArray(arr);
        // arrUtil.moveZeros(arr);
        // arrUtil.printArray(arr);

        // // resize
        // System.out.println("Size of original " + arr.length);
        // arr = arrUtil.resize(arr, 2 * arr.length);
        // System.out.println("Size of resized " + arr.length);

        // fineMissing
        int missingOne = arrUtil.findMissing(arr);
        System.out.println("Missing one: " + missingOne);
    }

}
