public class Student {
    private String navn;
    private int aargang;


    Student(String name, int aargang){
        this.navn = name;
        this.aargang = aargang;
    }

    public String getName() {
        return navn;
    }

    public void setName(String name) {
        this.navn = name;
    }

    public int getAargang() {
        return aargang;
    }

    public void setAargang(int aargang) {
        this.aargang = aargang;
    }
}
