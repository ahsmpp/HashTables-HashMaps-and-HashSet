import java.util.*;

public class SymmetricPairs {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        //number of pairs in the array
        int n = in.nextInt();
        int arr[][] = new int[n][2];

        // store the input pairs to an array "arr"
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        HashMap<Integer, Integer> h = new HashMap<>();
        boolean pair = false;

        for(int i = 0; i < arr.length; i++) {
            //1st Pair Key
            int f1 = arr[i][0];
            //1st Pair Value
            int s1 = arr[i][1];
            //Check if 1st Pair Value is a Key in the HashMap & that Key's Value is equal to 1st Pair Key
            if(h.containsKey(s1) && f1 == h.get(s1)) {
                System.out.println(s1 + " " + h.get(s1));
                pair = true;
            } //Add the Pair to the HashMap 
            else {
                h.put(f1, s1);
            }
        }
        //If no Pairs were Symmetric
        if(!pair) {
            System.out.println("No Symmetric pair");
        }
    }
}
