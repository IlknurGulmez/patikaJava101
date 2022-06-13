package NotOrtalamasi;
import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {


        int Matematik,Fizik,Kimya,Turkce,Tarih,Muzik;

        Scanner input = new Scanner(System.in);

        String not1 ="Matematik Notunuz: ";
        System.out.print(not1);
        Matematik=input.nextInt();


        String not2 ="Fizik Notunuz: ";
        System.out.print(not2);
        Fizik=input.nextInt();


        String not3 ="Kimya Notunuz: ";
        System.out.print(not3);
        Kimya=input.nextInt();


        String not4 ="Türkçe Notunuz: ";
        System.out.print(not4);
        Turkce=input.nextInt();


        String not5 ="Tarih Notunuz: ";
        System.out.print(not5);
        Tarih=input.nextInt();


        String not6 ="Müzik Notunuz: ";
        System.out.print(not6);
        Muzik=input.nextInt();

        int top=Matematik+Fizik+Kimya+Turkce+Tarih+Muzik;
        double ort= top/6.0;
        System.out.println("Ortalamanız:" + ort);

        boolean durum = ort >= 60;
        System.out.println(durum ? "Geçti":"Kaldı");







    }



}
