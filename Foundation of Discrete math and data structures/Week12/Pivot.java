package Week12;

class Pivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];     // здесь будет результат
        int idx = 0;                // куда в ans вставлять следующее число

        // 1) вставляем все числа, которые меньше pivot
        for (int num : nums) {
            if (num < pivot) {
                ans[idx] = num;     // кладём в ans
                idx++;              // двигаемся дальше
            }
        }

        // 2) вставляем числа, равные pivot
        for (int num : nums) {
            if (num == pivot) {
                ans[idx] = num;
                idx++;
            }
        }

        // 3) вставляем числа, больше pivot
        for (int num : nums) {
            if (num > pivot) {
                ans[idx] = num;
                idx++;
            }
        }

        return ans;  // возвращаем перестроенный массив
    }
}
