import java.util.Arrays;
import java.util.Scanner;

public class EIUGIFT1_giftWrapping_ver2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] gifts = new int[n];
        int [] wrapperPapper = new int[m];

        for (int i = 0; i < n; i++) {
            gifts[i] =  sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            wrapperPapper[i] = sc.nextInt();
        }

        Arrays.sort(gifts);
        Arrays.sort(wrapperPapper);
        int i = 0;
        int j = 0;
        int count =  0;
        while ( i < n  && j <  m) {
            if (  gifts[i] * 2 <= wrapperPapper[j]  && gifts[i] * 3 >= wrapperPapper[j]    ) {
                count++;
                i++;
                j++;
            } else if ( gifts [i] * 3 >  wrapperPapper[j]) {
                j++;
            } else {
                i++;
            }
        }
        System.out.println(count);
    }
}