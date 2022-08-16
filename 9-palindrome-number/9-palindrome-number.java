class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0) {
            return false;
        }
        
        int d = 1;
        while(x/d >= 10) {
            d *= 10;
        }
        
        while(x != 0) {
            int q = x / d;
            int r = x % 10;
            
            if(q != r) {
                return false;
            }
            
            x = (x % d) / 10;
            
            d = d / 100;
        }
        
        return true;
        
        // String num = String.valueOf(x);
        // StringBuilder sb = new StringBuilder();
        // sb.append(num);
        // sb.reverse();
        // return String.valueOf(sb).equals(num);
    }
}