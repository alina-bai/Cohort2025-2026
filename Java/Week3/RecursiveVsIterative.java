package Week3;

public class RecursiveVsIterative {
    public static long IterativeFactorial (int n){
        long result = 1;
        for (int i = 2; i<=n; i++){
            result *= i;
        }
        return result;

    }

    public static long RecursiveFactorial (int n ) {
        if (n == 0 || n ==1){
            return 1;
        }else {
            return n * RecursiveFactorial(n-1);
        }

    }

    public static void main(String[] args) {
        int n =10;

        long iterativeResult = IterativeFactorial(n);
        long recursiveResult = RecursiveFactorial(n);

        System.out.println("Factorial: " + n + "iterative: " + iterativeResult);
        System.out.println("Factorial " + n + "recursive: " + recursiveResult);
    }

}
