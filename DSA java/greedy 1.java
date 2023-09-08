import java.util.ArrayList;
import java.util.Arrays;

class firstclass{  
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]= {2,4,6,7,9,9};
        
        ArrayList<Integer>a= new ArrayList<>();
        a.add(0);
        int mac=1;
        int last= end[0];

        for (int i=1 ; i<start.length;i++){
            if (start[i]>= last){
                mac++;
                a.add(i);
                last= end[i];

            }



        }System.out.println(mac);
        for(int i=0; i<a.size();i++){
            System.out.print("A"+i+" ");
        }System.out.println();
    }    

}