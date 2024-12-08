import java.util.*;

public class Pairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextInt());
        }

        int count = 0;
        for (int num : set) {
            if (set.contains(num + k)) {
                count++;
            }
        }

        // Output the result
        System.out.println(count);
    }
}
