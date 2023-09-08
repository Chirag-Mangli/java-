import java.util.ArrayList;

class firstclass{
    public static boolean pair(ArrayList<Integer>l,int key){
        for (int i=0; i<l.size(); i++){
            for (int j=i+1; j<l.size();j++){
                if (l.get(i)+l.get(j)==key){
                    return true;
                }
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
        int key= 11;
        System.out.print(pair(l, key));

    }
}