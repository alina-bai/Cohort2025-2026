package Week3;
public class Calculator {
    public  static int sum (int a , int b) {
        return a+b;
    }
    public static double sum(double a, double b) {
        return a+b;
    }

    public static void main(String[] args) {
        int result1 = sum(6, 7);
        double result2 = sum(12.33, 23.88);

        System.out.println("Sum of 2 int: " + result1);
        System.out.println("Sum of 2 double: " + result2);
    }

}
