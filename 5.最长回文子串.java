/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start

class Solution {
    public static String longestPalindrome(String s) {
        String myString=new String();
        int begin=0;
        int max=0;
        int last=0;
        for (int i = 0; i < s.length(); i++) {
            begin=i;
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(j)==s.charAt(begin)) {
                   myString=substring(s,begin, j);
                   if (myString.equals(Converse(myString)) && (j-begin)>max) {
                     max=j-begin;
                     last=j;
                   }
                }
            }
        }
        return substring(s,last-max, last);
    }


    public static String Converse(String s){
    char[] myarray= s.toCharArray();  
    char temp;
    for (int i = 0; i < myarray.length/2; i++) {
      temp= myarray[i];
      myarray[i]=myarray[myarray.length-i-1];
      myarray[myarray.length-i-1]=temp;
    }
    return String.valueOf(myarray);
    }
    public static String substring(String s,int i,int j) {
        String  myString=new String( s.substring(i,j).concat(String.valueOf(s.charAt(j))));
        return myString;

    }
}
// @lc code=end

