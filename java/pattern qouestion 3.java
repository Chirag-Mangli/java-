class firstclass{
    public static void main(String[] args) {
/*
 1
 12
 123
 1234
 12345

 */
//--------------------------------------------------------------
 /*       for (int i=1; i<=5; i++){
            for (int j= 1; j<=i;j++){
                System.out.print(j);
            }System.out.println();
        }*/
//---------------------------------------------------------------
    char a= 'A';
    for ( int i = 1; i<=5; i++){
        for (int j = 1; j<= i; j++){
            System.out.print(a);
            a++;                 // a++ usw bcause   inchrement a to b   b to c
        }System.out.println();

    }


    }
}