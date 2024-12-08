import java.util.*;

public class NumberOfPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {

            int n = scanner.nextInt();
            int l = scanner.nextInt();
            int r = scanner.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            Arrays.sort(arr);
            System.out.println(countPairs(arr, r) - countPairs(arr, l - 1));
        }
    }

    private static long countPairs(int[] arr, int x) {
        long count = 0;
        for (int i = 0; i < arr.length; i++) {
            int limit = x - arr[i];
            int index = upperBound(arr, i + 1, arr.length, limit);
            count += (index - (i + 1));
        }
        return count;
    }

    private static int upperBound(int[] arr, int start, int end, int value) {
        int low = start, high = end;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
