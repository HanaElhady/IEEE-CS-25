//import java.util.Scanner;
//import java.util.Stack;
//
//public class Main {
//    public static void main(String[] args) {
//        Stack<Object> stack = new Stack<>();
//        // first text case 3 2 + 4 *
//        stack.add(3);
//        stack.add(2);
//        stack.add('+');
//        stack.add(4);
//        stack.add('*');
//        System.out.println(postfix(stack)); // Output should be 20
//
//        // second test case  5 1 2 + 4 * + 3 -
//        stack.add(5);
//        stack.add(1);
//        stack.add(2);
//        stack.add('+');
//        stack.add(4);
//        stack.add('*');
//        stack.add('+');
//        stack.add(3);
//        stack.add('-');
//        System.out.println(postfix(stack)); // Output should be 14
//    }
//
//    public static int postfix(Stack<Object> stack) {
//        Stack<Object> reversedStack = new Stack<>();
//        while (!stack.isEmpty()) {
//            reversedStack.push(stack.pop());
//        }
//
//        Stack<Integer> evaluationStack = new Stack<>();
//        while (!reversedStack.isEmpty()) {
//            Object current = reversedStack.pop();
//
//            if (current instanceof Integer) {
//                evaluationStack.push( (Integer) current);
//            } else if (current instanceof Character) {
//                char operator = (Character) current;
//
//                int secondOperand = evaluationStack.pop();
//                int firstOperand = evaluationStack.pop();
//
//                switch (operator) {
//                    case '+':
//                        evaluationStack.push(firstOperand + secondOperand);
//                        break;
//                    case '-':
//                        evaluationStack.push(firstOperand - secondOperand);
//                        break;
//                    case '*':
//                        evaluationStack.push(firstOperand * secondOperand);
//                        break;
//                    case '/':
//                        evaluationStack.push(firstOperand / secondOperand);
//                        break;
//                }
//            }
//        }
//        return evaluationStack.pop();
//    }
//}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
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
