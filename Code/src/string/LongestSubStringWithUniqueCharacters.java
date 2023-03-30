package string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithUniqueCharacters {

    public static void main(String[] args){
        String s = "abcabc";
        System.out.println(method(s));
    }

    public static int method(String s){

        if(s.length() == 0){
            return 0;
        }

        if(s.length() == 1){
            return 1;
        }
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        int end = 0;
        map.put(s.charAt(start), 1);

        for(start = 1;start < s.length();start++){
            if(map.containsKey(s.charAt(start)) && map.get(s.charAt(start)) == 1){
                while(s.charAt(end) != s.charAt(start)){
                    map.put(s.charAt(end), map.get(s.charAt(end))-1);
                    end++;
                }
                map.put(s.charAt(end), map.get(s.charAt(end))-1);
                end++;
                maxLength = Math.max(maxLength, start-end+1);
                map.put(s.charAt(start), map.get(s.charAt(start))+1);
            }
            else{
                map.put(s.charAt(start), 1);
                maxLength = Math.max(maxLength, start-end+1);
            }
        }


        return maxLength;

    }
}
