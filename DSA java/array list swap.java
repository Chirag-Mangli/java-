import java.util.ArrayList;

class firstclass{
    public static void mn(ArrayList<Integer>l1, int a , int b){
        int temp=l1.get(a);
        l1.set(a,l1.get(b));
        l1.set(b, temp);
    }
        public static void main(String[] args) {
        ArrayList<Integer>l1= new ArrayList<>();
        l1.add(1);
        l1.add(4);
        l1.add(8);
        l1.add(6);
        l1.add(5);
        System.out.println(l1);
        mn(l1, 2,3);
        System.out.println(l1);
    }
}