package incapsulare;

public class Student {

    private String nume;
    private String prenume;
    private String grupa;
    private Integer notaExamen;

    public Student(String nume,String prenume,String grupa,Integer notaExamen){
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.notaExamen = notaExamen;
    }

    public String getNume(){
        return nume;
    }

    public void setNume(String nume){
        this.nume = nume;
    }

    public String getPrenume(){
        return prenume;
    }

    public void setPrenume(String prenume){
        this.prenume = prenume;
    }

    public String getGrupa(){
        return grupa;
    }

    public void setGrupa(String grupa){
        this.grupa = grupa;
    }

    public Integer getNotaExamen(){
        return notaExamen;
    }

    public void setNotaExamen(Integer notaExamen){
        this.notaExamen = notaExamen;
    }

    public String toString(){
        return "Student : " + nume + " " + prenume + ", grupa " + grupa + " Nota la examen: " + notaExamen;
    }
}
