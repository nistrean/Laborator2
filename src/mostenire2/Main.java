package mostenire2;

public class Main {
    public static void main(String[] args) {
        Vehicul vehicul = new Vehicul("Negru", 4,4);
        System.out.println("Vehicul " + vehicul);

        Automobil Audi = new Automobil("Audi A6", "Negru",4,4,230);
        System.out.println(Audi);

        Bicicleta bicicleta = new Bicicleta("Rosie",2);
        System.out.println(bicicleta);

        Avion avion = new Avion(true,"Alb",6,3);
        System.out.println(avion);
    }
}
