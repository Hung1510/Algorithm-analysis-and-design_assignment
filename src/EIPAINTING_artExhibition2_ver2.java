import java.util.HashMap;
import java.util.Scanner;

public class EIPAINTING_artExhibition2_ver2 {
    static Scanner sc = new Scanner (System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }
        int maxOccurenceNumber = 1;

        for (HashMap.Entry<Integer, Integer> entries : hm.entrySet()) {
            if (entries.getValue() > maxOccurenceNumber) {
                maxOccurenceNumber = entries.getValue();
            }
        }
        System.out.println(n - maxOccurenceNumber);
    }
    
}