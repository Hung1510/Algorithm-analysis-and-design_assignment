import java.util.Arrays;
import java.util.Scanner;

public class EIPAGES_pageNumber_ver2 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int i, j;
        int count;
        for (i = 0; i < n; i++) {
            count = 0;
            for (j = i + 1; j < n; j++) {
                if (arr[j] - arr[j - 1] != 1) {
                    break;
                }
                count++;
            }
            if (count > 1) {
                sb.append(arr[i]).append("-" + arr[count + i]).append(" ");
                i += count;
            } else if (count == 1) {
                sb.append(arr[i]).append(" ").append(arr[i + count]).append(" ");
                i += count;
            } else if (count == 0) {
                sb.append(arr[i]).append(" ");
            }
        }
        System.out.println(sb);

    }
}