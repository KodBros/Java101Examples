package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Değer gir : ");
        int sayi = klavye.nextInt();
        System.out.println("");
        for (int i = sayi; i > 0; i--) {// üst kısım
            for (int j = i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (sayi+1) - i; j++) { // orta yıldıza kadar olan yıldızları yazdırmak için
                System.out.print("*");

            }
            for (int k = 0; k < sayi - i; k++) { // orta yıldızdan sonrasını yazdırmak için
                System.out.print("*");
            }
            System.out.println("");  
        }
        for (int i = 1; i < sayi; i++) { // alt kısım
            for (int j = 0 ; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 2*sayi-1-i; j > i; j--) {
                System.out.print("*");
            } 
            System.out.println("");
        }
    }
}
