import java.util.ArrayList;

class firstclass{
    public static boolean pair(ArrayList<Integer>l,int key){
        int bp=-1;
        int n= l.size();
        for (int i=0; i<l.size(); i++){
            if (l.get(i)>l.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp =bp+1;
        int rp =bp;
        while(lp!=rp){
            if (l.get(lp)+l.get(rp)== key){
                return true;
            }
            if (l.get(lp)+l.get(rp)<key){
                lp= (lp+1)%n;
            }
            else{
                rp= (n+rp-1)%n;
            }
        }return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>l= new ArrayList<>();
        l.add(11);
        l.add(15);
        l.add(6);
        l.add(8);
        l.add(9);
        l.add(10);
        int key =24;
        System.out.println(pair(l,key));
    }
}