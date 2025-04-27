package Week3;

public class FactorialExample {
    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorail of number: "+ number + result);

    }

    public static int factorial(int n){
        if (n==1){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }

}
