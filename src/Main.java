public class Main {

    public static void main(String[] args) {
//        long fac = fact(20);
//        System.out.println(fac);
        double ergebnis = me(50.0);
        System.out.println(ergebnis);
    }

    public static double me(double number){
        if (number < 0){
            return 1;
        }
        return me(number-1) + me(number -2);
    }

    public static long fact(long number){

//        long ergebnis = 1;                    Iterativ statt rekursiv
//        for (long i = 2; i <= number; i++){
//            ergebnis *= i;
//        }

        if (number < 0){
            return -1;
        }
        if (number == 0 || number == 1){
            return 1;
        }
        long ergebnis = fact(number - 1);
        return number * ergebnis;
    }
}

