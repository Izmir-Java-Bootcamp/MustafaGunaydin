package HW2;
import java.util.Scanner;


public class Odev2 {

    public static void main(String[] args) {
        int index1, index2, index3, i = 0;
        String sub1, sub2;


        Scanner scanner = new Scanner(System.in);                                                   // input alabilmek için Scanner kütüphanesi eklendi.


        while (i < 1) {                                                                             // Sürekli değer girilebilmesi için i=1 olana kadar döngüye alındı.
            System.out.print("Enter the String Value : ");                                          // Kullanıcı değeri girer.
            String string = scanner.nextLine();                                                     // Boşluklar dahil input alabilmek için nextLine kullanıldı. Değer string değişkenine atandı.
            index1 = string.indexOf('s');                                                           // string değişkeni içindeki ilk 's' karakterinin pozisyonu index1 değişkenine atandı.
            if (index1 != -1) {                                                                     // string içerisinde 's' karakteri bulunursa if koşuluna girer.
                sub1 = string.substring(index1);                                                    // Daha sonra 's' karakterinin bulunduğu noktadan itibaren substring'e yani sub1 değikenine atanır.
                index2 = sub1.indexOf('h');                                                         // sub1 değişkeninde 'h' karakteri aranır. Var ise bulunduğu konum index2'ye atanır.

                if (index2 != -1) {                                                                 // 'h' karakteri varsa koşula girer.
                    sub2 = sub1.substring(index2);                                                  // 'h' karakterinin bulunduğu noktadan itibaren sub2 değişkenine atanır.
                    index3 = sub2.indexOf('l');                                                     // sub2 değişkeninde 'l' karakteri aranır. Var ise bulunduğu konum index3'ye atanır.

                    if (index3 != -1) {                                                             // 'l' karakteri varsa koşula girer.
                        System.out.println("s*h*l occurs in " + string);                            // bütün karakterler bulunduğu için, koşul string'de gözüktü yazdırılır.
                    } else if (index3 == -1) {                                                      // 'l' karakteri yoksa koşula girer.
                        System.out.println("s*h*l does NOT occur in " + string);                    // 'l' karakteri olmadı için koşul string'de bulunmadı yazdırılır.
                    }

                } else if (index2 == -1) {                                                          // 'h' karakteri yoksa koşula girer.
                    System.out.println("s*h*l does NOT occur in " + string);                        // 'h' karakteri olmadı için koşul string'de bulunmadı yazdırılır.
                }

            } else if (index1 == -1 && !string.equals("exit")) {                                    // 'h' karakteri yoksa koşula girer ve exit yazılmadıysa koşula girer.
                System.out.println("s*h*l does NOT occur in " + string);                            // 's' karakteri olmadı için koşul string'de bulunmadı yazdırılır.

            } else if (string.equals("exit")) {                                                     // exit yazıldıysa koşula girer.
                i++;                                                                                // i=1 olur ve satır bitiminde while döngüsünden çıkılır.
            }

        }
    }

}
