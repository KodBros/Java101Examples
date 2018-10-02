package j101e_4; 
import java.util.Scanner;
public class IfElse { 
    public static void main(String[] args) {
        
        Scanner klavye = new Scanner(System.in);//Klavyeden girdi alabilmek için Scanner kütüphanesinden bir nesne oluşturduk.
        
        System.out.print("Bir sayı gir =  ");
        int a = klavye.nextInt();//int tipinde bir a değişkeni oluşturduk girdimizin bir sayı olacağını belirttik.
        
        if (a < 100) {
            System.out.println("Bu sayı 100 den küçük.");
        }
        
        else if (a == 100) {
            System.out.println("Bu sayı 100 dür.");
        }
        
        else{
            System.out.println("Bu sayı 100 den büyük.");
        }
    }
}
