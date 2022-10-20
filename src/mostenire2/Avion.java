package mostenire2;

public class Avion extends Vehicul{
    private Boolean aripi = true;

    public Avion(Boolean aripi, String culoare, Integer nrUsi, Integer nrRoti){
        super(culoare,nrUsi,nrRoti);
        this.aripi  = aripi;
    }

    @Override
    public String toString() {
        return "Avion: " + "aripi = " + aripi + super.toString();
    }
}
