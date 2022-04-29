class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        //this section is for getting the shortest string in strs, which is handy and cuts down on out of bounds exceptions
        int shortestLength = 201;
        int shortestIndex = 0;
        for (int i = 0; i < strs.length; i++){
            if (strs[i].length() <= shortestLength){
                shortestLength = strs[i].length();
                shortestIndex = i;
            }
        }
        
        //sets up the variable we're gonna return as the answer
        String lcPrefix = "";
        
        //this is supposed to check if the shortest string is empty, and if it's not, set lcPrefix equal to its first letter
        if(strs[shortestIndex].length() > 0){
            lcPrefix = strs[shortestIndex].substring(0, 1);
        }
        
        //iterate through each string up to the length of the shortest
        for(int k = 0; k < shortestLength; k++){
            //System.out.println(lcPrefix);
            //quick test statement ^, didn't need to include it
            //check each string to make sure it starts with the current lcPrefix, and if it doesn't, return the last version
            for(int j = 0; j < strs.length; j++){
                if(strs[j].startsWith(lcPrefix) == false){
                    return lcPrefix.substring(0, lcPrefix.length()-1);
                }
            }
            //Just a check to cover corner cases
            if (lcPrefix.length() >= shortestLength){
                return lcPrefix;
            } else {
                lcPrefix = strs[shortestIndex].substring(0, lcPrefix.length()+1);
            }
            
        }
        
        return lcPrefix;
    }
}
