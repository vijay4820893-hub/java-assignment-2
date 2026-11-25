public class Challenges {

    /** 1. Reverse a string using the stack. */
    public static String reverseString(String str) {
        Stack s = new Stack();
        for (char c : str.toCharArray()) {
            s.push(c);                      
        }
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append((char) s.pop());
        }
        return sb.toString();
    }

    /** 2. Palindrome check using the stack. */
    public static boolean isPalindrome(String str) {
        String clean = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        Stack s = new Stack();
        for (char c : clean.toCharArray()) s.push(c);
        for (char c : clean.toCharArray()) {
            if ((char) s.pop() != c) return false;
        }
        return true;
    }

    /** 3. Reverse a stack using another stack (original becomes empty). */
    public static Stack reverseStack(Stack original) {
        Stack reversed = new Stack();
        while (!original.isEmpty()) {
            reversed.push(original.pop());
        }
        return reversed;
    }
}

