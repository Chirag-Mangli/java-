// first mehtod  they do in pervious fucntion 1

import java.util.Scanner;

/*class firstclass{
    public static void sum(){
        Scanner sc= new Scanner(System.in);
        int  a= sc.nextInt();
        int  b= sc.nextInt();
        int sum = a+b;
        System.out.println(sum);


    }
    public static void main(String[] args) {
        sum();
        
    }
}*/
// parameter method


//---------------------------------------------------------------------
/*class firstclass{
    public static void sum(int n1 , int n2 ){
        int s= n1 + n2;
        System.out.println(s);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int  a= sc.nextInt();
        int  b= sc.nextInt();
        sum(a, b);
        
    }
}*/
//-----------------------------------------------------------------------
// anthor method  by use sum varible
/*class  firstclass{
     public static int  sum(int n1, int n2){           // input a= 2 and b= 8
        int s= n1+n2;                           
        return s;                          // s give  10 
     }
        
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int  a= sc.nextInt();
        int  b= sc.nextInt();
        sum(a, b);                      // the are call                  sum(a, b)= 10 
    }*/
    
class  firstclass{
    public static int  sum(int n1, int n2){
        int s= n1+n2;
        return s;
     }
        
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int  a= sc.nextInt();
        int  b= sc.nextInt();
        int x =sum(a, b);           // we use this -------- sum (a, b)= 10   int a = 10  then  ab print karo 
        System.out.println(x);
    }
}
