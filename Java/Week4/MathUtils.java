package Week4;

public class MathUtils {
    static int operationCount;

    static {
        operationCount=0;
    }

    public  static int add (int number1,  int number2){
        operationCount++;
        return number1+number2;
    }

    public static void main(String[] args) {
        int sum = MathUtils.add(5,7);
        System.out.println("the sum of 2 numbers is: " + sum);
    }
}

