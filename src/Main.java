import java.util.Arrays;

public class Main {
    public static void main (String args[]) {
        int[] ostukorv = {15, 28, 17, 5, 10}; //muutujad
        ostukorv[2] = 15;

        System.out.println(ostukorv[0]);


        int kiirus1 = 50; //if kasutamine arvudega
        int kiirus2 = 90;
        int kiirus3 = 110;

        if (kiirus2 > 90) {
            System.out.println("Trahv");
        }  else if (kiirus2 == 90){
            System.out.println("Vou, napikas");
        }
        else {
            System.out.println("Legaalne");
        }

        String sihtpunkt = "Tartu"; //if kasutamine sonadega (ei tohi kasutada ==, kasuta pigem s.equals (sihtpunkt.equals),
                                    // sihtpunkti valik: Tartu, Viljandi, Voru

        if (sihtpunkt.equals("Viljandi")) {
            System.out.println("Keera paremale");
        } else if (sihtpunkt.equals("Tartu")) {
            System.out.println("Keera vasakule");
        } else {
            System.out.println("Otse edasi");
        }

        int[] y = {1, 5, 7}; //if kasutamine massiivide jaoks, ei tohi kirjutada y == w, parem Arrays.equals(y,w)
        int[] w = {1, 5, 7}; //kui kirjutasin Arrays, pidin klikima selle sona peale, et importida

        if (Arrays.equals(y,w)) {
            System.out.println("Jah");
        } else {
            System.out.println("Ei ole vorde");
        }

        int a = 5; //mitme parameetri vordlemine: && apersant (kaks tingimust korraga), || pipe (uks voi teine)
        int b = 6;
        int c = 7;

        if (a == 5 && b == 6) {
            System.out.println("Tingimus on toene");
        } else {
            System.out.println("Tingimus on vaar");
        }


        int m = 0; //while tsukli kasutamine, iga tsukli tagant m on m numbri suurem, programm nii kaua prindib "Tere"
                   //ehk 4 korda, kui m on vorde voi suurem kui 10, tegevus lopetatakse
        while (m < 4) {
            System.out.println("Tere");
            m = m + 1;
        }

        int[] kiirused = {87, 91, 95, 86, 89}; //l on loendur, saime kaks trahvi, kuna oli kaks korda uletatud kiirus

        int l = 0;
        while (l < 5) {
            if (kiirused[l] > 90) {
                System.out.println("Trahv");
            }
            l = l + 1;
        }
        System.out.println("Tsukkel labi");
    }
}
