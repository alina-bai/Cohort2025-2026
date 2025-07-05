package Week12;

public class BackspaceStringCompare {
    public boolean backsaceCompare (String s, String t) {
        return process(s).equals(process (t));
    }
    private String process(String str) {
        StringBuilder result = new StringBuilder();

        for(int i=0; i < str.length(); i++){
            char c = str.charAt(i);

            if (c !='#'){
                result.append(c);
            }else if (result.length()> 0){
                result.deleteCharAt(result.length()-1);
            }
        }

        return result.toString();
    }

}
