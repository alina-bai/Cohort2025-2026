import java.awt.*;
import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.Collections.max;


class MentorshipExercises {
    //Exercise 1: Variable Declaration and Basic Operations
    public static String calculateOperations(int a, int b) {
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        return String.format("Sum: %d, Difference: %d, Product: %d", sum, difference, product);
    }

    //Exercise 2: Basic Method and Conditionals
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Exercise 3: FOr Loops and String Manipulations
    public static String reverseString(String Input) {
        if (Input == null) return null;
        char[] chars = Input.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        return new String(chars);
    }

    //Exercise 4:  Array Proccessing
    public static Integer findSecondLargest(int[] array) {
        if (array == null || array.length < 2) {
            return null;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest == Integer.MIN_VALUE ? null : secondLargest;
    }

    //Exercise 5: Basic class and Encapsulation
    static class BankAccount {

        private final String accountNumber;
        private double balance;
        private String ownerName;

        // Конструктор
        public BankAccount(String accountNumber, String ownerName, double balance) {
            this.accountNumber = accountNumber;
            this.ownerName = ownerName;
            this.balance = Math.max(0, balance); // не даём отрицательный баланс
        }

        // Геттеры
        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public String getOwnerName() {
            return ownerName;
        }

        // Сеттер
        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        // Методы работы со счётом
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }

        //Exercise 6: Constructor overloading and this keyword.
        public class BankAccountExtended extends BankAccount {
            public BankAccountExtended() {
                this("Default-001", "Unknown", 0.0);
            }

            public BankAccountExtended(String ownerName) {
                this(generateAccountNumber(), ownerName, 0.0);
            }

            public BankAccountExtended(String ownerName, double balance) {
                this(generateAccountNumber(), ownerName, balance);
            }

            public BankAccountExtended(String accountNumber, String ownerName, double balance) {
                super(accountNumber, ownerName, balance);
            }

            private static String generateAccountNumber() {
                return "ACC-" + System.currentTimeMillis() % 100000;
            }
        }

        //Exercise 7: Inharitance and Overriding
        public class SavingAccount extends BankAccount {
            private double interestRate;

            public SavingAccount(String accountNumber, String ownerName, double balance, double interestRate) {
                super(accountNumber, ownerName, balance);
                this.interestRate = interestRate;
            }

            public double getInterestRate() {
                return interestRate;
            }

            public void setInterestRate(double interestRate) {
                this.interestRate = interestRate;
            }

            public double calculateMonthlyInterest() {
                return getBalance() * (interestRate / 12 / 100);
            }

            public void applyInterest() {
                double interest = calculateMonthlyInterest();
                deposit(interest);
            }

            @Override
            public String toString() {
                return super.toString() + String.format(", Interest Rate: %.2f%%", interestRate);
            }
        }

        //exercise 8: Basic Generics
        public class BasicGenerics {
            static class Pair<T, U> {
                private T first;
                private U second;

                public Pair(T first, U second) {
                    this.first = first;
                    this.second = second;
                }

                public T getFirst() {
                    return first;
                }

                public U getSecond() {
                    return second;
                }

                public void setFirst(T first) {
                    this.first = first;
                }

                public void setSecond(U second) {
                    this.second = second;
                }

                @Override
                public String toString() {
                    return String.format("Pair{first=$s, second=$s}", first, second);
                }
            }
        }

        //#9 ArrayList and Enhanced For Loop
        public class ArrayListAndEnhancedFOrLoop {
            public static List<String> filterStrings(List<String> strings) {
                List<String> result = new ArrayList<>();
                for (String str : strings) {
                    if (str != null && str.length() > 3 && Character.isUpperCase(str.charAt(0))) {
                        result.add(str);
                    }
                }
                return result;
            }
        }

        //#10 HashMap Operations
        public static Character findMostFrequentCharacter(String input) {
            if (input == null || input.isEmpty()) {
                return null;
            }
            Map<Character, Integer> frequency = new HashMap<>();
            for (char c : input.toCharArray()) {
                // Integer value;
                frequency.merge(c, 1, Integer::sum);
            }
            return frequency.entrySet().stream()
                    .max(Map.Entry.comparingByValue())// Optional < Entry <...>>
                    .map(Map.Entry::getKey)  //Optional<Character>
                    .orElse(null);
        }

        //Exercise #11 Generic Methods and WildCards
        public static double sumNumbers(List<? extends Number> numbers) {
            return numbers.stream() //Stream<capture of extends Number>
                    .mapToDouble(Number::doubleValue)//DoubleStream
                    .sum();
        }

        //#Exercise 12. Functional Interfaces and Lambda Expressions
        @FunctionalInterface
        interface MathOperation {
            int calculate(int a, int b);
        }

        public static int applyOperations(int a, int b, MathOperation operation) {
            return operation.calculate(a, b);
        }

        public static void demonstrateLambdas() {
            MathOperation addition = Integer::sum;
            MathOperation multiplication = (int x, int y) -> x * y;
            MathOperation substraction = (int x, int y) -> x - y;

            System.out.println("Addition: " + applyOperations(5, 3, addition));
            System.out.println("Multiplication: " + applyOperations(5, 3, multiplication));
            System.out.println("Substraction: " + applyOperations(5, 3, substraction));
        }

        //Exercise 13: Stream Api - Basic Operations
        public static List<Integer> processNumbers(List<Integer> numbers) {
            return numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .map(n -> n * n)
                    .sorted(Collections.reverseOrder())
                    .collect(Collectors.toList());
        }
    }

