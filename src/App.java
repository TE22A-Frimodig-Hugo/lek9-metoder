import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        // a)
        int resultat1 = addera(14, 34);
        System.out.println("Resultat av addition: " + resultat1);

        int resultat2 = addera(1212, 333);
        System.out.println("Resultat av addition: " + resultat2);

        // b)
        int resultat3 = minus(50, 20);
        System.out.println("Resultat av subtraktion: " + resultat3);
    }

    // Metod för att addera två tal
    static int addera(int tal1, int tal2) {
        return tal1 + tal2;
    }

    // Metod för att subtrahera två tal
    static int minus(int tal1, int tal2) {
        return tal1 - tal2;
        
    }
}
