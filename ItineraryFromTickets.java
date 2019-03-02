import java.util.*;

public class ItineraryFromTickets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Get the no of tickets from input
        int n = in.nextInt();

        //HashMap to store all the tickets
        TreeMap<String, String> tickets = new TreeMap<String, String>();

        //Store the source and destination of the tickets to the map "tickets"
        for (int i = 0; i < n; i++) {
            tickets.put(in.next(), in.next());
            in.nextLine();
        }

        //Creating a Set of all the Destinations
        TreeSet<String> revtickets = new TreeSet<String>();
        for(String str : tickets.keySet()) {
            revtickets.add(tickets.get(str));
        }

        String start = " ";
        //Finding the Origin, Origin will not be in the Destination Set
        for(String str : tickets.keySet()) {
            if(!revtickets.contains(str)) {
                start = str;
                break;
            }
        }
        //Printing the ticket from Origin to Final Destination
        if(" ".equals(start)) {
            System.out.println("Invalid\n" + tickets.lastKey() + " " + tickets.get(tickets.lastKey()));
        } else {
            String temp = start;
            while(temp != null) {
                System.out.print(temp + " ");
                temp = tickets.get(temp);
            }
        }
    }
}
