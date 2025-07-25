public class AutoFabrik {
    public enum AutoModell{
        Ford_Fiesta,
        Mazda3,
        Ferrari
    }

    public static Auto autoBauen(AutoModell modell){
        switch (modell){
            case Ford_Fiesta:{
                var motor = new Motor(175, 13);
                var bremse = new Bremsen(25);
                return new Auto(motor,bremse, 0, 0, "Ford Fiesta", 2021);
            }
            case Ferrari:{
                var motor = new Motor(250, 30);
                var bremse = new Bremsen(35);
                return new Auto(motor,bremse, 0, 0, "Ferarri", 2019);
            }
            case Mazda3:{
                var motor = new Motor(220, 22);
                var bremse = new Bremsen(30);
                return new Auto(motor,bremse, 0, 0, "Mazda 3", 2010);
            }
            default:{
                throw new IllegalArgumentException();
            }
        }
    }
}
