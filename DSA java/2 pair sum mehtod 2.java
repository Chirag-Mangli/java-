import java.util.ArrayList;

class firstclass{
    public static boolean pair(ArrayList<Integer>l, int key){
        int lp= 0;
        int rp=l.size()-1;
        while(lp<rp){
            if (l.get(lp)+l.get(rp)==key){
                return true;
            }
            if (l.get(lp)+l.get(rp)<key){
                lp++;
            }
            
            else{
                rp--;
            }
        }return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>l= new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        int key=16;
        System.out.println(pair(l, key));
    }
}