class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> brackets = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        brackets.put( ')', '(');
        brackets.put( '}','{');
        brackets.put(']', '[' );

        for (char c: s.toCharArray()){
            if (brackets.containsKey(c)){
                if (!stack.isEmpty() && stack.peek() == brackets.get(c)){
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                    stack.push(c);
                }
        }
        return stack.isEmpty();
    }
}
