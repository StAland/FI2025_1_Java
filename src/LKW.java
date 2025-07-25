public class LKW extends Fahrzeug{
    private double ladegewicht;

    public LKW(String marke, int baujahr, double ladegewicht) {
        super(marke, baujahr);
        this.ladegewicht = ladegewicht;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Ladegewicht: " + ladegewicht + " Tonnen");
    }
}
