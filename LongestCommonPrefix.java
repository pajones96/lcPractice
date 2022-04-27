class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int shortestLength = 201;
        int shortestIndex = 0;
        for (int i = 0; i < strs.length; i++){
            if (strs[i].length() <= shortestLength){
                shortestLength = strs[i].length();
                shortestIndex = i;
            }
            System.out.println(shortestLength);
        }
        
        String lcPrefix = "";
        
        for(int j = 0; j < shortestLength; j++ ){
            
            
        }
        
        return lcPrefix;
    }
}
