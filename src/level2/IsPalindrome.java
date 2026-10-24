package level2;

import java.util.Locale;
import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("Chuỗi có đối xứng không: " + palindromeCheck(input));
    }

    public static boolean palindromeCheck(String input){
        StringBuilder sb = new StringBuilder();
        for (char s: input.toCharArray()){
            if (Character.isLetterOrDigit(s)){
                sb.append(s);
            }
        }
        input = sb.toString().toLowerCase().strip();

        int length = input.length();
        if ( length == 0 ) {
            return true;
        }
        int i = 0;
        int j = length - 1;
        while (i <= j){
            if ( input.charAt(i) != input.charAt(j) ){
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}
