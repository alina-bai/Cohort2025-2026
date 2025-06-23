package Week11;
import java.util.Map;
import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if(entry.getValue() > nums.length / 2) {
                return  entry.getKey();
            }
        }
        return Integer.MIN_VALUE;

    }

}
