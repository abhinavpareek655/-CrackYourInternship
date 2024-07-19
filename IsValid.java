class IsValid {
    public boolean isValid(String s) {
        char str[] = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : str) {
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if ((c == ']' || c == ')' || c == '}') && stack.isEmpty()) {
                return false;
            } else {
                if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
