package String;

import java.util.HashSet;

class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
       char[] str=s.toCharArray();
       HashSet hs=new HashSet();
        
       int i=0;int j=1;
       hs.add(str[0]);
       int size=1;
       int csize=1;
       while(j<str.length){
           if(str[i]==str[j]){
               i++;j++;
           } else{
               if(!hs.contains(str[j])){
            	   hs.add(str[j]);
                   csize++;j++;
                   
               } else {
                   hs.remove(str[i]);
                   i++;
                   csize--;
               }
           }
           if(csize>size){
               size=csize;
           }
       }
        return size;
    }
    
    public static void main(String args[]) {
    System .out.println(lengthOfLongestSubstring("abcabcbb"));
 
    	
    }
}

// ab
//"abcabcbb"


