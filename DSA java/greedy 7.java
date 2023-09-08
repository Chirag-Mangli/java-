import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class firstclass{
    public static void main(String[] args) {
        Integer coin[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coin, Comparator.reverseOrder());
      
        int amount =590;
       
        int count=0;
        ArrayList<Integer>a= new ArrayList<>();
        for (int i=0; i<coin.length;i++){
            if (coin[i]<=amount){
                while(coin[i]<=amount){
                    count++;
                    a.add(coin[i]);
                    amount-= coin[i];
                }

            }
        }
        System.out.println(count);
        for (int i=0; i<a.size();i++){
            System.out.print(a.get(i)+"  ");
        }System.out.println();

    }
}