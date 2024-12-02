import java.util.Scanner;

public class LaunchOfCollider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfParticles = sc.nextInt();
        String colliders = sc.next();
        int[] sequence = new int[numOfParticles];

        for (int i = 0; i < numOfParticles; i++) {
            sequence[i] = sc.nextInt();
        }

        int minTime = Integer.MAX_VALUE;
        int lastRightIndex = -1;

        for (int i = 0; i < numOfParticles; i++) {
            if (colliders.charAt(i) == 'R') {
                lastRightIndex = i;
            } else if (colliders.charAt(i) == 'L' && lastRightIndex != -1) {
                int time = (sequence[i] - sequence[lastRightIndex]) / 2;
                minTime = Math.min(minTime, time);
            }
        }

        if (minTime == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(minTime);
        }
    }
}

