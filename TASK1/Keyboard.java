import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);
        int value = 1 ;
        if(letter == 'R' ) {
            value = -1;
        }
        else value = 1;
        String str = sc.next();
        String str1= "qwertyuiop asdfghjkl;zxcvbnm,./";
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i < str.length() ; i++) {
            char ll = str.charAt(i);
            int index = str1.indexOf(ll);
            if(index == 0 && value == -1 )  stringBuilder.append(str1.charAt(str1.length() + value));
            else if(index == str1.length()-1 && value == 1 ) stringBuilder.append(str1.charAt(0));
            else stringBuilder.append( str1.charAt( index + value ) );
        }
        System.out.println(stringBuilder);
    }
}
