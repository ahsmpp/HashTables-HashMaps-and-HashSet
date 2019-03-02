import java.util.*;

public class DistinctValues {
    //Method to print distinct values
    public static void printValues(Map<Integer,String> map){
	//Adding all the Values of the Map to Set
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        for(int i : map.keySet()) {
            set.add(map.get(i));
        }
        //Printing all the Set values
        for(String str : set) {
            System.out.print(str + " ");
        }
    }
	
    public static void main(String[] x){
	Map<Integer,String> map = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int key;
	String value;
	for(int i = 1; i <= num; i++){
            key = sc.nextInt();
            value = sc.next();
            map.put(key,value);
	}
            printValues(map);
    }
}
