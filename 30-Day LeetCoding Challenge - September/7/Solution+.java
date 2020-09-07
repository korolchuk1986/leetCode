class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] arr = str.split(" ");
        if(pattern.length() != arr.length) {
            return false;
        }
        Map<Object, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++) {
            if (!Objects.equals(map.put(pattern.charAt(i), i), map.put(arr[i], i))) {
                return false;
            };
        }
        return true;
    }
}