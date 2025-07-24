public class Haus {
    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        if (rooms < 1){
            //Fehler auswerfen
        }
        this.rooms = rooms;
    }

    private int rooms;
    private boolean isLocked;

    public Haus(int rooms, boolean isLocked){
        this.rooms = rooms;
        this.isLocked = isLocked;
    }

    public Haus(int rooms){
        this.rooms = rooms;
        this.isLocked = false;
    }

    public void openDoor(){
        if(this.isLocked){
            System.out.println("Die Tür ist abgeschlossen und lässt sich nicht öffnen");
        }
        else{
            System.out.println("Du hast die Tür geöffnet");
        }
    }
}
