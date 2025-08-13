package DataStructuresAndAlgorithms.Week14Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        // 1️⃣ Получаем длины массивов
        int n = nums1.length;
        int m = nums2.length;
        // 2️⃣ Создаём множество для хранения уникальных элементов из nums1
        Set<Integer> set_1 = new HashSet<Integer>();
        // 3️⃣ Создаём множество для хранения результата (пересечения)
        Set<Integer> ans = new HashSet<Integer>();

        // 4️⃣ Добавляем все элементы из nums1 в set_1
        for (int i = 0; i < n; i++) {
            set_1.add(nums1[i]); // O(1) в среднем
        }
        // 🔹 Сложность этого цикла: O(n)

        // 5️⃣ Проходим по nums2 и проверяем, есть ли элемент в set_1
        for (int i = 0; i < m; i++) {
            if (set_1.contains(nums2[i])) { // O(1) в среднем
                ans.add(nums2[i]); // добавляем в пересечение
            }
        }
        // 🔹 Сложность этого цикла: O(m)

        // 6️⃣ Создаём массив для ответа размером ans.size()
        int[] answer = new int[ans.size()];

        // 7️⃣ Индекс для заполнения массива
        int ind = 0;

        // 8️⃣ Копируем элементы из ans в массив answer
        for (Integer x : ans) {
            answer[ind] = x;
            ind++;
        }

        // 9️⃣ Возвращаем результат
        return answer;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays349 sol = new IntersectionOfTwoArrays349();

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] result = sol.intersection(nums1,nums2);

        System.out.println(Arrays.toString(result));
    }
}