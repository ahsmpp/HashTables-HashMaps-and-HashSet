import java.util.*;

public class FirstUniqueCharacter {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        //storing the input string to String variable "str"
        String strn = in.nextLine();

        LinkedHashMap<Character, Integer> h = new LinkedHashMap<>();
        char c[] = strn.toCharArray();

        //Traversing through each character of String and adding values to HashMap
        for(int i = 0; i < c.length; i++) {
            if(h.containsKey(c[i])) {
                //If character exists, its value incremented by 1
                h.put(c[i], h.get(c[i]) + 1);
            } else {
                h.put(c[i], 1);
            }
        }

        //Print the 1st Unique Character
        boolean uniquechar = false;
        for(char ch : h.keySet()) {
            if(h.get(ch) == 1) {
                System.out.println(ch);
                uniquechar = true;
                break;
            }
        }
        //If there is no unique character, print -1
        if(!uniquechar) {
            System.out.println(-1);
        }
    }
}
