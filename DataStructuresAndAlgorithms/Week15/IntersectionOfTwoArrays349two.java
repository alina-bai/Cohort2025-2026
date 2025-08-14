package DataStructuresAndAlgorithms.Week15;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays349two {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1); // O(n log n)
        Arrays.sort(nums2); // O(m log m)

        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                // Избегаем дубликатов
                if (result.isEmpty() || result.get(result.size() - 1) != nums1[i]) {
                    result.add(nums1[i]);
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        // Преобразуем список в массив
        int[] ans = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            ans[k] = result.get(k);
        }
        return ans;
    }
}

