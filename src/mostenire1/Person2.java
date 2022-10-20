package mostenire1;

public class Person2 extends Person1{

    private Boolean studSup;
    private Boolean experientaLucru;

    public Person2(String nume, String prenume, Integer virsta, Boolean diplomaBAC, Boolean studSup, Boolean experientaLucru) {
        super(nume, prenume, virsta, diplomaBAC);
        this.studSup = studSup;
        this.experientaLucru = experientaLucru;
    }

    public Boolean getStudSup() {
        return studSup;
    }

    public void setStudSup(Boolean studSup) {
        this.studSup = studSup;
    }

    public Boolean getExperientaLucru() {
        return experientaLucru;
    }

    public void setExperientaLucru(Boolean experientaLucru) {
        this.experientaLucru = experientaLucru;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Studii Superioare = " + studSup +
                " Experienta Lucru = " + experientaLucru;
    }
}
