//#Exercise 12. Functional Interfaces and Lambda Expressions
public class FunctionalInterfacesAndLambdaExpressions {
    @FunctionalInterface
    interface MathOperation {
        int calculate(int a, int b);
    }

    public static int applyOperations (int a, int b, MathOperation operation) {
        return operation.calculate(a,b);
    }

    public static void demonstrateLambdas() {
        MathOperation addition = Integer::sum;
        MathOperation multiplication = (int x, int y) -> x*y;
        MathOperation substraction = (int x, int y) -> x-y;

        System.out.println("Addition: " + applyOperations(5, 3, addition));
        System.out.println("Multiplication: " + applyOperations(5, 3, multiplication));
        System.out.println("Substraction: " + applyOperations(5, 3, substraction));
    }

}
