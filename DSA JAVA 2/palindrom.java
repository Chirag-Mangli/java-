import java.util.Scanner;

class firstclass{
    public static boolean pal(String a){
        for (int i=0; i<a.length()/2;i++){
            if(a.charAt(i)!=a.length()-1-i){
                return true;
              

            }return false;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a= sc.next();
        pal(a);
       
        
    }
}