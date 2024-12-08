import java.io.*;
import java.util.*;

public class AliceBobAndChocolate {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();

        int numOfBars = reader.nextInt();

        int[] times = new int[numOfBars];
        for (int i = 0; i < numOfBars; i++) {
            times[i] = reader.nextInt();
        }

        int left = 0, right = numOfBars - 1;
        int aliceTime = 0, bobTime = 0;
        int aliceChocolates = 0, bobChocolates = 0;

        while (left <= right) {
            if (aliceTime <= bobTime) {
                aliceTime += times[left];
                aliceChocolates++;
                left++;
            } else {
                bobTime += times[right];
                bobChocolates++;
                right--;
            }
        }

        System.out.println(aliceChocolates + " " + bobChocolates);
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
