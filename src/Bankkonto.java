public class Bankkonto {
    private Person besitzer;
    private int kontostand;

    public Bankkonto(Person besitzer, int kontostand) {
        this.besitzer = besitzer;
        this.kontostand = kontostand;
    }

    public int kontostandAbrufen(Person abrufer){
        if(abrufer.getName() == besitzer.getName()){
            return this.kontostand;
        }
        return -1;
    }
}
