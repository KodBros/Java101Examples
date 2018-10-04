public class ContinueDeyimi { 
    public static void main(String[] args) {
        for (int i=0; i<=6; i++)//if içinde belirtilen durum gerçekleştiğinde döngü o işlemi yapmayıp sıradaki işleme geçer.
	{
           if (i==4)
           {
	      continue;
	   }

           System.out.print(i+" ");
	}
    }
}
