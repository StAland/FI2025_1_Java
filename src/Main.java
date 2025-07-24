import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var ich = new Person("Steffen");
        var meineFrau = new Person("Tanja");
        var meinKonto = new Bankkonto(ich, 1200);
        int meinKontostand = meinKonto.kontostandAbrufen(meineFrau);
        //int meinKontostand = meinKonto.kontostand;
        System.out.println(meinKontostand);
    }
}

