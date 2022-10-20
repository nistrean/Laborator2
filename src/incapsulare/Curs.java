package incapsulare;

public class Curs {

    private String denumire;
    private String facultate;
    private Integer semestru;
    private Integer nrOre;

    public Curs(String denumire,String facultate,Integer semestru,Integer nrOre){
        this.denumire = denumire;
        this.facultate = facultate;
        this.semestru = semestru;
        this.nrOre = nrOre;
    }

    public String getDenumire(){
        return denumire;
    }

    public void setDenumire(String denumire){
        this.denumire = denumire;
    }

    public String getFacultate(){
        return facultate;
    }

    public void setFacultate(String facultate){
        this.facultate = facultate;
    }

    public Integer getSemestru(){
        return semestru;
    }

    public void setSemestru(Integer semestru){
        this.semestru = semestru;
    }

    public Integer getnrOre(){
        return nrOre;
    }

    public void setNrOre(Integer nrOre){
        this.nrOre = nrOre;
    }

    public String toString(){
        return "Curs: " + denumire + ", " + facultate + ", Semestrul " + semestru + ", nr.ore: " + nrOre;
    }
}
