import java.util.*;

public class ContiguousIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //Array to store the input elements
        int[] array = new int[n];

        //Storing the elements to the array
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        //If array is empty, print false
        if(n == 0) {
            System.out.println("false");
            return;
        }

        //Creating a HashSet named "hashSet"
        Set<Integer> hashSet = new HashSet<Integer>();

        //Adding array elements into HashSet
        for(int i = 0; i < array.length; i++) {
            hashSet.add(array[i]);
        }

        int temp = array[0];
        int count = 0;

        //Check elements less than or equal to array[0]
        while(hashSet.contains(temp)) {
            count++;
            temp--;
        }

        temp = array[0] + 1;

        //Check elements greater than array[0]
        while(hashSet.contains(temp)) {
            count++;
            temp++;
        }

        //If count is equal to the size of the HashSet, print true, else false
        if(count == hashSet.size()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
