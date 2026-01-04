package DataStructuresAndAlgorithms.Week14Arrays;

public class SortArrayByParity922 {
    public int[] sortArrayByParityII(int[] A) {
        int i = 0;
        int j = 1;
        int n = A.length;

        while (i < n && j < n) {
            while (i < n && A[i] % 2 == 0) {
                i += 2;
            }
            while (j < n && A[j] % 2 == 1) {
                j += 2;
            }
            if (i < n && j < n) {
                swap(A, i, j);
            }
        }
        return A;
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }


    public static void main(String[] args) {
        SortArrayByParity922 solution = new SortArrayByParity922();

        int [] originalArray = {4,2,5,7};
        // 3. Выводим исходный массив
        System.out.print("Исходный массив: ");
        printArray(originalArray);

        // 4. Вызываем метод сортировки
        int[] sortedArray = solution.sortArrayByParityII(originalArray);

        // 5. Выводим отсортированный массив
        System.out.print("Отсортированный массив: ");
        printArray(sortedArray);

        // Дополнительный пример
        int[] anotherArray = {1, 3, 2, 4};
        System.out.print("\nИсходный массив: ");
        printArray(anotherArray);

        int[] sortedAnotherArray = solution.sortArrayByParityII(anotherArray);
        System.out.print("Отсортированный массив: ");
        printArray(sortedAnotherArray);
    }

    // Вспомогательный метод для красивого вывода массива
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}