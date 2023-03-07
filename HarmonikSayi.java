import java.util.Scanner;
public class HarmonikSayi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("***************Harmonik Sayı Bulan Porgram**************");

        System.out.print("n Sayisini Giriniz : ");
        int n;
        n = input.nextInt();

        double sonuc =0;


        for (int i=1; i<=n; n++){


            sonuc += 1/i;

        }

         System.out.print(sonuc);



    }
}
