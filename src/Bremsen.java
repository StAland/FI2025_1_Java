public class Bremsen {
    public Bremsen(int beschleunigung) {
        this.maxBeschleunigung = beschleunigung;
    }

    private int maxBeschleunigung;

    public int bremsen(int aktuelleGeschwindigkeit, int beschleunigung, int dauer){
        var neueBeschleunigung = beschleunigung > maxBeschleunigung ? maxBeschleunigung : beschleunigung;
        var neueGeschwindigkeit = aktuelleGeschwindigkeit - neueBeschleunigung * dauer;
        neueGeschwindigkeit = neueGeschwindigkeit < 0 ? 0 : neueGeschwindigkeit;
        return neueGeschwindigkeit;
    }
}
