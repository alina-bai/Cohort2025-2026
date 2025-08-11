package DataStructuresAndAlgorithms.Week14Arrays;

class RangeSumQuery304 {
        private long[][] prefix;                      // 2

        public RangeSumQuery304(int[][] matrix) {            // 3
            int m = matrix.length;                    // 4
            int n = (m > 0 ? matrix[0].length : 0);   // 5
            prefix = new long[m + 1][n + 1];          // 6

            for (int i = 0; i < m; i++) {             // 7
                for (int j = 0; j < n; j++) {         // 8
                    prefix[i + 1][j + 1] = matrix[i][j]
                            + prefix[i][j + 1]           // сумма сверху
                            + prefix[i + 1][j]           // сумма слева
                            - prefix[i][j];              // убираем двойной пересчёт
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) { // 9
            return (int)(prefix[row2 + 1][col2 + 1]
                    - prefix[row1][col2 + 1]
                    - prefix[row2 + 1][col1]
                    + prefix[row1][col1]);              // 10
        }

public  static void main(String[] args) {
    // Создаем тестовую матрицу (двумерный массив)
    int[][] matrix = {
            {3, 0, 1, 4, 2},
            {5, 6, 3, 2, 1},
            {1, 2, 0, 1, 5},
            {4, 1, 0, 1, 7},
            {1, 0, 3, 0, 5}
    };

    // Создаем объект NumMatrix и передаем матрицу в конструктор
    RangeSumQuery304 obj = new RangeSumQuery304(matrix);

    // Пример использования метода sumRegion
    System.out.println(obj.sumRegion(2, 1, 4, 3)); // Ожидаем 8
    System.out.println(obj.sumRegion(1, 1, 2, 2)); // Ожидаем 11
    System.out.println(obj.sumRegion(1, 2, 2, 4)); // Ожидаем 12
}
}




