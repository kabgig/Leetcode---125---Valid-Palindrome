public class Solution2 {
    public boolean isPalindrome(String s) {
        if (s.equals(" ")) return true;
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;

        while (end >= start) {
            char currStart = s.charAt(start);
            char currEnd = s.charAt(end);
            if (!Character.isLetterOrDigit(currStart))
                start++;
            else if (!Character.isLetterOrDigit(currEnd))
                end--;
            else {
                if (currStart != currEnd) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
