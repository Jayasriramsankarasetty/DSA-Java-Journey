class Leetcode125Easy {
    public boolean isPalindrome(String s) {
        StringBuilder filteredString = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filteredString.append(Character.toLowerCase(c));
            }
        }
        return checkPalindrome(filteredString.toString(), 0, filteredString.length() - 1);
    }

    public boolean checkPalindrome(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false; 
        return checkPalindrome(s, left + 1, right - 1);
    }
}
