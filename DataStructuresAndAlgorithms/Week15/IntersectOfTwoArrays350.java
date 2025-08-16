package DataStructuresAndAlgorithms.Week15;

import java.util.ArrayList;
import java.util.List;

public class IntersectOfTwoArrays350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        List<Integer> ans = new ArrayList<Integer>();
        for(int i=0; i< n; i++) {
            for( int j=0; j<m; j++){
                if (nums1[i] == nums2[j]) {
                    ans.add(nums1[i]);// O(1) in average
                    nums2[j] = -1;
                    break;
                }
            }
        }

        // O(n * m)
        int[] answer = new int[ans.size()];

        int ind = 0;
        for (Integer x : ans) {
            answer[ind] = x;
            ind++;
        }
        // O(min(n, m))
        return answer;
    }
}