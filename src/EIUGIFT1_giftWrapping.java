import java.util.Arrays;
import java.util.Scanner;

public class EIUGIFT1_giftWrapping {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] giftSize = new int[n];
        for (int i = 0; i < n; i++) {
            giftSize[i] = sc.nextInt();
        }

        int[] paperSize = new int[m];
        for (int j = 0; j < m; j++) {
            paperSize[j] = sc.nextInt();
        }

        Arrays.sort(giftSize);
        Arrays.sort(paperSize);
        int maxWrappable = maxWrappableGifts(n, m, giftSize, paperSize);
        System.out.println(maxWrappable);
        sc.close();
    }

    public static int maxWrappableGifts(int n, int m, int[] giftSize, int[] paperSize) {
        int giftCount = 0;
        int paperCount = 0;
        int wrappedCount = 0;

        while (giftCount < n && paperCount < m) {
            if (paperSize[paperCount] >= 2 * giftSize[giftCount] && paperSize[paperCount] <= 3 * giftSize[giftCount]) {
                wrappedCount++;
                giftCount++;
                paperCount++;
            } else if (paperSize[paperCount] < 2 * giftSize[giftCount]) {
                paperCount++;
            } else {
                giftCount++;
            }
        }

        return wrappedCount;
    }
}