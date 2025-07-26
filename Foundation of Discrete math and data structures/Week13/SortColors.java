package Week13;

//import static java.util.Collections.swap;

public class SortColors {
    public void sortColors(int[] nums) {
        int zeroInsertPos = 0;
        int twoInsertPos = nums.length - 1;
        int i = 0;

        while (i <= twoInsertPos) {
            if (nums[i] == 0) {
                swap(nums, zeroInsertPos, i);
                zeroInsertPos++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, twoInsertPos);
                twoInsertPos--;
            }
        }
    }
        private void swap ( int[] a, int i, int j){
            int t = a[i];
            a[i] = a[j];
            a[j] = t;

    }
}
