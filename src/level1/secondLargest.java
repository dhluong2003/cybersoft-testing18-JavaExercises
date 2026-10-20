package level1;
// bài tập 2

public class secondLargest {
    public static void main(String[] args){
        int[] test = {5, 5};

        System.out.println("Giá trị lớn thứ hai trong mảng: " + secondLargestValue(test));

    }

    public static int secondLargestValue(int[] input){
        int length = input.length;
        int largest = -99999;
        int secondLargest = -99999;

        if (length < 2 ){
            return Integer.MIN_VALUE;
        }
        for (int i = 0; i < length; i++){
            if (input[i] > largest){
                largest = input[i];
            }
        }
        for (int i = 0; i < length; i++){
            if ( (input[i] > secondLargest) && (input[i] < largest) ){
                secondLargest = input[i];
            }
        }
        return secondLargest;
    }
}
