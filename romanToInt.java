class Solution {
    public int romanToInt(String s) {
        
        //sum is gonna be the int we return
        int sum = 0;
        //wonky little trick for getting around pesky out of bounds errors
        s = s + " ";
        
        //iterate through the loop
        for (int i = 0; i < s.length(); i++){
            
            char num = s.charAt(i);
            
            //switch statement checks the current digit and in some cases the next one to determine what to add to sum
            switch(num){
                case 'I':
                    if (s.charAt(i+1) == 'X'){
                        sum += 9;
                        i++;
                        break;
                    } else if (s.charAt(i+1) == 'V'){
                        sum += 4;
                        i++;
                        break;
                    }
                    sum += 1;
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    if (s.charAt(i+1) == 'C'){
                        sum += 90;
                        i++;
                        break;
                    } else if (s.charAt(i+1) == 'L'){
                        sum += 40;
                        i++;
                        break;
                    }
                    sum += 10;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    if (s.charAt(i+1) == 'M'){
                        sum += 900;
                        i++;
                        break;
                    } else if (s.charAt(i+1) == 'D'){
                        sum += 400;
                        i++;
                        break;
                    }
                    sum += 100;
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
                case ' ':
                    //And here's the sort of escape clause that handles the " " concatenated to the end of s
                    break;
            }
        }
        //numbers numbers numbers
        return sum;
    }
}
