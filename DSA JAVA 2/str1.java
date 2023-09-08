class firstclass{
    public static void sts(String a){
        for (int i=0; i<a.length();i++){
            System.out.println(a.charAt(i));
        }System.out.println();
    }
    public static void main(String[] args) {
        String a= "chirag maglik";
       // System.out.println(a.charAt(4));----------------->a
       // System.out.println(a.charAt(2));----------------->i
       sts(a);


    }

}