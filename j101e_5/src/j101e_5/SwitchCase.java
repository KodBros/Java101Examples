package j101e_5; 
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
     Scanner klavye = new Scanner(System.in);
     
     System.out.print("Yiyecek veya içecek ne istersiniz ? : ");
     String yemekSecimi = klavye.nextLine();
     
     switch(yemekSecimi)
     {
        case "çorba":
	  System.out.println("Çorba çeşitleri 5 lira.");
          break;
	case "kebap":
	  System.out.println("Kebap çeşitleri 10 lira.");
          break;
	case "künefe":
	  System.out.println("Künefe = 5 lira.");
          break;
        case "ayran":
	  System.out.println("Ayran = 2 lira.");
          break;
        default:
	  System.out.println("Listemizde bulunmamaktadır.");
      }   
    }
}
