package HW1;
import java.util.Scanner;

public class Odev1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the N value : ");          // N değeri girilir.
        int N = scanner.nextInt();

        for (int a = 1; a <= N; a++) {                     // İlk satır için for döngüsü..
            System.out.print("*");                         // İlk satırda N kadar * yazılır
        }
        System.out.println();                              // Alt satıra geçilir.

        for (int b = 1; b <= N-2; b++) {                   // Gövde kısmı için..
            System.out.print("*");                         // İlk ve son satır harici gövdenin ilk sütununda * bulunur

            for (int c = 1; c <= (N-1)/2; c++) {           // Gerekli sayıda + yazılır ancak en başta artılar en sonda boşluklar kalır.
                System.out.print("+");
            }
            for (int d = 1; d <= (N-2)/2; d++) {           // Gerekli sayıda boşluk yazılır ancak + lardan sonra..
                System.out.print(" ");
            }

            System.out.print("*");
            System.out.println();                          // Son satıra geçilir
        }
        int f=1;
        while (N!=1 && f <= N) {
            System.out.print("*");                         // N kadar son satıra * yazılır.
         f++;
        }
    }
}

