import java.util.*;
class firstclass{
    
    public static void main(String[] args) {
        int a[]={65,76,8,79,0,34,56,78,23,4,2};
        int key= 76;
        int start= 0;
        int end= a.length-1;
        while( start <= end){
            int mid= (start+end)/2;
            if (a[mid]==key){
                System.out.print(mid);
              
            }
            if(mid<key){
                start=mid+1;
                
            }
            if(mid>key){
                end=mid-1;
            }
        }

    }  
    
}