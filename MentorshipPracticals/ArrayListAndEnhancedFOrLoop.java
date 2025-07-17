//#9 ArrayList and Enhanced For Loop

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Collections.max;

public class ArrayListAndEnhancedFOrLoop {
    public static List<String> filterstrings(List<String>strings){
        List<String> result = new ArrayList<>();
        for (String str : strings){
            if (str !=null && str.length()>3 && Character.isUpperCase(str.charAt(0))) {
                result.add(str);
            }
        }
        return result;
    }
}

