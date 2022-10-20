package incapsulare;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nistrean","Zina", "FI-211", 10);
        System.out.println(student1.getGrupa());
        student1.setNotaExamen(9);
        System.out.println(student1);

        Curs curs1 = new Curs("CDE","FCIM",3,150);
        System.out.println(curs1.getFacultate());
        curs1.setDenumire("OOP");
        System.out.println(curs1);
    }
}
