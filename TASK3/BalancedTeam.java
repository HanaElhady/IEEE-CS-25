import java.io.*;
import java.util.*;

public class BalancedTeam {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        int numOfStudents = reader.nextInt();
        int[] skills = new int[numOfStudents];
        for(int i =0; i < numOfStudents ; i++){
            skills[i] = reader.nextInt();
        }
        int right = 0;
        int maxStudentsInTeam =0;
        Arrays.sort(skills);

        for(int left = 0 ; left < numOfStudents ; left++) {

            while(right < numOfStudents && skills[right] - skills[left] <= 5) {
                right++;
            }
            maxStudentsInTeam = Math.max(maxStudentsInTeam,right - left );
        }
        System.out.println(maxStudentsInTeam);

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

