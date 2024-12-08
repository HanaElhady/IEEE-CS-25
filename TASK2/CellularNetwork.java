import java.io.*;
import java.util.*;

public class CellularNetwork {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();

        int numOfCities = reader.nextInt();
        int numberOfCellularTowers = reader.nextInt();

        int[] cities = new int[numOfCities];
        for(int i=0; i < numOfCities ; i++) {
            cities[i] = reader.nextInt();
        }

        int[] cellularTowers = new int[numberOfCellularTowers];
        for(int i=0; i < numberOfCellularTowers ; i++) {
            cellularTowers[i] = reader.nextInt();
        }
        int minimal  = 0 ;
        int right = 0 ;

        for(int left = 0 ; left < cities.length ; left++ ){
            while (right < numberOfCellularTowers - 1 &&
                    Math.abs(cellularTowers[right + 1] - cities[left]) <= Math.abs(cellularTowers[right] - cities[left])) {
                right++;
            }
            minimal = Math.max(minimal, Math.abs(cellularTowers[right] - cities[left]));
        }

        System.out.println(minimal);
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
