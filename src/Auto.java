public class Auto {
    private Motor motor;
    private Bremsen bremse;
    private double kilometerstand;
    private int aktuelleGeschwindigkeit;

    public int getAktuelleGeschwindigkeit() {
        return aktuelleGeschwindigkeit;
    }

    /**
     *
     * @return Gibt den aktuellen Kilometerstand zurück
     */
    public double getKilometerstand() {
        return kilometerstand;
    }

    public Auto(Motor motor, Bremsen bremse, double kilometerstand, int aktuelleGeschwindigkeit) {
        this.motor = motor;
        this.bremse = bremse;
        this.kilometerstand = kilometerstand;
        this.aktuelleGeschwindigkeit = aktuelleGeschwindigkeit;
    }

    /**
     *
     * @param min Dauer in Minuten
     */
    public void fahren(float min){
        this.kilometerstand += this.aktuelleGeschwindigkeit * min/60;
    }

    /**
     * Beschleunigt das Auto abhängig von der Beschleunigung und der Dauer
     * @param beschleunigung Die Beschleunigung kann nicht die MaxBeschleunigung des Motors übersteigen
     * @param dauer In Sekunden
     */
    public void beschleunigen(int beschleunigung, int dauer){
        if (beschleunigung < 0){
            System.out.println("Die beschleunigung darf nicht negativ sein");
            //Fehler ausgeben
            return;
        }
        this.aktuelleGeschwindigkeit = this.motor.beschleunigen(this.aktuelleGeschwindigkeit, beschleunigung, dauer);
    }

    public void bremsen(int beschleunigung, int dauer){
        if (beschleunigung < 0){
            System.out.println("Die beschleunigung darf nicht negativ sein");
            //Fehler ausgeben
            return;
        }
        this.aktuelleGeschwindigkeit = this.bremse.bremsen(this.aktuelleGeschwindigkeit, beschleunigung, dauer);
    }
}
