public class Motor {
    private int maxGeschwindigkeit;
    private int maxBeschleunigung;

    public Motor(int maxGeschwindigkeit, int maxBeschleunigung) {
        this.maxGeschwindigkeit = maxGeschwindigkeit;
        this.maxBeschleunigung = maxBeschleunigung;
    }

    public int beschleunigen(int aktuelleGeschwindigkeit, int beschleunigung, int dauer){
        var neueBeschleunigung = beschleunigung > maxBeschleunigung ? maxBeschleunigung : beschleunigung;
        System.out.println("Wir versuchen mit " + beschleunigung + " zu beschleunigen. Können aber nur mit " + this.maxBeschleunigung + " beschleunigen");
        var neueGeschwindigkeit = aktuelleGeschwindigkeit + neueBeschleunigung * dauer;
        neueGeschwindigkeit = neueGeschwindigkeit > maxGeschwindigkeit ? maxGeschwindigkeit : neueGeschwindigkeit;
        return neueGeschwindigkeit;
    }
}
