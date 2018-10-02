public class ForDongusu { 
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+ " "); 
        }
        System.out.println("");
       
        for (int i = 10; i > 0; i--) {
            System.out.print(i+ " ");
        }
        System.out.println(""); 
        
        int a[]={1,2,3,4,5};
        for (int elemanlar : a) {
           System.out.print(elemanlar+ " ");
        }
        
        for ( ; ; ) {
            //Sonsuz döngüdür. İçine yazılan kodu sonsuza kadar çalıştırır. 
          break;
        }
    }
}
