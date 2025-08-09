package DataStructuresAndAlgorithms.Week14Arrays;

public class RangeSumQuery303 {
    int[] prefix;

    public RangeSumQuery303 (int[] nums) {
        prefix = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i+1] = prefix[i] + nums[i];
        }
    }

    public int sumRange (int left, int right) {
        return prefix[right+1] - prefix[left];
    }

        public static void main(String[] args) {
            // Создаём массив, с которым будем работать
            int[] nums = {-2, 0, 3, -5, 2, -1};

            // Создаём объект класса NumArray и передаём в конструктор массив
            RangeSumQuery303 obj = new RangeSumQuery303(nums);

            // Вызываем sumRange для разных диапазонов и выводим результат
            System.out.println("sumRange(0, 2) = " + obj.sumRange(0, 2)); // (-2) + 0 + 3 = 1
            System.out.println("sumRange(2, 5) = " + obj.sumRange(2, 5)); // 3 + (-5) + 2 + (-1) = -1
            System.out.println("sumRange(0, 5) = " + obj.sumRange(0, 5)); // (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
        }
    }


