package level1;
// bài tập 3

import java.util.Scanner;

public class sumEvenNumbersUpToN {
    public static void main(String[] args){
//        pass;
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Tổng các số chẵn từ 0 tới n: " + sumEvenNumbers(n));
    }

    public static int sumEvenNumbers(int n){
        if (n < 0){
            throw new IllegalArgumentException("n phải >= 0");
        }
        int sum = 0;
        for (int i = 0; i <= n; i += 2){
            sum += i;
        }
        return sum;
    }
}
