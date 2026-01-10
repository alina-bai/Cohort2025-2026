//public class JavaExercisesSolutions {
//    //Exercise 1: Variable Declaration and Basic Operations
//        public static String calculateOperations(int a, int b) {
//            int sum = a + b;
//            int difference = a - b;
//            int product = a * b;
//            return String.format("Sum: %d, Difference: %d, Product: %d", sum, difference, product);
//        }
//    }
//    //Exercise 2: Basic Method and Conditionals
//    public static boolean isLeapYear(int year) {
//        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//    }
//
//    // Exercise 3: FOr Loops and String Manipulations
//    public static String reverseString(String Input) {
//        if(input == null) return null;
//        char[] chars = input.toCharArray();
//        for(int i= 0; i< chars.length / 2; i++) {
//            char temp = chars[i];
//            chars[i] = chars[chars.length - 1 - i];
//            chars[chars.length -1 - i] = temp;
//        }
//        return new String(chars);
//    }
//
//    //Exercise 4:  Array Proccessing
//public  static Integer findsecondLargest(int[] array) {
//    if (array == null || array.length < 2) {
//        return null;
//    }
//    int largest = Integer.MIN_VALUE;
//    int secondLargest = Integer.MIN_VALUE;
//
//    for(int num : array) {
//        if (num > largest) {
//            secondLargest = largest;
//            largest = num;
//        } else if (num > secondLargest && num != largest) {
//            secondLargest = num;
//        }
//    }
//    return secondLargest == Integer.MIN_VALUE ? null : secondLargest;
//    }
//
//
//
//
//
//
//
//
