public class AsalSayilar {
    public static void main(String[] args) {
        int sayac=0;
        for(int i=0 ; i<=100 ; i++){
            sayac=0;
            for(int k=1 ; k<=i ; k++){
                if(i % k == 0){
                    sayac++;
                }
            }
            if(sayac == 2){
                System.out.print( i + " ");
            }
        }
    }
}
