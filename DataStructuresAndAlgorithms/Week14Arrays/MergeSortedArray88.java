package DataStructuresAndAlgorithms.Week14Arrays;

public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }


public static void main(String[] args) {
    MergeSortedArray88 solution = new MergeSortedArray88();
// 2. Set up the input arrays and their sizes
    int[] nums1 = {1,2,3,0,0,0};
    int m = 3;
    int[] nums2 = {2,5,6};
    int n = 3;

    // 3. Print the initial state of the arrays
    System.out.print("Initial nums1: ");
    printArray(nums1, m);
    System.out.print("nums2: ");
    printArray(nums2, n);

    // 4. Call the merge method to sort the arrays
    solution.merge(nums1, m, nums2, n);

    // 5. Print the final, merged array
    System.out.print("Merged array: ");
    printArray(nums1, m + n);
}

// A helper method to print an array up to a given length
public static void printArray(int[] arr, int length) {
    System.out.print("[");
    for (int i = 0; i < length; i++) {
        System.out.print(arr[i]);
        if (i < length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");
}
}



