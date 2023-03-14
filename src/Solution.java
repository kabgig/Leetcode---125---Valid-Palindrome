import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        Deque<Character>
                chars1 = new ArrayDeque<>(),
                chars2 = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c) ||
                    Character.isDigit(c)) {
                chars1.addFirst(c);
                chars2.addLast(c);
            }
        }
        while (!chars1.isEmpty() || !chars2.isEmpty()) {
            if (chars1.poll() != chars2.poll()) return false;
        }
        return true;
    }
}