    //Exercise 14: Stream API -Advanced with Collectors
    static class Person {
        private final String name;
        private final int age;
        private final String city;

        public Person(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getCity() {
            return city;
        }

        @Override
        public String toString() {
            return String.format("Person{name='%s', age=%d, age=%d, city='%s'}", name, age, city);
        }
    }

    public static Map<String, Double> calculateAverageAgeByCity(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(
                        Person::getCity,
                        Collectors.averagingInt(Person::getAge)
                ));
    }

    //Exercise 15: CustomComparator and Collections.sort()
    static class Student {
        private String name;
        private double grade;
        private int age;

        public Student(String name, double grade, int age) {
            this.name = name;
            this.grade = grade;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public double getGrade() {
            return grade;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("Student{name='%s', grade=%.1f, age=%d}", name, grade, age);
        }
    }

    public static void sortStudents(List<Student> students) {
        students.sort(
                Comparator.comparingDouble(Student::getGrade).reversed()
                        .thenComparingInt(Student::getAge)
        );
    }
}

//Exercise 16: Exception Handling and Custom Exceptions
class InsufficientFundException extends Exception {
    public InsufficientFundException(String message) {
        super(message);
    }

    public class BankAccountWithExceptions extends MentorshipExercises.BankAccount {
        public BankAccountWithExceptions(String accountNumber, String ownerName, double balance) {
            super(accountNumber, ownerName, balance);
        }


        public void withdrawWithException(double amount) throws InsufficientFundException {
            if (amount > getBalance()) {
                throw new InsufficientFundException(
                        String.format("Insuficient funds. Requested:  %.2f, Available: %.2f",
                                amount, getBalance()));
            }
            withdraw(amount);
        }

        public static List<Double> processingWithdrawals(BankAccountWithExceptions account, List<Double> amounts) {
            List<Double> successful = new ArrayList<>();
            for (double amount : amounts) {
                try {
                    account.withdrawWithException(amount);
                    successful.add(amount);

                } catch (InsufficientFundException e) {
                    System.out.println("FAiled withdrawal: " + e.getMessage());
                }
            }
            return successful;
        }

        public static List<Product> findProductByCategory(List<Product> products, String category) {
            return products.stream()
                    .filter((Product p) -> p.category().equalsIgnoreCase(category))
                    .collect(Collectors.toList());
        }

        public static BigDecimal calculateTotalValue(List<Product> products) {
            return products.stream()
                    .map(Product::price)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
        }

        public static Map<String, List<Product>> groupProductsByCategory(List<Product> products) {
            return products.stream()
                    .collect(Collectors.groupingBy(Product::category));
        }

        // Exercise 17: record
        record Product(int id, String name, BigDecimal price, String category) {
        }

//        // Exercise 18: Sealed classes and Traditional Switch(No Preview Features
//        public static double calculateTotalAreaTraditional(List<Shape> shapes) {
//            double total = 0.0;
//            for (Shape shape : shapes) {
//                if (shape instanceof Circle) {
//                    total += ((Circle) shape).area();
//                } else if (shape instanceof Rectangle) {
//                    total += ((Rectangle) shape).area();
//                } else if (shape instanceof Triangle) {
//                    total += ((Triangle) shape).area();
//                }
//            }
//            return total;
//        }
////
////
//        public sealed implements Shape permits Circle, Rectangle, Triangle {
//            double area();
//        }
////
//        public final class Circle extends Shape {
//            private final double radius;
//
//            public Circle(double radius) {
//                this.radius = radius;
//            }
//
//            @Override
//            public double area() {
//                return Math.PI * radius * radius;
//            }
//        }
//
//
//        public final class Rectangle extends Shape {
//            private final double width;
//            private final double height;
//
//            public Rectangle(double width, double height) {
//                this.width = width;
//                this.height = height;
//            }
//
//            @Override
//            public double area() {
//                return width * height;
//            }
//        }
//
//
//        public final class Triangle extends Shape {
//            private final double base;
//            private final double height;
//
//            public Triangle(double base, double height) {
//                this.base = base;
//                this.height = height;
//            }
//
//            @Override
//            public double area() {
//                return 0.5 * base * height;
//            }
//        }
//
//
//

//
//        // Exercise 18: Sealed Classes and Traditional Switch (No preview features)
//        public static double calculateTotalArea(List<Shape> shapes) {
//            return shapes.stream()
//                    .mapToDouble(shape -> {
//                        if (shape instanceof Circle c) {
//                            return c.area();
//                        } else if (shape instanceof Rectangle r) {
//                            return r.area();
//                        } else if (shape instanceof Triangle t) {
//                            return t.area();
//                        } else {
//                            throw new IllegalArgumentException("Unknown shape type");
//                        }
//                    })
//                    .sum();
//        }


