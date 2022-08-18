class Solution {
    public int romanToInt(String s) {
        char[] arr = s.toCharArray();
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int i = 0;
        while(i < arr.length) {
            int val1 = map.get(arr[i]);
            
            int val2 = (i+1) < arr.length ? map.get(arr[i+1]) : 0;

            if(val1 < val2) {
                result += val2 - val1;
                i+=2;
            } else {
                result += val1;
                i++;
            }
        }
        return result;
    }
}