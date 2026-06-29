import java.util.Arrays;

class Solution {

    public int minOperations(int[] nums, int[] numsDivide) {
        int gcdValue = numsDivide[0];
        for (int num : numsDivide) {
            gcdValue = gcd(gcdValue, num);
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (gcdValue % nums[i] == 0) {
                return i; 
            }
        }

        return -1; 
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

public class leetcode2344 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {2 ,3,4};
        int[] numsDivide = {6,18,12};

        int result = solution.minOperations(nums, numsDivide);

        System.out.println("Minimum deletions required: " + result);
    }
}
