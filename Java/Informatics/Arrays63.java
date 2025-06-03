package Informatics;

import java.util.Scanner;

public class Arrays63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i =0; i< n; i++) {
            array [i] = scanner.nextInt()
        }
        for(int i=0; i<n; i+= 2) {
            System.out.println(array[i] + i);
        }
    }

}
