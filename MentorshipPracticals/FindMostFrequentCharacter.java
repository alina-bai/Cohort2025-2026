//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import static java.util.Collections.max;
//
//public class FindMostFrequentCharacter {
//    //#10 HashMap Operations
//    public static Character findMostFrequentCharacter(String input) {
//        if (input == null || input.isEmpty()) {
//            return null;
//        }
//        Map<Character, Integer> frequency = new HashMap<>();
//        for (char c : input.toCharArray()) {
//            // Integer value;
//            frequency.merge(c, value:1, Integer::sum);
//        }
//        return frequency.entrySet().stream() Stream < Entry <...>>
//    .max(Map.Entry.comparingByValue()) Optional < Entry <...>>
//    .map(Map.Entry::getKey) Optional<Character>
//        orElse(other:null);
//    }
//}
// //#11 GEneric Methods and WildCards
//public static double sumNumbers(List<? extends Number>numbers) {
//    return numbers.stream()Stream<capture of extends Number>
//    .mapToDouble(Number::doubleValue)DoubleStream
//            .sum();
//}