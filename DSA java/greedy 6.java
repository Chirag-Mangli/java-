import java.util.Arrays;
import java.util.Comparator;

class firstclass{
    public static void main(String[] args) {
        int a[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(a,Comparator.comparingDouble(o ->o[1]));
        int mac=1;
        int last= a[0][1];
        for (int i=1; i<a.length;i++){
            if(a[i][0]>=last){
                mac++;
                last= a[i][1];
            } 
        }System.out.println(mac);
    }
}