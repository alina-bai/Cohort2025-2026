package DataStructuresAndAlgorithms.Week14Arrays;

public class SortColors75 {
    public void sortColors (int[] nums ) {
        int zeroInsertPos = 0;
        int twoInsertPos = nums.length-1;
        int i = 0;

        while (i <= twoInsertPos) {
            if (nums[i] == 0) {
                swap(nums, zeroInsertPos, i);
                zeroInsertPos++;
                i++;
            } else if (nums[i] ==1) {
                i++;
            }else {
                swap(nums, twoInsertPos, i);
                twoInsertPos--;
            }
        }
    }
    private void swap( int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        // 1. Создаем экземпляр класса Solution
        SortColors75 solution = new SortColors75();

        // 2. Инициализируем массив для сортировки
        int[] myArray = {2, 0, 2, 1, 1, 0};

        // 3. Выводим исходный массив, чтобы увидеть изменения
        System.out.print("Исходный массив: ");
        printArray(myArray); // Вспомогательный метод для печати

        // 4. Вызываем метод сортировки
        solution.sortColors(myArray);

        // 5. Выводим отсортированный массив
        System.out.print("Отсортированный массив: ");
        printArray(myArray); // Вспомогательный метод для печати
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



