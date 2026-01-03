package DataStructuresAndAlgorithms.Week15;

import java.util.*;

class SlidingWindow239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SlidingWindow239 sol = new SlidingWindow239();

        // Пример 1
        int[] nums1 = {1,3,-1,-3,5,3,6,7};
        int k1 = 3;
        int[] result1 = sol.maxSlidingWindow(nums1, k1);
        System.out.println("Пример 1: " + Arrays.toString(result1));
        // Ожидаем [3,3,5,5,6,7]

        // Пример 2
        int[] nums2 = {1};
        int k2 = 1;
        int[] result2 = sol.maxSlidingWindow(nums2, k2);
        System.out.println("Пример 2: " + Arrays.toString(result2));
        // Ожидаем [1]

        // Пример 3
        int[] nums3 = {9,10,9,-7,-4,-8,2,-6};
        int k3 = 5;
        int[] result3 = sol.maxSlidingWindow(nums3, k3);
        System.out.println("Пример 3: " + Arrays.toString(result3));
        // Ожидаем [10,10,9,2]
    }
}

