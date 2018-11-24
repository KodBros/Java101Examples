package SortingAlgorithms;

public class Main {

    public static void main(String[] args) {
        int dizi[] = {5, 3, 64, 2, 56, 1, 0, 6, 4, -5, -7};
        doBubbleSort(dizi);
        doSelectionSort(dizi);
    }

    public static void doBubbleSort(int[] dizi) {
        for (int x = 0; x < dizi.length; x++) {
            for (int i = 1; i < dizi.length; i++) {
                if (dizi[i - 1] > dizi[i]) {
                    int temp = dizi[i - 1];
                    dizi[i - 1] = dizi[i];
                    dizi[i] = temp;
                }
            }
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+" ");
        }

    }

    public static void doSelectionSort(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < dizi.length; i++) {
            int min = i;
            for (int j = i; j < dizi.length; j++) {
                if (dizi[j] < dizi[min]) {
                    min = j;
                }
            }
            int tmp = dizi[i];
            dizi[i] = dizi[min];
            dizi[min] = tmp;
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
    }
}
