package Giris;
import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        int vize1,vize2,finalnotu;
        Scanner inp= new Scanner(System.in);
        System.out.print("1. Vize Notu:");
        vize1=inp.nextInt();
        System.out.print("2. Vize Notu:");
        vize2=inp.nextInt();
        System.out.print("Final Notu:");
        finalnotu=inp.nextInt();
        double sonuc= ((vize1* 0.25)+(vize2* 0.25)+(finalnotu*0.5));
        System.out.print("Not Ortalaması:" + sonuc );
    }
}
