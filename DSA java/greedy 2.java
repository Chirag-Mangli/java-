import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class firstclass{
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]= {2,4,6,7,9,9};
        int arr[][]= new int[start.length][3];
        for (int i=0; i<start.length;i++){
        arr[i][0]=i;
        arr[i][1]=start[i];
        arr[i][2]=end[i];
        }
        Arrays.sort(arr,Comparator.comparingDouble(o -> o[2]));
        
        ArrayList<Integer>a=  new ArrayList<>();
        a.add(arr[0][0]);
        int mac=1;
        int last= arr[0][2];
        for (int i=1; i<start.length;i++){
            if (arr[i][1]>=last){
                mac++;
                a.add(arr[i][0]); 
                last = arr[i][2];


            }

        }
        System.out.println("______"+mac+"______");
        for (int i=0; i<a.size(); i++){
            System.out.print("A"+a.get(i)+"  ");

        }System.out.println();

    }
}