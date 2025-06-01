package Informatics;

import java.util.Scanner;

public class Max2Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int max = Math.max(a, b);

        System.out.println(max);
    }

}
