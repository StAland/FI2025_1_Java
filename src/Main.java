//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println(addieren(12.324, 34.122, 343.64));
        System.out.println(addieren(1, 2, 3));
        System.out.println(durchschnittBerechnen(12.324, 34.122, 343.64));

        short a = 3;
        short b = 5;
        var c = (short)(a + b); //Buch Kapitel 2.4.10 Tabelle 2.12 + Abbildung 2.5
    }

    public static int durchschnittBerechnen(double zahl1, double zahl2, double zahl3){
        var summe = zahl1 + zahl2 + zahl3;
        int ergebnis = (int)summe / 3;
        return ergebnis;
    }

    public static double addieren(double zahl1, double zahl2, double zahl3){
        final var summe = zahl1 + zahl2 + zahl3; //final bedeutet nur eine einzige zuweisung
        return summe;
    }

    public static int addieren(int zahl1, int zahl2, int zahl3){
        var summe = zahl1 + zahl2 + zahl3;
        return summe;
    }
}

