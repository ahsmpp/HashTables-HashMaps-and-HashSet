import java.util.*;

public class LocksKeys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get the number of keys
        int n = in.nextInt();

        char Keys[] = new char[n];
        char Locks[] = new char[n];

        // store all the keys to the array "keys"
        for (int i = 0; i < n; i++) {
            Keys[i] = in.next(".").charAt(0);
        }
        in.nextLine();

        //store all the locks to the array "locks"
        for (int i = 0; i < n; i++) {
            Locks[i] = in.next(".").charAt(0);
        }
        
        //Creating a Set of all the Locks
        TreeSet<Character> locks = new TreeSet<Character>();
        for(char ch : Locks) {
            locks.add(ch);
        }

        //Checks Keys with Locks
        for(int i = 0; i < Keys.length; i++) {
            if(locks.contains(Keys[i])) {
                Locks[i] = Keys[i];
            } else {
                System.out.println("Not possible");
                return;
            }
        }
/*      Checks Keys with Locks and Prints if matched
        for(char ch : Keys) {
            if(locks.contains(ch) {
                System.out.println(ch + " " + ch);
            } else {
                System.out.println("Not possible");
                return;
            }
        }
*/
        //Printing Keys and Locks
        for(int i = 0; i < Keys.length; i++) {
            System.out.println(Keys[i] + " " + Locks[i]);
        }
    }
}
