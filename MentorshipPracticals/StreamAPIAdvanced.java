//Exercise 14: Stream API -Advanced with Collectors

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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