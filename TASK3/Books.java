import java.io.*;
import java.util.*;

public class Books {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();

        int numOfBooks = reader.nextInt();
        int numberOfFreeMinutes = reader.nextInt();

        int[] minutes = new int[numOfBooks];
        for (int i = 0; i < numOfBooks; i++) {
            minutes[i] = reader.nextInt();
        }

        int right = 0;
        int c = 0;
        int currentTime = 0;

        for (int left = 0; left < numOfBooks; left++) {
            while (right < numOfBooks && currentTime + minutes[right] <= numberOfFreeMinutes) {
                currentTime += minutes[right];
                right++;
            }

            c = Math.max(c, right - left);
            currentTime -= minutes[left];
        }

        System.out.println(c);
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
