//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println(addieren(12.324, 34.122, 343.64));
        System.out.println(addieren(1, 2, 3));

        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(a^b);

        boolean ergebnis = (meinRandom() > 0.5) || a;
    }

    public static double meinRandom(){
        double ausgabe = Math.random();
        System.out.println(ausgabe);
        return ausgabe;
    }

    public static double durchschnittBerechnen(double zahl1, double zahl2, double zahl3){
        var summe = zahl1 + zahl2 + zahl3;
        var ergebnis = summe / 3;
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

