import java.util.ArrayList;

class firstclass{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainlist= new ArrayList<>();
        ArrayList<Integer>l1= new ArrayList<>();
        ArrayList<Integer>l2= new ArrayList<>();
        ArrayList<Integer>l3= new ArrayList<>();
        
        for(int i =0; i<=5;i++){
            l1.add(1*i);
            l2.add(2*i);
            l3.add(3*i);


        }       
        mainlist.add( l1);
        mainlist.add( l2);
        mainlist.add( l3);
        System.out.println(mainlist);

        for (int i=0; i<mainlist.size(); i++){
            ArrayList<Integer>ac= mainlist.get(i);
            System.out.println(ac);

        }System.out.println();
 
      

    } 
}