import java.util.ArrayList;

public class LongestSubstring {

    class Solution {
        ArrayList<Character> saveList = new ArrayList<Character>();
        public int lengthOfLongestSubstring(String s) {

            char[] strlist = s.toCharArray();
            int count=0;
            // char[] saveList = new char[strlist.length];
            int max=0;
            for(char i : strlist){
                if(isPresent(i)){
                    saveList.add(i);
                    count++;
                }
                else {
                    max=count;
                    saveList.clear();
                    System.out.println(saveList);
                }
            }

            return max;
        }

        boolean isPresent(char ch){

            for(char i : saveList){
                if(ch==i){
                    return false;
                }

            }
            return true;
        }



    }



}
