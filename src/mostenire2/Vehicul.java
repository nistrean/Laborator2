package mostenire2;

public class Vehicul {

    private String culoare;
    private Integer nrUsi;
    private Integer nrRoti;

    public Vehicul(String culoare, Integer nrUsi,Integer nrRoti){
        this.culoare = culoare;
        this.nrUsi = nrUsi;
        this.nrRoti = nrRoti;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public Integer getNrRoti() {
        return nrRoti;
    }

    public void setNrRoti(Integer nrRoti) {
        this.nrRoti = nrRoti;
    }

    @Override
    public String toString() {
        return " Culoare = " + culoare +
                ", nrUsi = " + nrUsi +
                ", nrRoti = " + nrRoti;
    }
}
