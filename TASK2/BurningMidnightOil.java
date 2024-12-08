import java.io.*;
import java.util.*;

public class BurningMidnightOil {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        int numOfLines = reader.nextInt();
        int k = reader.nextInt();
        long low = 1, high = numOfLines, result = -1;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long totalLines = 0;
            long current = mid;

            while (current > 0) {
                totalLines += current;
                current /= k;
            }

            if (totalLines >= numOfLines) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(result);
    }

    static class Reader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public Reader() {
            reader = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}

