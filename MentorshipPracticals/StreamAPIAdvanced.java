//Exercise 14: Stream API -Advanced with Collectors

import javax.xml.namespace.QName;
import java.awt.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIAdvanced {
    private final String name;
    private  final int age;
    private final String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city;
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public String getCity() {return city; }
}
@Override
public String toString() {
    return String.format("Person{name='%s', age=%d, age=%d, city='%s'}"),name, age, city);
}
}

public static Map<String, Double> calculateAverageAgeByCity(List<Person> people) {
    return people.stream()
            .collect(Collectors.groupingBy(
                    Person::getCity,
                    Collectors.avaragingInt(Person::getAge)
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
    public String getName() {return name;}
    public double getGrade() { return grade;}
    public int getAge(){ return age;}

    @Override
    public String toString(){
        return String.format("Student{name='%s', grade=%.1f, age=%d}", name,grade, age)
    }
}
public static void sortStudents(List<Student>students) {
    students.sqrt(
            Comparator.comparingDouble(Student::grade).reversed()
                    .thenComparingInt(Student::age)
    );
}

//Exercise 16: Exception Handling and Custom Exceptions
static class InsufficientFundException extends Exception{
    public InsufficientFundException (String message){
        super(message);
    }
}
static class BankAccountWithExceptions extends BankAccount {
    public BankAccountWithExceptions(String accountNumber, String ownerName,double balance){
        super(accountNumber,ownerName,balance);
    }

    public void withdrawWithException(double amount) throws InsufficientFundException{
        if (amount>getBalance()){
            throw new InsufficientFundException(
                    String.format("Insuficient funds. Requested:  %.2f, Available: %.2f,"
                    amount, getBalance()));
        }
        withdraw(amount);
    }

}

public static List<Double>processingWithdrawals (BankAccountWithExceptions account, List <Double>) {
    List<Double> successful = new ArrayList<>();
    for (double amount : amounts) {
        try{
            account.withdrawWithException(amount);
            successful.add(amount);

        }catch (InsufficientFundException e) {
            System.out.println("FAiled withdrawal: "+ e.getMessage());
        }
    }
    return successful;
}

//Exercise 17: Records
public  static List<Product>findProductByCategory(List<Product>products, String category)
    return product.stream()
.filter(Product p -> p.category().equalsIgnoreCase(category))
        .collect(Collectors.toList());

public static BigDecimal calculateTotalValue(List<Product>products) {
    return products.stream()Stream<Product>
    .map(Product::price)Stream<BigDecimal>
            reduce(BigDecimal.ZERO,BigDecimal::add);
}
public static Map<String, List<Product>>groupProductsByCategory(List<Prduct>prducts) {
    return prducts.stream();
    .collect(Collectors.groupingBy(Product::category));
}

//Exercise: 18 Sealed Classess and Traditional Switch(No preview Features)
public static double calculateTotalArea(List<Shape> shapes) {
    return  shapes.stream()Stream<Shape>
    .mapToDouble(Shape shape -> {
        if (shape instanceof Circle c) {
            return c.area();
        }else if (shape instanceof Rectangle r){
            return r.area();
        }else if (shape instanceof Triangle t) {
            return t.area();
        }else {
            throw new IllegalArgumentException("Unknown shape type");
        }
            })DoubleStream
            .sum();
}

//Alternative implementation using traditional switch

public static double calculateTotalAreaTraditional (List<Shape> shapes) {
    double total = 0.0;
    for (Shape shape : shapes){
        if(shape instanceof Circle){
            total+=((Circle)shape).area();
        }else if (shape instanceof Rectangle) {
            total+=((Rectangle)shape).area();
        }else if (shape instanceof Triangle) {
            total+=((Triangle)shape).area();
        }
    }
    return total;
}

//exercise 19: Advanced Generics - Bounded type Parameters
static class MinMaxFinder<T extends Comparable<T>> {
    private final List<T> elements = new ArrayList<>();

    public void add(T element) {
        if element !=null) {
    elements.add(element);
        }
    }
    public Optional<T> getMin() {
        return elements.stream().min(Comparable::compareTo)
    }
    public  Optional<T> getMax() {
        return elements.stream().max(Comparable::compareTo);
    }
    public int size(){
        return.elements.size();
    }
    public void clear() {
        elements.clear();
    }
    public List<T> getElements() {
        return new ArrayList<>(elements);
    }
}
