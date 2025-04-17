import java.util.Scanner;

public class EISUBARRAY_subarrayWithTheLargestSum_ver2 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }
        long res = findMaxSumSubArray(arr);
        System.out.println(res);

    }
    static long findMaxSumSubArray(long[] arr) {
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        long currentMax = 0;
        long currentMin = 0;
        for (long num : arr) {

            currentMax = Math.max(num, currentMax + num);
            max = Math.max(max, currentMax);
            currentMin = Math.min(num, currentMin + num);
            min = Math.min(min, currentMin);
        }
        return Math.max(Math.abs(max), Math.abs(min));
    }
}
