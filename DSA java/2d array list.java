import java.util.ArrayList;

class firstclass{

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainlList=new ArrayList<>();
        ArrayList<Integer>l1= new ArrayList<>();
        l1.add(3);l1.add(7);l1.add(5);
        mainlList.add( l1);


        ArrayList<Integer>l2= new ArrayList<>();
        l2.add(8);l2.add(4);l2.add(8);
        mainlList.add( l2);
      
        for (int i=0; i<mainlList.size();i++){
            ArrayList<Integer>b= mainlList.get(i);
            for(int j=0; j<b.size();j++){
                System.out.print(b.get(j)+" ");

            }System.out.println();
        }
        System.out.println(mainlList);
    }


}