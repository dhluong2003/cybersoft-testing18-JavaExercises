package level1;
// bài tập 5

import java.util.Scanner;

public class firstLetterOfEveryWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String test = sc.nextLine();

        System.out.println("Chuỗi sau khi chỉ giữ lại chữ cái đầu của mỗi từ: " + "\"" + firstLetterInWord(test) + "\"" );
    }
    public static String firstLetterInWord(String input){
        if ( input.length() == 0 ){
            return "";
        }
        String[] words = input.split(" ");
        char c;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++){
            c = words[i].charAt(0);
            sb.append(c).append(" ");
        }
        return sb.toString().trim();
    }

}
