import java.util.*;

public class Anagram {
    //Method to check if two strings are anagram of each other or not
    public static boolean check(String str1, String str2) {
	char[] ch1 = str1.toLowerCase().toCharArray();
	char[] ch2 = str2.toLowerCase().toCharArray();
	//Check ch1 and ch2 have same length
        if(ch1.length == ch2.length) {
            //Compare ch1 with ch2
            for(int i = 0; i < ch1.length; i++) {
                boolean cmp = false;
                for(int j = 0; j < ch2.length; j++) {
                    if(ch1[i] == ch2[j]) {
                        cmp = true;
                        ch1[i] = '!';
                        ch2[j] = '|';
                    }
                }
                //If character does not match return false
                if(!cmp) {
                    return cmp;
                }
            }
            return true;
        }
        return false;
    }

    //Method to sort the array
    public static String[] arrange(String[] strn) {
        //Write your code here
        for(int i = 1; i < strn.length; i++) {
            for(int j = i; j > 0; j--) {
                if(strn[j].charAt(0) < strn[j - 1].charAt(0)) {
                    String temp = strn[j];
                    strn[j] = strn[j - 1];
                    strn[j - 1] = temp;
                }
            }
        }
        return strn;
    }
	
    public static void main(String[] x) {
    	Map<String,String> map = new HashMap<>();
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	String key;
    	String value;
    	for(int i = 1; i <= num; i++){
            key = sc.next();
            value = sc.next();
            map.put(key,value);
	}
        Set<String> keySet = map.keySet();
        String strn[] = new String[keySet.size()];
        int i = 0;
        for(String tmp : keySet) {
            strn[i] = tmp;
            i++;
        }
        strn = arrange(strn);

        boolean cmp = false;
        for(String set : strn) {
            if(check(set, map.get(set))) {
                cmp = true;
                System.out.println(set + " : " + map.get(set));
            }
        }
        if(!cmp) {
            System.out.println(cmp);
        }
    }
}
