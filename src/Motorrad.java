public class Motorrad extends Fahrzeug {

    private boolean hatBeiwagen;

    public Motorrad(String marke, int baujahr, boolean hatBeiwagen){
        super(marke, baujahr);
        this.hatBeiwagen = hatBeiwagen;
    }

    public void setBaujahr(int value){
        baujahr = value;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Beiwagen: " + (hatBeiwagen ? "Ja" : "Nein"));
    }

    @Override
    public void fahren(float dauer) {
        System.out.println("Das Motorrad fährt");
    }
}
