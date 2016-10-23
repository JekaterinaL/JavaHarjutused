import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by jekaterinal on 23.10.16.
 */
public class Massiiv {

    public static void main(String[] arg) {

        int[] a = {1, 5, 3, 6};
        String[] b = {"Tere", "uus", "maailm"};

        System.out.println(Arrays.toString(a)); //muudab massiivi tekstiks
        System.out.println(a[3]);               //otsib massiivist numbri kolmandal positsioonil (loendamine 0-st)


        ArrayList c = new ArrayList();
        c.add(5);
        c.add(7);
        c.add(1);
        c.add("sonasid");

        System.out.println(c.get(3));           //ArrayListi puhul tuleb kirjutada meetodi c.get


        //Voti : Vaartus, Tere : Hello
        HashMap<String, HashMap<String, String>> dictionary = new HashMap<>();
        HashMap<String, String> translation = new HashMap<>();

        translation.put("en", "Hello");
        translation.put("et", "Tere");
        translation.put("es", "Hola");
        translation.put("hi", "Namaste");

        dictionary.put("Hello", translation);

        translation = new HashMap<>(); //selleks, et olnuks seost eelmise HashMapiga, et saaks seal muudatused teha

        translation.put("en", "House");
        translation.put("et", "Maja");
        translation.put("es", "Casa");
        translation.put("hi", "Ghar");

        dictionary.put("House", translation);

        System.out.println(dictionary);


    }
}