        // Exercise 19: Advanced Generics - Bounded type Parameters
        static class MinMaxFinder<T extends Comparable<T>> {
            private final List<T> elements = new ArrayList<>();

            public void add(T element) {
                if (element != null) {
                    elements.add(element);
                }
            }

            public Optional<T> getMin() {
                return elements.stream().min(Comparator.naturalOrder());
            }

            public Optional<T> getMax() {
                return elements.stream().max(Comparator.naturalOrder());
            }

            public int size() {
                return elements.size();
            }

            public void clear() {
                elements.clear();
            }

            public List<T> getElements() {
                return new ArrayList<>(elements);
            }
        }





        public static void main(String[] args) {
            //Test Exercise 1
            System.out.println("Exercise 1: " + MentorshipExercises.calculateOperations(10, 5));

            //Test Exercise 2
            System.out.println("Exercise 2: 2024 is leap year "  + MentorshipExercises.isLeapYear(2024));

            //Test Exercise 3
            System.out.println("Exercise 3: " + MentorshipExercises.reverseString("Helloworld"));

            //Test Exercise 4
            System.out.println("Exercise 4: " + MentorshipExercises.findSecondLargest(new int[]{3,1,4,1,5,9,2}));

            //Test Exercise 5
            MentorshipExercises.BankAccount account = new MentorshipExercises.BankAccount("ACC-001", "John Doe", 50000);
            account.withdraw(200);
            System.out.println("Exercise 5: " + account);

            //Test Exercise 8
            MentorshipExercises.BankAccount.BasicGenerics.Pair<String, Integer> pair = new MentorshipExercises.BankAccount.BasicGenerics.Pair<>("Hello",42);
            System.out.println("Exercise 8: " + pair);

            //Test Exercise 9
            List<String> strings = List.of("Apple","banana","Cherry","dog","Elephant");
            System.out.println("Exercise 9: " + MentorshipExercises.BankAccount.ArrayListAndEnhancedFOrLoop.filterStrings(strings));

            //Test Exercise 10
            System.out.println("Exercise 10: Most frequent char in 'hello" + MentorshipExercises.BankAccount.findMostFrequentCharacter("hello"));

            //Test Exercise 11
            List<Number>numbers = List.of(1,2.5,3,4.7,5);
            System.out.println("Exercise 1: Sum of numbers" + MentorshipExercises.BankAccount.sumNumbers(numbers));

            //Test Exercise 12
            System.out.println("Exercise 12: ");
            MentorshipExercises.BankAccount.demonstrateLambdas();

            //Test Exercise 13:
            List<Integer> nums = List.of(1,2,3,4,5,7,8,9,10);
            System.out.println("Exercise 13: " + MentorshipExercises.BankAccount.processNumbers(nums));

            //Test Exercise 14
            List<MentorshipExercises.Person> people = List.of(
                    new MentorshipExercises.Person("Alice", 25, "New York"),
                    new MentorshipExercises.Person("Bob", 30, "New York"),
                    new MentorshipExercises.Person("Charlie", 35, "Boston"),
                    new MentorshipExercises.Person("Diana", 28, "Boston")

            );
            System.out.println("Exercise 14: " + MentorshipExercises.calculateAverageAgeByCity(people));


            //Test Exercise 17
            List <Product> products = List.of(
                    new Product(1, "Laptop", new BigDecimal(999.99), "Electronics"),
                    new Product(2,"Book", new BigDecimal("29.99"), "Books"),
                    new Product(3,"Phone", new BigDecimal(699.99), "Electronics")
            );
            System.out.println("Exercise 17: " + groupProductsByCategory(products));

//            //Test Exercise 18
//            List<Shape> shapes = List.of(
//                    new Circle(5),
//                    new Rectangle(4,6),
//                    new Triangle(3,8)
//            );
//            System.out.println("Exercise 18: Total area = " + calculateTotalArea(shapes));


            //Test Exercise 19
            MinMaxFinder<Integer>finder = new MinMaxFinder<>();
            finder.add(5);
            finder.add(1);
            finder.add(9);
            finder.add(3);
            System.out.println("Exercise 19: Min " + finder.getMin() + ", Max = " + finder.getMax());

        }
    }
}

