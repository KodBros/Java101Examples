package j101e_7;

public class WhileDongusu {

    public static void main(String[] args) {
        int j = 10;
        while (j > 1) {
            System.out.print(j + " ");
            j++;
        }

        System.out.println("");

        int i = 10;
        while (i > 1) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println("");

        int a[] = {2, 11, 45, 9};
        int x = 0;
        while (x < 4) {
            System.out.print(a[x] + " ");
            x++;
        }

        System.out.println("");

        while (true) {
            //sonsuz while döngüsü...
            break;
        }
    }
}
