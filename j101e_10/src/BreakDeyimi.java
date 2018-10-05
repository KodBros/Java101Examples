public class BreakDeyimi {
    
    public static void main(String[] args) {
        int a = 0;
        while (a <= 100) {
            System.out.print(a + " ");
            if (a == 2) {
                break;// belirtilen şart geçekleştiğinde break komutu sayesinde döngüden direk çıkış yapılabilir.
            }
            a++;
        }
        System.out.println("Döngüden çıkıldı.");
    }
}
