import java.util.Scanner;

class firstclass{
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<a.length;i++){
            for (int j=0; j<a[0].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for (int i=0; i<a.length;i++){
            for (int j=0; j<a[0].length;j++){
                System.out.print(a[i][j] +" ");
            }System.out.println();

        }
    }
}