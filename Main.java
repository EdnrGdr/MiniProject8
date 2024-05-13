import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*

        Kullanıcıdan Vize1, Vize2 ve Final notunu alarak bir harf hesapkama sistemi yapalım.
        Ayrıca Kullanıcıdan okuldaki genel ortalamasını alarak,

        DD alma ve 2.50 nin altında olma koşuluna göre ekrana bir tavsiye mesajı yazdırın..

        Vize1 toplam notun %30 una etki edecek,
        Vize2 toplam notun %30 una etki edecek,
        Final toplam notun %40 ına etki edecek,

         */


        Scanner scanner = new Scanner(System.in);
        int Vize1;
        int Vize2;
        int Final;
        double ortalama;



        System.out.println("***************");
        System.out.print("Lütfen Vize1 Notunuzu Giriniz..:");
        Vize1 = scanner.nextInt();
        System.out.print("Lütfen Vize2 Notunuzu Giriniz..:");
        Vize2 = scanner.nextInt();
        System.out.print("Lütfen Final Notunuzu Giriniz..:");
        Final = scanner.nextInt();
        System.out.print("Okul Ortalamanıızı Giriniz..:");
        ortalama= scanner.nextDouble();


        double ToplamNot = ((double)(Vize1 * 30) / 100) + ((double)(Vize2 * 30) / 100) + ((double)(Final * 40) / 100);

        if (ToplamNot >= 90) {

            System.out.println("Harf Notunuz: AA");

        } else if (ToplamNot >= 85) {

            System.out.println("Harf Notunuz: BA");

        } else if (ToplamNot >= 80) {

            System.out.println("Harf Notunuz: BB");

        } else if (ToplamNot >= 75) {

            System.out.println("Harf Notunuz: CB");



        }else if (ToplamNot >= 70) {

            System.out.println("Harf Notunuz: CC");


        }else if (ToplamNot >= 65) {

            System.out.println("Harf Notunuz: DC");


        } else if (ToplamNot >= 60) {

            System.out.println("Harf Notunuz: DD");

            if ( ortalama < 2.50) {

                System.out.println("DD Aldınız, Not Ortalamanız Düşüktür.. Dersi Tekrar Alabilirsiniz..");


            }

        } else if ( ToplamNot >= 55) {
            System.out.println("Harf Notunuz: FD... KALDINIZ..");


        } else {
            System.out.println("Harf Notunuz: FF... KALDINIZ..");


    }
    }
}