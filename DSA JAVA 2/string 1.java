import java.util.Scanner;

class firstclass{
    public static void allindex(String name){
        for(int i=0; i<name.length();i++){
            System.out.print(name.charAt(i));
        }System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       /*  String name= sc.next();*/
        String name= sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(1));
        allindex(name);
        
    }
}