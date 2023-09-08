import java.util.Scanner;

class firstclass{
    
       
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name= sc.nextLine();
        for(int i=0; i<name.length()/2;i++){
            if (name.charAt(i) !=name.length()-1-i){
                System.out.println("no");
            }
            else{
                System.out.println("s");

            }
        }
    }
}