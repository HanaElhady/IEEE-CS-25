import java.util.Arrays;
import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfSoldier = sc.nextInt();
        int[] height = new int[numOfSoldier];
        for (int i = 0; i < height.length; i++) {
            height[i] = sc.nextInt();
        }
        int[] sortedHeights = Arrays.copyOf(height, height.length);
        Arrays.sort(sortedHeights);
        int min = sortedHeights[0];
        int max = sortedHeights[height.length - 1];
        int ansMin = 0;
        int ansMax = 0;
        int maxIndex = 0;
        int minIndex = 0;
        boolean found = false;
        for (int i = 0; i < height.length; i++) {
            if (height[i] == max && !found) {
                ansMax = i;
                maxIndex = i;
                found = true;
            }
            if (height[i] == min) {
                ansMin = height.length - i - 1;
                minIndex = i;
            }
        }
        if (ansMax + ansMin == 0) {
            System.out.println(0);
            return;
        }
        int ans = ansMax + ansMin;
        if(maxIndex < minIndex) System.out.println(ans);
        else System.out.println(ans -1 );
    }
}
