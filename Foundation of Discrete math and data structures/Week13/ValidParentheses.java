package Week13;

import java.util.Stack;

//Leetcode #20
public class ValidParentheses {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if ( c == '(') {
                stack.push(')');
            }else if (c =='{') {
                stack.push('}');
            } else if (c =='[') {
                stack.push(']');
            }else {
                if (stack.isEmpty() || stack.pop() != c){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
