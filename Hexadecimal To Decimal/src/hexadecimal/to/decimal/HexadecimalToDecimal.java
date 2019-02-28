package hexadecimal.to.decimal;

import java.util.Scanner;

public class HexadecimalToDecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Gir : ");
        String hexaSayi = input.next();
        System.out.println("Decimal Hali : " + parseHexa(hexaSayi));
    }

    public static int parseHexa(String hexaSayi) {
        int decimalSayi = 0;
        String dizi[] = hexaSayi.split("");
        int rakam[] = new int[dizi.length];
        try {
            for (int i = 0; i < dizi.length; i++) {
                switch (dizi[i]) {
                    case "A":
                        dizi[i] = "10";
                        break;
                    case "B":
                        dizi[i] = "11";
                        break;
                    case "C":
                        dizi[i] = "12";
                        break;
                    case "D":
                        dizi[i] = "13";
                        break;
                    case "E":
                        dizi[i] = "14";
                        break;
                    case "F":
                        dizi[i] = "15";
                        break;
                    default:
                        break;
                }
            }
            for (int i = 0; i < dizi.length; i++) {
                rakam[i] = Integer.parseInt(dizi[i]);
            }
            int j = 0;
            for (int i = dizi.length - 1; i >= 0; i--) {
                decimalSayi += rakam[i] * Math.pow(16, j);
                j++;
            }
        } catch (Exception e) {
            System.out.println("Büyük küçük harf girdisine dikkat edin.");
        }
        return decimalSayi;
    }
}
