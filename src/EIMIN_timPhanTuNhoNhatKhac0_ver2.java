import java.util.Arrays;
import java.util.Scanner;

public class EIMIN_timPhanTuNhoNhatKhac0_ver2 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        String res = findMinElements(arr, k);
        System.out.println(res);
    }

    public static String findMinElements(int arr[], int k) {
        for (int i = 0; i < k; i++) {
            Arrays.sort(arr);
            int min = arr[arr.length - 1];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != 0) {
                    min = Math.min(min, arr[j]);
                }
            }

            sb.append(min).append("\n");
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != 0) {
                    arr[j] -= min;
                }
            }

        }
        return sb.toString();
    }
    
}