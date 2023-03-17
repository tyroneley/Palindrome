import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;;

public class Reader {
    static Queue<Character> queueList = new LinkedList<Character>();
    static Stack<Character> stackList = new Stack<Character>();
    
    static void clearReader() {
        queueList.clear();
        stackList.clear();
    }

    static void getCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            queueList.add(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            stackList.push(str.charAt(i));
        }     
    }

    // stack and queue checks in order and reverse to see if char matches
    public static Boolean isPalindrome(String str) {
        clearReader();
        getCharacters(str);
        Boolean isAPalindrome = true;
        while (!queueList.isEmpty()) {
            if (!queueList.remove().equals(stackList.pop())) {
                isAPalindrome = false;
            }
        }
        return isAPalindrome;
    }
}
