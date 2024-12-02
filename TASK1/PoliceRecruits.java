import java.util.Scanner;
import java.util.Stack;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfEvents= sc.nextInt();
        int[] separatedInt = new int[numOfEvents];
        for(int i = 0 ; i< numOfEvents ; i ++ ) {
            separatedInt[i] = sc.nextInt();
        }
        int untreated = 0 ;
        Stack<Integer> police = new Stack<Integer>();
        for(int i = 0 ; i < numOfEvents ; i++) {
            if(separatedInt[i] == -1 ) {
                if(police.isEmpty()) {
                    untreated++;
                }
                else {
                   int n = police.pop()-1;
                   if(n > 0 ) police.add(n);
                }
            }
            else {
                police.add(separatedInt[i]);
            }
        }
        System.out.println(untreated);
    }
}
