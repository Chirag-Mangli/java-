class firstclass{
    public static void q(String a){
        int x=0, y=0;
        for(int i=0; i<a.length(); i++){
            char b=a.charAt(i);
            if (b=="S"){
                y--;
            }
            else if(b=="N"){
                y++;
            }
            else if(b=="W"){
                x--;
            }
            else{
                x++;
            }
            int x2=x*x;
            int y2= y*y;
            System.out.println((float)Math.sqrt(x2+y2));
        }
    
    }
    public static void main(String[] args) {
        String a= "WESNSEWWWNS";
        q(a);
         
    }
}