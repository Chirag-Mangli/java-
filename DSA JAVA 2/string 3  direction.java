import java.util.Scanner;

class firstclass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        int  x=0, y=0;
        for (int i=0;i<name.length();i++ ){
            char dir =name.charAt(i);
            if (dir=='N'){
                x++;
            }
            else if(dir=='S'){
                x--;
            }
            else if(dir=='W'){
                y--;

            }
            else{
                y++;
            }
        }
        int x2=x*x;
        int y2= y*y;
        float a= (float)Math.sqrt(x2+y2);
        System.out.println(a);
    }
}