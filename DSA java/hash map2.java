import java.util.HashMap;
import java.util.Set;

class firstclass{
    public static void main(String[] args) {
        HashMap<String, Integer>h1= new HashMap<>();
        h1.put("Maths", 78);
        h1.put("science", 89);
        h1.put("english", 63);
        h1.put("hindi ", 94);
        h1.put("SST", 71);
        Set<String>key= h1.keySet();
        System.out.println(key);

        for (String k : key) {
            System.out.println(k+" "+ "  "+h1.get(k));
            
        }
     }
}