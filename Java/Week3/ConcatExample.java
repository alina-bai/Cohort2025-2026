package Week3;
public class ConcatExample {
    public static void main(String[] args) {
        String result = concatenateStringAndInt ("Age: ", 25);
        System.out.println(result);
    }
        public static  String concatenateStringAndInt (String text, int number) {
            String combined = text + number;
            return combined;

    }

}
