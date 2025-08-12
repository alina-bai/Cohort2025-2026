package DataStructuresAndAlgorithms.Week14Arrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays349 {
    public int[] intersection (int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Set<Integer> set_1 = new HashSet<Integer>();
        Set<Integer> ans = new HashSet<Integer>();

        for (int i = 0; i< n; i++) {
            set_1.add(nums1[i]); //O(1) in average
        }
        //O(n)

        for (int i = 0; i<m; i++) {
            set_1.contains(nums2[i]); //O(1) in average
        }

      //O(m)
    int[] answer = new int[ans.size()];

    int ind = 0;

    for (Integer x : ans) {
        answer [ind] = x;
        ind++;
    }
    return answer;
}
}
