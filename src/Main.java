public class Main {

    public static void main(String[] args) {
        var motor = new Motor(225, 13);
        var bremse = new Bremsen(36);
        var auto = new Auto(motor, bremse, 3560.3, 0);

        auto.beschleunigen(25, 3);
        System.out.println(auto.getAktuelleGeschwindigkeit());
        auto.fahren(45);
        System.out.println(auto.getKilometerstand());
    }
}
