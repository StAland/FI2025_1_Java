public class Fahrzeug {
    protected String marke;
    protected int baujahr;

    public Fahrzeug(String marke, int baujahr){
        this.marke = marke;
        this.baujahr = baujahr;
    }

    public void starteMotor(){
        System.out.println("Motor startet");
    }

    public void info(){
        System.out.println("Marke: " + marke + ", Baujahr: " + baujahr);
    }
}
