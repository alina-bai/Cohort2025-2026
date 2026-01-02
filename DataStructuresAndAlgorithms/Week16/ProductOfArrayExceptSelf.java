package DataStructuresAndAlgorithms.Week16;
//Leetcode 238
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int [] answer = new int[n];

        int prefix = 1;
        for (int i = 0; i< n; i++) {
            answer[i]= prefix;
            prefix*=nums[i];
        }

        int suffix = 1;
        for (int i=n-1; i>=0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;

    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf solver = new ProductOfArrayExceptSelf();

        int[] nums = {1,2,3,4};
        int[]result = solver.productExceptSelf(nums);

        System.out.print("Final answer:  [");
        for (int i=0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

    }

}


