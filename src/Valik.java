import java.util.Scanner;

/**
 * Created by jekaterinal on 23.10.16.
 */
public class Valik {

    public static void main(String[] args) {
        Scanner klaviatuur = new Scanner(System.in);

        System.out.println("Mis on sinu nimi?");
        String nimi = klaviatuur.nextLine();            //nimi on muutuja; .next ei luba panna tuhiku, hupab teisele kusimusele
                                                        //seeparast tuleb kirjutada .nextLine
        System.out.println("Mis on sinu vanus?");
        int vanus = klaviatuur.nextInt();               //vanus on muutuja
        System.out.println("Mis on sinu palganumber?");
        double palk = klaviatuur.nextDouble();          //palk on muutuja

        System.out.println("Tere, " + nimi + ". Sinu vanus on " + vanus + " ja palka saad " + palk);


        String nimi1 = "Jekaterina";
        int vanus1 = 28;
        double palk1 = 500;

        //%s - string; %d - decimal (=int); %f - float (=double); 5n on vaja selleks, et tekts kaiks jargmisele reale,
        //muidu terve tekst laheb uhte ritta
        System.out.printf("Kasutaja nimi on %s, tema vanus on %d ja palgaks saab %f%n", nimi1, vanus1, palk1);
        System.out.printf("Kasutaja nimi on %s, tema vanus on %d ja palgaks saab %f%n", nimi1, vanus1, palk1);
        System.out.printf("Kasutaja nimi on %s, tema vanus on %d ja palgaks saab %f%n", nimi1, vanus1, palk1);
    }
}
