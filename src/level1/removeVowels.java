package level1;
// bài tập 1

import java.util.Scanner;

public class removeVowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Xin nhập chuỗi: ");

        String s = sc.nextLine();
//        deleteVowels(s);
        System.out.println("Chuỗi sau khi bỏ các nguyên âm: " + deleteVowels(s));
    }

    public static String deleteVowels(String input){
        input = input.toLowerCase();
        if (input == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();

//        Set<Character> vowels = new HashSet<Character>(Arrays.asList("a", "e"));
        int length = input.length();
        for (int i = 0; i < length; i++){
            char c = input.charAt(i);

            if ((c != 'a') && (c != 'e') && (c != 'i') && (c != 'o') && (c != 'u')) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
