package level3;

public class TwoSum2 {
    public static void main(String[] args){
        System.out.println(returnArrayOfIndices(new int[]{2, 7, 11, 15}, 9));
    }

    public static int[] returnArrayOfIndices(int[] input, int target){
        int i = 0;
        int j = input.length - 1;


        while (i < j){
            int sum = input[i] + input[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            }
            else if (sum < target) {
                i++;
            }
            else {
                j--;
            }
        }

        return new int[]{i+1, j+1};
    }
}
