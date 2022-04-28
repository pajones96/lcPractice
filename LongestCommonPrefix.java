class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int shortestLength = 201;
        int shortestIndex = 0;
        for (int i = 0; i < strs.length; i++){
            if (strs[i].length() <= shortestLength){
                shortestLength = strs[i].length();
                shortestIndex = i;
            }
        }
        
        String lcPrefix = "";
        
        if(strs[shortestIndex].length() > 0){
            lcPrefix = strs[shortestIndex].substring(0, 1);
        }
        
        
        for(int k = 0; k < shortestLength; k++){
            System.out.println(lcPrefix);
            for(int j = 0; j < strs.length; j++){
                if(strs[j].startsWith(lcPrefix) == false){
                    return lcPrefix.substring(0, lcPrefix.length()-1);
                }
            }
            if (lcPrefix.length() >= shortestLength){
                return lcPrefix;
            } else {
                lcPrefix = strs[shortestIndex].substring(0, lcPrefix.length()+1);
            }
            
        }
        
        return lcPrefix;
    }
}
