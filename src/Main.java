public class Main {

    public static void main(String[] args) {

        var auto = AutoFabrik.autoBauen(AutoFabrik.AutoModell.Ferrari);

        auto.beschleunigen(25, 3);
        System.out.println(auto.getAktuelleGeschwindigkeit());
        auto.fahren(45);
        System.out.println(auto.getKilometerstand());
    }
}
