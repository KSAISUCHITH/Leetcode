class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercase=0;
        for(char c : word.toCharArray())
        {
            if(Character.isUpperCase(c)){uppercase++;}
        }
        if(uppercase==word.length() || uppercase==0 ||(uppercase==1&&Character.isUpperCase(word.charAt(0)))){
            return true;
        }
        else{
            return false;
        }
        
    }
}