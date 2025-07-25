import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        var motorrad = new Motorrad("Herley", 1989, false);
        var lkw = new LKW("keine Ahnung", 2023, 25);
        var auto = AutoFabrik.autoBauen(AutoFabrik.AutoModell.Ferrari);
        List<Fahrzeug> fahrzeuge = new ArrayList<Fahrzeug>();
        fahrzeuge.add(motorrad);
        fahrzeuge.add(lkw);
        fahrzeuge.add(auto);

        for (Fahrzeug fahrzeug : fahrzeuge){
            fahrzeug.info();
            fahrzeug.fahren(10);
        }
    }
}
