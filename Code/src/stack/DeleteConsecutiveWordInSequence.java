package stack;

import java.util.Stack;

public class DeleteConsecutiveWordInSequence {

    public static void main(String[] args){

        String input = "ab aa aa bcd ab";
        String input2 = "tom jerry jerry tom Harsh";

        System.out.println(removeDuplicate(input2));

    }

    public static int removeDuplicate(String sequence){

        Stack<String> stack = new Stack<>();
        String word = "";
        for(int i=0;i<sequence.length();i++){
            if(sequence.charAt(i) == ' '){
                if(!stack.isEmpty() && word.compareToIgnoreCase(stack.peek()) == 0){
                    stack.pop();
                }
                else{
                    stack.push(word);
                }
                word ="";
            }
            else{
                word = word+String.valueOf(sequence.charAt(i));
            }
        }

        if(word.length()!= 0 && stack.isEmpty()){
            stack.push(word);
        }
        else if(word.length() != 0 && !stack.isEmpty() && word.compareToIgnoreCase(stack.peek()) == 0){
            stack.pop();
        }

        return stack.size();
    }
}
