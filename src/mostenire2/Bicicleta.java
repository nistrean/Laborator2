package mostenire2;

public class Bicicleta extends Vehicul{

    public Bicicleta(String culoare, Integer nrRoti){
        super(culoare,0,nrRoti);
    }

    @Override
    public String toString() {
        return "Bicicleta: " + super.toString();
    }
}
