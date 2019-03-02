import java.util.*;

public class PairGivenSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //Array to store the input elements
        int[] array = new int[n];

        //storing the input integers to an array
        for(int i =0;i<n;i++){
            array[i] = in.nextInt();
        }
        
        // getting the target sum from input
        int sum = in.nextInt();

        //Creating a HashSet named "hashSet"
        Set<Integer> hashSet = new HashSet<Integer>();

        boolean check = false;
        //Adding array elements into HashSet
        for(int i = 0; i < array.length; i++) {
            //Check if number pair exists
            if(hashSet.contains(sum - array[i])) {
                check = true;
                break;
            } else {
                //Add array[i] to HashSet
                hashSet.add(array[i]);
            }
        }

        //If number pair exists, print true, else false
        if(check) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
