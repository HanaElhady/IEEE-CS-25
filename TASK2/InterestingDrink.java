import java.io.*;
import java.util.*;

public class InterestingDrink {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();

        int numOfShops = reader.nextInt();
        int[] pricesOnIDays = new int[numOfShops];
        for (int i = 0; i < numOfShops; i++) {
            pricesOnIDays[i] = reader.nextInt();
        }

        int numOfDays = reader.nextInt();
        Arrays.sort(pricesOnIDays);

        for (int i = 0; i < numOfDays; i++) {
            int coins = reader.nextInt();
            int left = 0;
            int right = pricesOnIDays.length;


            while (left < right) {
                int mid = left + (right - left) / 2;
                if (pricesOnIDays[mid] <= coins) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            System.out.println(left);
        }
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

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}