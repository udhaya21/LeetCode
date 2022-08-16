class Solution {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        sb.reverse();
        return String.valueOf(sb).equals(num);
    }
}