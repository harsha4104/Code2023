package string;

public class MergeTwoString {

    public static void main(String[] args){

        String a = "DAVID";
        String  b = "ROSE";

        System.out.println(someMethod(a,b));
    }

    public static String someMethod(String s1, String s2){

        int i =0;
        int j = 0;

        String answer = "";

        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i) > s2.charAt(j)){
                answer = answer+String.valueOf(s2.charAt(j));
                j++;
            }
            else {
                answer = answer + String.valueOf(s1.charAt(i));
                i++;
            }
        }

        while(i<s1.length()){
            answer = answer+String.valueOf(s1.charAt(i));
            i++;
        }

        while(j<s2.length()){
            answer = answer +String.valueOf(s2.charAt(j));
            j++;
        }

        return answer;
    }
}
