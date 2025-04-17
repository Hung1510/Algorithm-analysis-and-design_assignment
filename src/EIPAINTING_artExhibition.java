import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class EIPAINTING_artExhibition  {
    static InputReader sc = new InputReader(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        int maxFrequencies = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int count = frequencies.merge(x, 1, Integer::sum);
            if (count > maxFrequencies) maxFrequencies = count;
        }
        System.out.println(n - maxFrequencies);
    }

    static class InputReader {
        StringTokenizer tokenizer;
        BufferedReader reader;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public InputReader(FileInputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}