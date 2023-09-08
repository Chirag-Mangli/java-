import java.util.ArrayList;

class firstclass{
    public static void main(String[] args) {
        ArrayList<Integer>l1= new ArrayList<>();
        l1.add(2);
        l1.add(4);
        l1.add(8);
        l1.add(7);
        l1.add(3);
        // we find the size of the list  -----------> l1.size--------------> outpput   5;

        System.out.println(l1);
        System.out.println(l1.size());

        //or
        for (int i =0; i<l1.size(); i++){
            System.out.print(l1.get(i)+" ");

        }System.out.println();
         for (int i =l1.size()-1; i>=0; i--){
            System.out.print(l1.get(i)+" ");
        }System.out.println();


        /// find the max number
        int m=0;
        for (int i =0; i<l1.size(); i++){
            m= Math.max(m,l1.get(i));


        }System.out.println(m);

    }
}