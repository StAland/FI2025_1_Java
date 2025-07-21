//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //Datentypen:
        int x = 42;         //Ganzzahl 32 bit
        long y = 10000000;  //Ganzzahl 64 bit
        short z = 12;       //Ganzzahl 16 bit
        byte b = 10;        //Ganzzahl  8 bit
        double d = 3.14;    //Gleitkommazahl 64 bit
        float f = 1.5f;     //Gleitkommazahl 32 bit
        char c = 'A';       //einzelnes Unicode-Zeichen
        boolean bo = false; //Wahrheitswert
        String s = "Hallo"; //Zeichenketten




        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}