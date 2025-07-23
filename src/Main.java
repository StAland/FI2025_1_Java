public class Main {

    public static void main(String[] args) {
        int zahl = 1;
        int inkrement = 1;
        while(zahl < 1000){
            if(zahl % 2 == 0){
                zahl /= 2;
                System.out.println(zahl);
                continue;
            }
            zahl += inkrement;
            System.out.println(zahl);
            inkrement++;
        }

//        for(int i = 1; i <= 100; i++){
//            if(i == 77){
//                break;
//            }
//            if (i % 7 == 0){
//                System.out.println("beep");
//                continue;
//            }
//            System.out.println(i);
//        }

//        int[] zahlen = {10, 25, 235, 912, 23};
//        int[] zahlen2 = {324, 12, 123, 3443};
//        int summe = 0;
//        for (int zahl : zahlen2){
//            summe += zahl;
//        }
//        System.out.println(summe);
    }
}

