class Solution {
    public boolean isPalindrome(int x) {
        
        int reverse = 0;
        int temp = x;
        while(temp > 0) {
            reverse *= 10;
            reverse  += temp % 10;
            temp = temp / 10;
        }
        return x == reverse;
        
//         if(x < 0) {
//             return false;
//         }
        
//         int d = 1;
//         while(x/d >= 10) {
//             d *= 10;
//         }
        
//         while(x != 0) {
//             int q = x / d;
//             int r = x % 10;
            
//             if(q != r) {
//                 return false;
//             }
            
//             x = (x % d) / 10;
            
//             d = d / 100;
//         }
        
        // return true;
        
        // String num = String.valueOf(x);
        // StringBuilder sb = new StringBuilder();
        // sb.append(num);
        // sb.reverse();
        // return String.valueOf(sb).equals(num);
    }
}