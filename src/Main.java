public class Main {

    public static void main(String[] args) {
        double taxes = berechneSteuer(1000.0, 0.17);
        System.out.println(taxes);
        taxes = berechneSteuer(1000.0);
        System.out.println(taxes);
    }

    public static double berechneSteuer(double amount, double tax){
        double taxes = amount * tax;
        // Hier kommt noch ne ganz tolle Überprüfung rein
        return taxes;
    }

    public  static double berechneSteuer(double amount){
        return berechneSteuer(amount, 0.19);
    }

}

