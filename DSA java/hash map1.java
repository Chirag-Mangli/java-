import java.util.HashMap;

class firstclass{
    public static void main(String[] args) {
        HashMap<String , Integer>h1= new HashMap<>();  
        //  insert
        h1.put ("chirag" , 76);
        h1.put("cu", 76);
        h1.put("cbch", 8);
        System.out.println(h1);

        // get       we pass the key
    
        System.out.println((h1.get("chirag")));

        // contianskey

        System.out.println(h1.containsKey("cu"));
        System.out.println(h1.containsKey("cs"));
        System.out.println(h1.containsKey("c"));

        // remove 
        System.out.println(h1.remove("cu"));
        System.out.println(h1);

        // size
        System.out.println(h1.size());

    }
}