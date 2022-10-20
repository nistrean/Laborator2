package mostenire2;

public class Automobil extends Vehicul{
    private String nume;
    private Integer putere;

    public Automobil(String nume,String culoare, Integer nrUsi,Integer nrRoti,Integer putere){
        super(culoare,nrUsi,nrRoti);
        this.nume = nume;
        this.putere = putere;
    }

    public Integer getPutere() {
        return putere;
    }

    public void setPutere(Integer putere) {
        this.putere = putere;
    }

    @Override
    public String toString() {
        return "Automobil: " + super.toString() +
                ", putere = " + putere;
    }
}
