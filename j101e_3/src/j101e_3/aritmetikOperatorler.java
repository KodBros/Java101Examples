package j101e_3; 
public class aritmetikOperatorler { 
    public static void main(String[] args) {
      int a = 10;
      int b = 5;

      System.out.println("a + b: " + (a + b) );
      System.out.println("a - b: " + (a - b) );
      System.out.println("a * b: " + (a * b) ); 
      System.out.println("a / b: " + (a / b) );
      System.out.println("a % b: " + (a % b) ); //% operatörününe mod alma işlemi denilmektedir. a sayısının b sayısına bölümünden kalanı verir.
      System.out.println("");
      
      b = a;// a sayısını b sayısına atama işlemi yapılıyor ve b sayısı artık a sayısına dönüşmüş oluyor.
      System.out.println(b);
      
      b += a;// bu işlem b = b + a işleminin kısaltmasıdır.
      System.out.println(b);
	      
      b -= a;// bu işlem b = b - a işleminin kısaltmasıdır.
      System.out.println(b);
	      
      b *= a;// bu işlem b = b * a işleminin kısaltmasıdır.
      System.out.println(b);
	      
      b /= a;// bu işlem b = b / a işleminin kısaltmasıdır.
      System.out.println(b);
	      
      b %= a;// bu işlem b = b % a işleminin kısaltmasıdır.
      System.out.println(b);
      
      a++;//a nın değerini 1 artırır , aynı şekilde b yide böyle artırabiliriz.
      System.out.println(a);
       
      int c = (--a)+5; // a değişkenini önce eksiltir, sonra işleme sokar.
      System.out.println(c);
    }   
}
