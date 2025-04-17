import java.util.Scanner;

public class EISUBARRAY_subarrayWithTheLargsetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        
        System.out.println(maxAbsSubarraySum(arr));
    }

    static long maxAbsSubarraySum(long[] arr) {
        long maxSum = arr[0], minSum = arr[0];
        long currentMax = arr[0], currentMin = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSum = Math.max(maxSum, currentMax);
            currentMin = Math.min(arr[i], currentMin + arr[i]);
            minSum = Math.min(minSum, currentMin);
        }
        
        return Math.max(Math.abs(maxSum), Math.abs(minSum));
    }
}