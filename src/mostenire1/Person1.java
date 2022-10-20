package mostenire1;

public class Person1 {

    private String nume;
    private String prenume;
    private Integer virsta;
    private Boolean diplomaBAC;

    public Person1(String nume,String prenume,Integer virsta,Boolean diplomaBAC) {
        this.nume = nume;
        this.prenume = prenume;
        this.virsta = virsta;
        this.diplomaBAC = diplomaBAC;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getVirsta() {
        return virsta;
    }

    public void setVirsta(Integer virsta) {
        this.virsta = virsta;
    }

    public Boolean getDiplomaBAC() {
        return diplomaBAC;
    }

    public void setDiplomaBAC(Boolean diplomaBAC) {
        this.diplomaBAC = diplomaBAC;
    }

    public String toString(){
        return "Person: " + nume + " " +
                prenume + ", " + virsta +
                " ani, detine diploma de bac: " + diplomaBAC;
    }
}
