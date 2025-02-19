import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int[] luckyNumbers = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isLucky(num) || almostLucky(num)) {
            System.out.println("YES");
        }
        else System.out.println("NO");

    }
    public static boolean isLucky(int num) {
        for(int i = 0 ; i < luckyNumbers.length ;i++) {
            if(luckyNumbers[i] < num) break;
            if(luckyNumbers[i] == num ) return true;
       }
        return false;
    }
    public static boolean almostLucky (int num) {
        for(int i = 0 ; i < luckyNumbers.length ;i++) {
            if (num % luckyNumbers[i] == 0) return true;
        }
        return false;
    }
}
