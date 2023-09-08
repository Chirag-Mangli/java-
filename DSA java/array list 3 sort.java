import java.util.ArrayList;
import java.util.Collections;

class firstclass{
    public static void main(String[] args) {
        ArrayList<Integer>l1= new ArrayList<>();
        l1.add(3);
        l1.add(9);
        l1.add(2);
        l1.add(70);
        l1.add(6);
        System.out.print(l1);
        Collections.sort(l1);
        System.out.println();
        System.out.print(l1);
        // we print in reverse oder  --------->we use 
        System.out.println();
        Collections.sort(l1, Collections.reverseOrder());
        System.out.print(l1);
                



    }
}